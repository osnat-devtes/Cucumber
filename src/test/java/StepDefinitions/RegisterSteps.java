package StepDefinitions;

import io.cucumber.java.en.And;
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

    @When("^the form is filled with email (.*) first name (.*) last name (.*) password (.*)$")
    public void theFormIsFilledWithData(String eMail, String firstName, String lastName, String password) {
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span"));
        signIn.click();
        WebElement eMailInput = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
        eMailInput.sendKeys(eMail);
        WebElement createAnAccountButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        createAnAccountButton.click();
        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
        firstNameInput.sendKeys(firstName);
        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
        lastNameInput.sendKeys(lastName);
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        passwordInput.sendKeys(password);
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
        registerButton.click();

    }

    @Then("the webpage should contain {string}")
    public void theWebpageShouldContainWelcomeToYourAccount(String expectedString){
        System.out.println(expectedString);
    }

    @And("close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }
}
