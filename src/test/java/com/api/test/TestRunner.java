package com.api.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty:target/cucumber/cucumber.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber/cucumber.json",
                "com.api.utils.MyTestListener"
        }
        ,features= {"src/test/resources/features"}
        ,glue = {"com.api.stepdefinition"}
        ,monochrome = true
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,tags = "@categoryAPI"
)
public class TestRunner {
}
