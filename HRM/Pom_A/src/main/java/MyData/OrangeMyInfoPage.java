package MyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeMyInfoPage extends GENERICS   {
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	private WebElement myinfobtn;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
	private WebElement contbtn;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	private WebElement s1;  
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	private WebElement city;// 
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div[2]/input")
	private WebElement statte; 
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
	private WebElement zip; 
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")
	private WebElement othmail; 
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
	private WebElement savbtn; 
	
	
	public OrangeMyInfoPage() {
		PageFactory.initElements(driver, this);
	}

	public void minfopage() throws IOException, InterruptedException {

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ryk96\\eclipse-workspace\\Pom_A\\configer.properties");

		pro.load(fis);
		mouseHoverAndClickElement(myinfobtn);
		Thread.sleep(5000);
		mouseHoverAndClickElement(contbtn);
		Thread.sleep(5000);
		
		sendkeysOnWebElement(s1, pro.getProperty("street"));
		sendkeysOnWebElement(city, pro.getProperty("city"));
		sendkeysOnWebElement(statte, pro.getProperty("state"));
		sendkeysOnWebElement(zip, pro.getProperty("pincode"));
		sendkeysOnWebElement(othmail, pro.getProperty("mail"));

		ClickingOnWebElement(savbtn, 20);
	}




}
