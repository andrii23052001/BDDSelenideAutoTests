package hooks;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class SetupHooks {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriverRunner.setWebDriver(WebDriverManager.chromedriver().create());
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
