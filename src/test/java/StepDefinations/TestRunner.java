package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
glue= {"StepDefinations"},
monochrome = true,
plugin= {"pretty", "html:target/HtmlReports/report.html"},
tags="@smoke or @regression")

public class TestRunner {
}
