package co.com.sofka;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {

    @Managed()

    protected static WebDriver driver;

    protected void setupBrowser(WebDriver browser) {
        browser.manage().deleteAllCookies();
        browser.manage().window().maximize();
    }

    protected void setupUser(String name, WebDriver browser) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(browser));
    }

    protected void actorSetupTheBrowser(String actorName) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        setupBrowser(driver);
        setupUser(actorName, driver);
    }

    protected WebDriver getDriver(){
        return driver;
    }
}
