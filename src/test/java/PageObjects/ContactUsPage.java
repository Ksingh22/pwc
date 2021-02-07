package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactUsPage {

     // Constructors
   public WebDriver driver;
   public ContactUsPage(WebDriver rdriver) {
      driver = rdriver;
      PageFactory.initElements(rdriver, this);

   }
    @FindBy(css="i.btr.bt-bars.trigger")
    WebElement BurgerMenu;

    @FindBy(linkText = "Contact us")
    WebElement Contactus_link;

    @FindBy(xpath="//div[@class='row flex']/div")
    List<WebElement> contact_links;

    @FindBy(xpath = "//div[@class='row flex']/div/h2")
    List<WebElement> all_contact_links;

    public void clickBurgerMenu() {
        BurgerMenu.click();
    }
    public void clickContactlink() {
        Contactus_link.click();
    }

    public void verifyAllContactLinks(){
        List<WebElement> allLinks = all_contact_links;
        System.out.println(allLinks.size());
           for (WebElement all: allLinks){
            System.out.println(all.getText());
        }
    }

}
