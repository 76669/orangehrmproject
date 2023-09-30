package MyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePIMPage extends GENERICS {
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement pimbtn;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")
	private WebElement addEmployee;
	@FindBy(name = "firstName")
	private WebElement fname;
	@FindBy(name = "lastName")
	private WebElement lname;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
	private WebElement savebtn;

	public OrangePIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void addEmployeePIM() throws IOException, InterruptedException {
		
		
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ryk96\\eclipse-workspace\\Pom_A\\configer.properties");
		
		pro.load(fis);
		mouseHoverAndClickElement(pimbtn);
		Thread.sleep(5000);
		ClickingOnWebElement(addEmployee, 20);
		Thread.sleep(5000);
		sendkeysOnWebElement(fname, pro.getProperty("employee.fname"));
		sendkeysOnWebElement(lname, pro.getProperty("employee.lname"));
		ClickingOnWebElement(savebtn, 20);
	}

}
