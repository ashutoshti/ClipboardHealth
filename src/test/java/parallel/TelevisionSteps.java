package parallel;

import Util.ElementUtil;
import driver.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TelevisionSteps extends DriverFactory {

    @Then("Scroll to the Brand Names Heading")
    public void scroll_to_the_brand_names_heading() {
        televisionPage.scrollToBrandHeading();
    }
    @When("User Click on the {string}")
    public void user_click_on_the(String brandName) {
        televisionPage.selectBrandName(brandName);
    }
    @Then("User Click on the Sort the according to price by {string}")
    public void user_click_on_the_sort_the_according_to_price_by(String typeOfSort) {
        televisionPage.sortByPrice(typeOfSort);
    }
    @When("User Click on the Second Highest TV")
    public void user_click_on_the_second_highest_tv() {
        televisionPage.selectSecondHighestTelevison();
    }
    @Then("The Page of the Second Highest Page is open")
    public void the_page_of_the_second_highest_page_is_open() {
        ElementUtil.waitForLoad(driver);
        ElementUtil.swtichToTab(1,false);

    }
    @Then("Display the About this item into the scroll")
    public void display_the_about_this_item_into_the_scroll() {
        televisionPage.displayAboutInConsole();
    }
}
