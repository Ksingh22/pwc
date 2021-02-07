package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

        public WebDriver driver;
        public SearchPage(WebDriver rdriver){
            driver = rdriver;
            PageFactory.initElements(rdriver,this);
        }
    @FindBy(xpath="//div[@id='wrapper']/header/div/div/i[2]")
    WebElement searchIcon;

    @FindBy(xpath="//input[@id='search-input']")
    WebElement searchInputTextField;

    @FindBy(xpath="//body/div[@id='wrapper']/section[2]/div[1]/div")
    List<WebElement> searchResults;


    public void clickSearchIcon() {
        searchIcon.click();
    }

    public void enterSearchText(String search_text) {
        searchInputTextField.sendKeys(search_text);
    }

    public void clickEnter() {
        searchInputTextField.sendKeys(Keys.ENTER);
    }

    public void verifySearchResults() {
        List<WebElement> results = searchResults;
        if(!results.isEmpty()) {
            System.out.println(results.get(0).getText());
        }else {
            System.out.println("No search results");
        }
    }


}
