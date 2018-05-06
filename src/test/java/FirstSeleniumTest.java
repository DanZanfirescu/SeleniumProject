import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://substitute.ro");

        WebElement element;
        WebElement altElement;
        altElement = driver.findElement(By.cssSelector(".megamenu-title"));
        System.out.println(altElement.isDisplayed());
        element = driver.findElement(By.cssSelector("#pt_vmegamenu"));
        element.isDisplayed();
        System.out.println(element.isDisplayed());

    }
}
