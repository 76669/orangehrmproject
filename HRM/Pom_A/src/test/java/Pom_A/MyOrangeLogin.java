package Pom_A;

import java.io.IOException;

import org.testng.annotations.Test;

import MyData.GENERICS;
import MyData.OrangeLogin;
import MyData.OrangeMyInfoPage;
import MyData.OrangePIMPage;
import MyData.OrangeTimepage;

public class MyOrangeLogin {
	public GENERICS generics;
	public OrangeLogin orangelogin;
	public OrangePIMPage orangepimpage;
	public OrangeTimepage orangetimepage;
	public OrangeMyInfoPage infopage;

	@Test(priority = 1)
	public void appLaunch() throws IOException {

		generics = new GENERICS();
		generics.applicationLaunch();
	}

	@Test(priority = 2)
	public void loginApplication() throws IOException {
		orangelogin = new OrangeLogin();
		orangelogin.loginAction();

	}

	@Test(priority = 3)
	public void addEmployee() throws IOException, InterruptedException {
		orangepimpage = new OrangePIMPage();
		orangepimpage.addEmployeePIM();

	}

	@Test(priority = 4)
	public void Timepagee() throws IOException, InterruptedException {
		orangetimepage = new OrangeTimepage();
		orangetimepage.timepage();

	}

	@Test(priority = 5)
	public void InfoPage() throws IOException, InterruptedException {
		infopage = new OrangeMyInfoPage();
		infopage.minfopage();

	}

}
