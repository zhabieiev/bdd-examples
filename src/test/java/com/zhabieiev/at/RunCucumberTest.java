package com.zhabieiev.at;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"~@excluded"},
        features = "classpath:com/zhabieiev/at/userLogin.feature",
        //glue = "com.macdonald",
        plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" }
        )
public class RunCucumberTest
{
}


