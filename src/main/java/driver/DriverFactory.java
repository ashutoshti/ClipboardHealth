package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.TelevisionPage;

public class DriverFactory {

    public static WebDriver driver;
    protected static HomePage homePage;
    protected static TelevisionPage televisionPage;


    /**
     * This method is used to initialize the thradlocal driver on the basis of given
     * browser
     *
     * @param browser
     * @return this will return tldriver.
     */
    public static void init_driver(String browser) {

        System.out.println("browser value is: " + browser);
       //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/Executable_Driver/geckodriver.exe");
        driver=new FirefoxDriver();
        //driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(ConstantVariable.applicationURL);

        /****** Initalization Of Pages Classes ******/
        homePage=new HomePage(driver);
        televisionPage=new TelevisionPage(driver);

    }
}