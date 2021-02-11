package stepDefinitions;

import PageObjects.ContactUsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import utilities.BaseTests;

import java.util.Collections;

public class ContactPageSteps extends BaseTests {

    ContactUsPage contact;


    @Given("I navigate to the Pwc Digital Pulse")
    public void i_navigate_to_the_pwc_digital_pulse() {
        setUp();
        contact = new ContactUsPage(driver);
    }

    @When("I select contact us from the burger menu")
    public void i_select_contact_us_from_the_burger_menu() {
        //driver.findElement(By.cssSelector("i.btr.bt-bars.trigger")).click();
        contact.clickBurgerMenu();

    }

    @Then("I am taken to the contact us page")
    public void i_am_taken_to_the_contact_us_page()  {
                contact.clickContactlink();

    }

    @Then("I am presented with the below options for contacts")
    public void i_am_presented_with_the_below_options_for_contacts(DataTable table)  {
       // contact.verifyAllContactLinks();
        contact.all_links(table);
        tearDown();
       // driver.close();
    }

}
