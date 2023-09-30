package MyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeTimepage extends GENERICS {
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")
	private WebElement timebtn;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
	private WebElement attendencebtn;
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")
	private WebElement punchinbtn;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[2]/div/div/div/div[2]/textarea")
	private WebElement note;// note write
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")
	private WebElement outbtn;

	public OrangeTimepage() {
		PageFactory.initElements(driver, this);
	}

	public void timepage() throws IOException, InterruptedException {

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ryk96\\eclipse-workspace\\Pom_A\\configer.properties");

		pro.load(fis);
		mouseHoverAndClickElement(timebtn);
		Thread.sleep(5000);
		mouseHoverAndClickElement(attendencebtn);
		Thread.sleep(5000);
		mouseHoverAndClickElement(punchinbtn);
		Thread.sleep(5000);

		sendkeysOnWebElement(note, pro.getProperty("notee"));

		ClickingOnWebElement(outbtn, 20);
	}

}
