package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseTests;

public class HomePage extends BaseTests {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="li.flex-active-slide")
    WebElement featuredArticles;

    @FindBy(css ="a.flex-next")
    WebElement carouselNext;

    @FindBy(css ="a.flex-prev")
    WebElement carouselPrevious;

    public void clickNextCarousel() throws InterruptedException {
        Thread.sleep(2000);
        carouselNext.click();
    }

    public void clickPrevCarousel() throws InterruptedException {
        Thread.sleep(2000);
        carouselPrevious.click();
    }

    public void verifyFeaturedArticles() throws InterruptedException {
        Thread.sleep(2000);
        featuredArticles.isDisplayed();

    }

}
