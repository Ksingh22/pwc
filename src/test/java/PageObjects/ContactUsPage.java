package PageObjects;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public class ContactUsPage {

     // Constructors
   WebDriver driver;
   WebDriverWait wait;
   public ContactUsPage(WebDriver rdriver) {
      driver = rdriver;
      PageFactory.initElements(rdriver, this);
       wait = new WebDriverWait(driver, 15);

   }
   @FindBy(css="i.btr.bt-bars.trigger")
    WebElement BurgerMenu;

    @FindBy(linkText = "Contact us")
    WebElement Contactus_link;

    @FindBy(xpath = "//div[@class='row flex']/div/h2")
    List<WebElement> all_contact_links;

    @FindBy(xpath = "//div[@class='row flex']/div/p/a")
    List<WebElement> contact_links;

    public void clickBurgerMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(BurgerMenu));
        BurgerMenu.click();
    }
    public void clickContactlink() {
        wait.until(ExpectedConditions.elementToBeClickable(Contactus_link));
        Contactus_link.click();
    }

    public void verifyAllContactLinks(){
        List<WebElement> allLinks = all_contact_links;
        System.out.println(allLinks.size());
           for (WebElement all: allLinks){
            System.out.println(all.getText());
        }
    }
    public void all_links(DataTable table){

        String PwC_Digital = table.column(1).get(1);
        String Careers_PwC = table.column(1).get(3);
        String General_enquiries = table.column(1).get(4);

        List<WebElement> alllinks = contact_links;

        String link1 = alllinks.get(0).getAttribute("href");
        String link3 = alllinks.get(1).getAttribute("href");
        String link4 = alllinks.get(2).getAttribute("href");


        Assert.assertEquals(PwC_Digital,link1);
        Assert.assertEquals(Careers_PwC,link3);
        Assert.assertEquals(General_enquiries,link4);
        }

}



