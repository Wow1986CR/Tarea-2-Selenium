import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) {
        String pathDriver = Main.class.getResource("/chromedriver.exe").getPath();
        System.setProperty("webdriver.chrome.driver",pathDriver);
        WebDriver driver = new ChromeDriver();

//        driver.get("https://demo.opencart.com/index.php?route=account/login");
//
//        WebElement emailTxtIn = driver.findElement(By.name("email"));
//        emailTxtIn.sendKeys("alvaro@correo.com");
//
//        WebElement passwordTxtIn = driver.findElement(By.name("password"));
//        passwordTxtIn.sendKeys("claveTopSecret");
//
//        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
//        loginButton.click();
//
//        WebElement alertMess = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
//        Assert.assertTrue(alertMess.isDisplayed());
//
//        driver.quit();

        //Prueba 2
        driver.get("https://demo.opencart.com/index.php?route=common/home");

        WebElement searchTxtIn = driver.findElement(By.name("search"));
        searchTxtIn.sendKeys("macbook"+ Keys.ENTER);

        WebElement macbookProdLink = driver.findElement(By.linkText("MacBook"));
        macbookProdLink.click();

        WebElement addCartButton = driver.findElement(By.id("button-cart"));
        addCartButton.click();

        WebElement alertSuccesMess = driver.findElement(By.xpath("//div[contains(@class,'alert-success')]"));
        Assert.assertTrue(alertSuccesMess.isDisplayed());

        driver.quit();
        driver.close();

    }
}
