package stepdefinitions;



import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.pages.Loginpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	private Loginpage loginpage = new Loginpage(DriverFactory.getDriver());

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		DriverFactory.getDriver().get("https://foeurope--int.my.salesforce.com/");
		String titlee = loginpage.getLoginPageTitle();
		System.out.print("login page title is" + titlee);
		String expected="Login | Salesforce";
		assertTrue(expected == titlee);
	//	assertTrue("This will succeed.", true);
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginpage.isForgotPassowrdLinkExists());

	}

	@Given("User is the already on the login page")
	public void user_is_the_already_on_the_login_page() {
		// DriverFactory.getDriver().get("https://foeurope--int.my.salesforce.com/");
		String titlee = loginpage.getLoginPageTitle();
		System.out.print("login page title is" + titlee);
		// Assert.assertTrue(titlee.contains("Login | Salesforce"));

	}

	@When("title of the login page is Please Log In")
	public void title_of_the_login_page_is_please_log_in() {
		String titlee = loginpage.getLoginPageTitle();
		System.out.print("login page title is" + titlee);
		// Assert.assertTrue(titlee.contains("Login | Salesforce"));

	}

	@Then("user enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickOnLogin();

	}

	@Then("user is on the Homepage")
	public void user_is_on_the_homepage() {

	}

	@Then("user then quits")
	public void user_then_quits() {

	}

}
