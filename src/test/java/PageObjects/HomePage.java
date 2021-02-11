package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseTests;

public class HomePage extends BaseTests {
     WebDriverWait wait;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, 20);
    }
    @FindBy(css="li.flex-active-slide")
    WebElement featuredArticles;

    @FindBy(css ="a.flex-next")
    WebElement carouselNext;

    @FindBy(css ="a.flex-prev")
    WebElement carouselPrevious;

    public void clickNextCarousel()  {
       wait.until(ExpectedConditions.elementToBeClickable(carouselNext));
        carouselNext.click();
    }

    public void clickPrevCarousel()  {
        wait.until(ExpectedConditions.elementToBeClickable(carouselPrevious));
        carouselPrevious.click();
    }

    public void verifyFeaturedArticles(){
        wait.until(ExpectedConditions.visibilityOf(featuredArticles));
        featuredArticles.isDisplayed();

    }

}
