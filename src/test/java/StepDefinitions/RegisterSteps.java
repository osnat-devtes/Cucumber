package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterSteps {
    public WebDriver driver;

    @Given("an open browser with HotelTestlabCoderslab")
    public void anOpenBrowserWithHttpsHotelTestlabCoderslabPl() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://hotel-testlab.coderslab.pl/");

    }

    @When("a form is filled in with the user's data")
    public void aFormIsFilledInWithTheUserSData() {
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span"));
        signIn.click();
        WebElement eMail = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        eMail.sendKeys("hjkhkjh12@op.pl");
        WebElement createAnAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        createAnAccountButton.click();
        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        firstNameInput.sendKeys("Jan");
        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastNameInput.sendKeys("Kowalski");
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        passwordInput.sendKeys("QWERTY12");
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
        registerButton.click();
    }

    @Then("the webpage should contain {string}")
    public void theWebpageShouldContainWelcomeToYourAccountHereYouCanManageAllOfYourPersonalInformationAndOrders(String expectedString){
        System.out.println(expectedString);
    }
}
