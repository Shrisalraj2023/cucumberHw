package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase{
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserNameElement;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PasswordElement;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInClickElement;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BankAndCashClickElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccountClickElement;

	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement AccountTittleElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DescriptionElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement InitialBalanceElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumberElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement ContactPersonElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PhoneElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement InternetBankingURLElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SubmitClickElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	WebElement PopUpMessage;

	public void insertUserName(String username) {
		UserNameElement.sendKeys(username );
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void insertPassword(String password) {
		PasswordElement.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SignInClickElement.click();
		
	}

	

	public void clickBankCashButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		BankAndCashClickElement.click();

	}

	public void clickNewAccountButton() {
		NewAccountClickElement.click();
		
	}

	public void insertAccountTittleElement(String accountTitle) {
		AccountTittleElement.sendKeys(accountTitle+ randomNumber(999));
	
	}

	public void insertDescriptionElement(String description) {
		DescriptionElement.sendKeys(description);
	
	}

	public void insertInitialBalance(String initialBalance) {
		InitialBalanceElement.sendKeys(initialBalance);
		
	}

	public void insertAccountNumber(String accountNumber) {
		AccountNumberElement.sendKeys(accountNumber+ randomNumber(999));
		
	}

	public void insertContactperson(String contactPerson) {
		ContactPersonElement.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void insertPhone(String Phone) {
		PhoneElement.sendKeys(Phone);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	public void insertInternetBankingURL(String internetBankingURL) {
		InternetBankingURLElement.sendKeys(internetBankingURL);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void clickSubmitbutton() {
		SubmitClickElement.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	 public String getPageTitle() {
		 String title = driver.getTitle();
		return title;
	 }
	
	 public String validateAccount() {
		String ActualMessage = PopUpMessage.getText();
		 return ActualMessage;
	
}
}
