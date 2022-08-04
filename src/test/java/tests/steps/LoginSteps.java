package tests.steps;

import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {

    @When("^I open (.*) site$")
    public void I_open_xxx_site(String siteUrl) {
        open(siteUrl);
    }
}
