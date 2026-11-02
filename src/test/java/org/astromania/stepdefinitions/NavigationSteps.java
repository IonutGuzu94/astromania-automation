package org.astromania.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationSteps {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {

        driver.get("https://astromania.org/");

    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String astromaniaTitle) {

        Assertions.assertEquals(astromaniaTitle, driver.getTitle());

    }

    @After
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}
