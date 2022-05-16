package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.ListContactPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {

	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUsername("demo@techfios.com");
		loginpage.insertPassword("abc123");
		loginpage.clickSignINButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");		
		dashboardPage.clickCustomerMenuButtom();
		dashboardPage.clickAddCustomerMenuButton();
		
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.validateAddContactPage("Add Contact");
		addContactPage.insertFullName("Dec Sel");
		addContactPage.selectCompany("Techfios");
		addContactPage.insertEmail("a@techfios.com");
		addContactPage.insertPhone("214");
		addContactPage.insertAddress(" Beltline Rd");
		addContactPage.insertCity("Irving");
		addContactPage.insertState("Texas");
		addContactPage.insertZipCode("75052");
		addContactPage.selectCountry("United Kingdom");
		addContactPage.insertTags("DecTech");
		addContactPage.clickSaveButton();	
		

	}

}
