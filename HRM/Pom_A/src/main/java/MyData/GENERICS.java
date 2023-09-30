package MyData;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GENERICS {
	static public WebDriver driver;
	Properties pro;
	FileInputStream fis;

	public void applicationLaunch() throws IOException {

		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver-v0.33.0-win64(1)\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		fis = new FileInputStream("C:\\Users\\ryk96\\eclipse-workspace\\Pom_A\\configer.properties");
		pro = new Properties();
		pro.load(fis);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	// This for click ACtion
	public void ClickingOnWebElement(WebElement element, long WaitTimeInSeconds) {
		WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(WaitTimeInSeconds));
		WebElement elements = null;
		elements = webwait.until(ExpectedConditions.elementToBeClickable(elements));
		elements.click();
	}

	// This for sendkeys Action
	public void sendkeysOnWebElement(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	// This for selecting dropdownlist
	public void selectByVisibleText(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// This accepting alert from url
	public void acceptAlert(WebDriver drivrt) {
		driver.switchTo().alert().accept();
	}

	// THis method for mouse hovering from one element to other element
	public void mouseHoverAndClickElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

	// gwtWindowHandle method
	public String getCurrentWindowID() {
		return driver.getWindowHandle();
	}

	public void GENERICS() {
		// TODO Auto-generated method stub

	}

}
