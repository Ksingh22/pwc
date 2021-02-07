package stepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.*;
import utilities.BaseTests;

public class HomePageSteps extends BaseTests {

    HomePage hp;

    @Given("I navigate to the PwC digital Pulse website")
    public void i_navigate_to_the_pw_c_digital_pulse_website() {
        setUp();
        hp = new HomePage(driver);
    }

    @When("I am viewing the Home page")
    public void i_am_viewing_the_page() {
        String page_title = driver.getTitle();
        if(page_title.equals("Digital Pulse - Disruption, Innovation and Industry Change")){
            System.out.println("User is viewing home page");
        }else{
            System.out.println("user is not viewing home page");
        }

    }

    @Then("I am presented with a carousel displaying three featured articles")
    public void i_am_presented_with_a_carousel_displaying_three_featured_articles() throws InterruptedException {
        hp.verifyFeaturedArticles();
    }

    @Then("Clicking next button on the carousel will load next three featured articles")
    public void clicking_next_button_on_the_carousel_will_load_next_three_featured_articles() throws InterruptedException {
        hp.clickNextCarousel();
    }

    @Then("Clicking previous button on the carousel will load previous three featured articles")
    public void clicking_previous_button_on_the_carousel_will_load_previous_three_featured_articles() throws InterruptedException {
        hp.clickPrevCarousel();
        tearDown();

    }
}
