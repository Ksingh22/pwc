package stepDefinitions;

import PageObjects.SearchPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utilities.BaseTests;

public class SearchPageSteps extends BaseTests {
    //public WebDriver driver;
    SearchPage search;

    @Given("I navigate to the PwC Digital Plus website")
    public void i_navigate_to_the_pw_c_digital_plus_website() {
        setUp();
        search =  new SearchPage(driver);
    }

    @When("I click on the Magnifying glass icon to perform a search")
    public void i_click_on_the_magnifying_glass_icon_to_perform_a_search()  {

        search.clickSearchIcon();

    }

    @When("I Enter the text {string} and submit the search")
    public void i_enter_the_text(String search_text)  {

        search.enterSearchText(search_text);

    }

    @When("I submit the search")
    public void i_submit_the_search() {
        search.clickEnter();

    }

    @Then("I am taken to the search result page")
    public void i_am_taken_to_the_search_result_page()  {

        if(driver.getPageSource().contains("Showing search results for")) {
            System.out.println("search result text is present");
        }else {
            System.out.println("search result text is not present");
        }
    }

    @Then("I am presented with at least one search result")
    public void i_am_presented_with_at_least_one_search_result() {
        search.verifySearchResults();
        tearDown();
    }

}
