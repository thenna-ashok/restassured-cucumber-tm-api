package com.api.stepdefinition;

import com.api.model.Categories;
import com.api.model.Promotion;
import com.api.utils.TestContext;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ViewCategoryDetailsStepDefinition {
    private final TestContext testContext;
    private static final Logger LOG = LogManager.getLogger(ViewCategoryDetailsStepDefinition.class);

    public ViewCategoryDetailsStepDefinition(TestContext context) {
        this.testContext = context;
    }

    @Given("user makes a request to view details of a category")
    public void userMakesARequestToViewDetailsOfACategory() {
        testContext.response = testContext.requestSetup()
                .when().get();
        ObjectMapper objectMapper = new ObjectMapper();
        Categories categoryDetails;
        try {
            categoryDetails = objectMapper.readValue(testContext.response.asString(), Categories.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        assertNotNull("No category details returned from the API!!", categoryDetails);
        testContext.categoryDetails = categoryDetails;
        LOG.info("Category details retrieved successfully from the API");
    }

    @When("user get the response code {int}")
    public void userGetTheResponseCode(int statusCode) {
        LOG.info("Status code returned from the API: " + testContext.response.getStatusCode());
        assertEquals(Long.valueOf(statusCode), Long.valueOf(testContext.response.getStatusCode()));
    }

    @Then("user validates the response with JSON schema {string}")
    public void userValidatesTheResponseWithJSONSchema(String schemaFileName) {
        testContext.response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/" + schemaFileName + "Schema.json"));
        LOG.info("Successfully validated schema from: "+schemaFileName);
    }

    @And("user should see all the below category details")
    public void userShouldSeeAllTheBelowCategoryDetails(DataTable dataTable) {
        List<List<String>> categoriesList = dataTable.asLists();
        List<Promotion> promotionList = testContext.categoryDetails.getPromotions();

        // Iterating data table
        for(List<String> categoryDetail: categoriesList){
            assertEquals(categoryDetail.get(0), testContext.categoryDetails.getName());
            assertEquals(Boolean.parseBoolean(categoryDetail.get(1)), testContext.categoryDetails.isCanRelist());

            // Iterating Promotion list to obtain Promotion class objects
            for(Promotion promotionObj: promotionList) {
                if(promotionObj.getName().equals(categoryDetail.get(2))) {
                    assertEquals(categoryDetail.get(3), promotionObj.getDescription());
                }
            } break;
        }
        LOG.info("Successfully validated all the fields from the API response!");
    }
}
