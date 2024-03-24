package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class QACoursePortalSteps {

    private final LoginPage loginPage = new LoginPage();

    @Given("user is opening the login page")
    public void userIsOpeningTheMainPage() {
        Selenide.open("https://qa-course-01.andersenlab.com/login");
    }

    @Then("user sees the sign in button")
    public void userSeesTheSignInButton() {
        Assert.assertTrue(loginPage.signInButtonIsDisplayed());
    }

    @When("user authorizes with: email {string} password {string}")
    public void userAuthorizes(String email, String password) {
        loginPage.enterEmail(email)
                .enterPassword(password)
                .clickOnSignInButton();
    }

    @Then("user sees the button 'Edit account'")
    public void userSeesTheButtonEditAccount() {
        loginPage.editAccountLinkIsDisplayed();
    }

    @Then("user sees the notification about incorrect credentials")
    public void userSeesErrorAuthorizationMessage() {
        loginPage.errorAuthorizationMessageIsDisplayed();
    }
}
