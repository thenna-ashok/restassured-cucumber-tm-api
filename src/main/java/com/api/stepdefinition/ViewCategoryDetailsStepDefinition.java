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
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * This class covers the implementation of step definitions of view category detail steps
 */
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
        // assigning the category details values to use globally across the test session
        testContext.categoryDetails = categoryDetails;
        LOG.info("Category details retrieved successfully from the API");
    }

    @When("user get the response code {int}")
    public void userGetTheResponseCode(int statusCode) {
        // validate status code
        LOG.info("Status code returned from the API: " + testContext.response.getStatusCode());
        assertEquals(Long.valueOf(statusCode), Long.valueOf(testContext.response.getStatusCode()));
    }

    @Then("user validates the response with JSON schema {string}")
    public void userValidatesTheResponseWithJSONSchema(String schemaFileName) {
        // validate JSON schema
        testContext.response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/" + schemaFileName + "Schema.json"));
        LOG.info("Successfully validated schema from: " + schemaFileName);
    }

    @And("user should see all the below category details")
    public void userShouldSeeAllTheBelowCategoryDetails(DataTable dataTable) {
        List<Map<String, String>> categoriesList = dataTable.asMaps(String.class, String.class);
        List<Promotion> promotionList = testContext.categoryDetails.getPromotions();

        // Iterating data table
        for (Map<String, String> categoryDetailsDataTableMap : categoriesList) {
            assertEquals("Name field value mismatch!", categoryDetailsDataTableMap.get("CategoryName"), testContext.categoryDetails.getName());
            assertEquals("CanRelist field value mismatch!", Boolean.parseBoolean(categoryDetailsDataTableMap.get("CanRelist")), testContext.categoryDetails.isCanRelist());

            // Iterating Promotion list to obtain Promotion class objects and assert with the datatable values
            for (Promotion promotionObj : promotionList) {
                if (promotionObj.getName().equals(categoryDetailsDataTableMap.get("PromotionName"))) {
                    assertEquals("PromotionDescription field value mismatch!", categoryDetailsDataTableMap.get("PromotionDesc"), promotionObj.getDescription());
                }
            }
        }
        LOG.info("Successfully validated all the fields from the API response!");
    }
}
