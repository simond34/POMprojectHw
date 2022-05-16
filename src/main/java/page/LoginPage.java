package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
//	WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//*[@id='username']"));
//	By USER_NAME_FIELD = By.xpath("//*[@id='username']");
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement Username_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SignIn_Element;
	
//	Intractable methods
	
	public void insertUsername(String username) {
		Username_Element.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		Password_Element.sendKeys(password);
	}
	
	public void clickSignINButton() {
		SignIn_Element.click();
	}
	
//	another way to do this
	public void performLogin(String username, String password) {
		Username_Element.sendKeys(username);
		Password_Element.sendKeys(password);
		SignIn_Element.click();
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
}
