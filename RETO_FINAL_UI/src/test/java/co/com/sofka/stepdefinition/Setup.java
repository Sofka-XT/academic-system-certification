package co.com.sofka.stepdefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Setup {

    protected static final String USER_DIR = System.getProperty("user.dir");
    protected static String originalWindow;

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
        setUpLog4j2();

        /*WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();*/

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(capabilities);
        //driver = new ChromeDriver();
        setupBrowser(driver);
        setupUser(actorName, driver);

    }

    protected void setUpLog4j2() {
        PropertyConfigurator.configure(
                USER_DIR + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
}
