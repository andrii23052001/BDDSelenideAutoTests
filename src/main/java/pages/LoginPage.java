package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement signInButton = $x("//button[text()='Sign in']");
    private final SelenideElement emailInput = $x("//input[@placeholder=\"Enter email\"]");
    private final SelenideElement passwordInput = $x("//input[@type=\"password\"]");
    private final SelenideElement editAccountLink = $x("//a[@href=\"/editAccount\"]");
    private final SelenideElement errorAuthorizationMessage = $x("//span[text()=\"Email or password is not valid\"]");

    public boolean signInButtonIsDisplayed() {
        return signInButton.isDisplayed();
    }

    public LoginPage clickOnSignInButton() {
        signInButton.shouldBe(clickable).click();
        return this;
    }

    public void editAccountLinkIsDisplayed() {
        editAccountLink.shouldBe(visible);
    }

    public void errorAuthorizationMessageIsDisplayed() {
         errorAuthorizationMessage.shouldBe(visible);
    }

    public LoginPage enterEmail(String email) {
        emailInput.shouldBe(visible).setValue(email);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordInput.shouldBe(visible).setValue(password);
        return this;
    }
}
