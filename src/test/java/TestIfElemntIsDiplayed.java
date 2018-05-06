import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIfElemntIsDiplayed {

    WebDriver driver = driver();


    public WebDriver driver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.e-fum.ro");
        return driver;
    }


    public void logoIsDisplayed() {
        WebElement logo = null;
        try {
            logo = driver.findElement(By.className("logo"));
            System.out.println("Web element 'logo' is displayed.");
        }
        catch (Exception notPresent) {
            System.out.println("Web element is not present.");
        }
    }


    public void searchFieldIsDisplayed(){
        WebElement searchField = null;
        try{
            searchField = driver.findElement(By.id("search_query_top"));
            System.out.println("Web element 'search field' is displayed.");
        }
        catch (Exception notPresent){
            System.out.println("Web element is not present.");
        }
    }


    public void searchFieldInput(){
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.sendKeys("TRILU LILU CROCODILU");
    }


    public void searchButtonIsDisplayed(){
        WebElement searchButton = null;
        try {
            searchButton = driver.findElement(By.cssSelector("#searchbox > button"));
            System.out.println("Web element 'search button' is displayed.");
        }
        catch (Exception notPresent){
            System.out.println("Web element is not present.");
        }
    }











}
