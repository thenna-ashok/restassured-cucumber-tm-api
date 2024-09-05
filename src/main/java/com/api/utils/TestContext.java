package com.api.utils;

import com.api.model.Categories;
import com.github.dzieciou.testing.curl.CurlRestAssuredConfigFactory;
import com.github.dzieciou.testing.curl.Options;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * This class provide the ability to set up the API under test
 */
public class TestContext {

    public Response response;
    private static final String CONTENT_TYPE = PropertiesFile.getProperty("content.type");
    public Categories categoryDetails;

    public RequestSpecification requestSetup() {
        RestAssured.reset();
        Options options = Options.builder().logStacktrace().build();
        RestAssuredConfig config = CurlRestAssuredConfigFactory.createConfig(options);
        RestAssured.baseURI = PropertiesFile.getProperty("baseURL");
        return RestAssured.given()
                .config(config)
                .filter(new RestAssuredRequestFilter())
                .contentType(CONTENT_TYPE)
                .accept(CONTENT_TYPE);
    }
}
