package pages;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverFactory;
import Util.ElementUtil;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class TelevisionPage extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    @FindBy(xpath = "//span[text()='Brands']")
    WebElement brandHeading;

    @FindBy(xpath = "//span[text()='RESULTS']")
    WebElement resultsHeading;

    @FindBy(xpath = "//span[text()='Sort by:']/following-sibling::span")
    WebElement sortDropDown;

    @FindBy(xpath = "//a[text()='Price: High to Low']")
    WebElement sortByHighToLow;

    @FindBy(xpath = "//a[text()='Price: Low to High']")
    WebElement sortByLowToHigh;

    @FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[3]")
    WebElement secondHighestTelevision;

    @FindBys(@FindBy(xpath = "//div[@id='feature-bullets']/ul/li"))
    List<WebElement> aboutSection;

    @FindBy(xpath = "//div[@id='feature-bullets']/ul/li")
    WebElement verifyAboutSection;

    public TelevisionPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
    }

    public void verifyTelevisionPage(String productTypes) {
        ElementUtil.waitForLoad(driver);
        String productType = driver.findElement(By.xpath("//li/span/span[contains(text(),'" + productTypes + "')]")).getText();
    }

    public void scrollToBrandHeading(){
        ElementUtil.waitForLoad(driver);
        ElementUtil.scrollToViewWebElement(brandHeading);
    }

    public void selectBrandName(String brandName){
        driver.findElement(By.xpath("//span[text()='"+brandName+"']")).click();
        ElementUtil.waitForElement(resultsHeading);
    }

    public void sortByPrice(@NotNull String sortType){
        String tempText=resultsHeading.getText();
        Assert.assertEquals(tempText, "RESULTS");
        sortDropDown.click();
        System.out.println("Type of Sort Filter is :"+sortByHighToLow.getText());
        sortByHighToLow.click();
        /*if (sortType.contains(sortByHighToLow.getText())) {
            //sortByHighToLow.click();
            ElementUtil.clickElement(sortByHighToLow);
        }
        else{
            //sortByLowToHigh.clear();
            ElementUtil.clickElement(sortByLowToHigh);
        }*/
    }

    public void selectSecondHighestTelevison(){
        ElementUtil.waitForElement(secondHighestTelevision);
        secondHighestTelevision.click();
        ElementUtil.waitForLoad(driver);
    }

    public void displayAboutInConsole(){
        ElementUtil.waitForElement(verifyAboutSection);
        int noOfPoints=aboutSection.size();
        System.out.println("<<<<<=====*****About Section Starts Here*****=====>>>>>");
        for (int i=1;i<=noOfPoints;i++){
            System.out.println(driver.findElement(By.xpath("//div[@id='feature-bullets']/ul/li["+i+"]")).getText());
        }
        System.out.println("<<<<<=====*****About Section Ends Here*****=====>>>>>");
    }
}
