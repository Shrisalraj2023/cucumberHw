package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage lp;

	@Before
	public void setup() {
		init();
		lp = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String loginData, String field) {
		if (field.equalsIgnoreCase("username")) {
			lp.insertUserName(loginData);
		} else if (field.equalsIgnoreCase("password")) {
			lp.insertPassword(loginData);
		} else {
			System.out.println("LD: " + loginData + "and field :" + field + "not found");
		}
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String button) {
		if (button.equalsIgnoreCase("login")) {
			lp.clickSignInButton();
		} else if (button.equalsIgnoreCase("bankCash")) {

			lp.clickBankCashButton();

		} else if (button.equalsIgnoreCase("newAccount")) {
			lp.clickNewAccountButton();
		} else if (button.equalsIgnoreCase("submit")) {
			lp.clickSubmitbutton();
		} else {
			System.out.println("not able to complete task");
		}

	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expTitle = "Dashboard- iBilling";
		String actTitle = lp.getPageTitle();
		Assert.assertEquals(expTitle, actTitle);

		System.out.println(actTitle);

	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String accountData, String field) {
		if (field.equalsIgnoreCase("accountTitle")) {
			lp.insertAccountTittleElement(accountData);
		} else if (field.equalsIgnoreCase("description")) {
			lp.insertDescriptionElement(accountData);
		} else if (field.equalsIgnoreCase("initialBalance")) {
			lp.insertInitialBalance(accountData);
		} else if (field.equalsIgnoreCase("accountNumber")) {
			lp.insertAccountNumber(accountData);
		} else if (field.equalsIgnoreCase("contactPerson")) {
			lp.insertContactperson(accountData);
		} else if (field.equalsIgnoreCase("Phone")) {
			lp.insertPhone(accountData);
		} else if (field.equalsIgnoreCase("internetBankingURL")) {
			lp.insertInternetBankingURL(accountData);
		} else {
			System.out.println("AD: " + accountData + "and field :" + field + "not found");
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		String actualtitle = lp.validateAccount();
		String expectedtitle = "Account Created Successfully";
		Assert.assertTrue("Error!!!!!!!!!!!!!!!!!", actualtitle.contains(expectedtitle));

		System.out.println("Successfull validation of new account.");

	}
}