package MyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogin extends GENERICS {
	@FindBy(name = "username")
	private WebElement Username;
	@FindBy(name = "password")
	private WebElement Password;
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement LogIn;

	public OrangeLogin() {
		PageFactory.initElements(driver, this);
	}

	public void loginAction() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ryk96\\eclipse-workspace\\Pom_A\\configer.properties");
		 
		
		Properties pro = new Properties();
		pro.load(fis);
		sendkeysOnWebElement(Username, pro.getProperty("app.username"));
		sendkeysOnWebElement(Password, pro.getProperty("app.password"));
		ClickingOnWebElement(LogIn, 20);
	}

}
