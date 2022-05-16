package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ListContactPage extends BasePage{

	WebDriver driver;

	public ListContactPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Customers')]")
	WebElement LIST_CUSTOMER_ElEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='foo_filter']")
	WebElement SEARCH_BOX_ElEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[3]")
	WebElement RESULT_ElEMENT;
	@FindBy(how = How.XPATH, using = "//span[@class='thumb-info-inner']")
	WebElement NAME_CREATED_ELEMENT;
	
	public String storeUsernameCreated() {
	String storedUser = NAME_CREATED_ELEMENT.getText();
	return storedUser;
	}
	
	public void clickListCustomersTab() {
		waitForElement(driver, 5, LIST_CUSTOMER_ElEMENT);
		LIST_CUSTOMER_ElEMENT.click();
	}
	
	public void insertNameIntoSearchBox(String variable) {
		waitForElement(driver, 5, SEARCH_BOX_ElEMENT);
		SEARCH_BOX_ElEMENT.sendKeys(variable);
	}
	
	public void validateName(String fullName) {
		String verifyContact = RESULT_ElEMENT.getText();
		Assert.assertEquals(verifyContact, fullName, "Wrong Page!!");
	}
}
