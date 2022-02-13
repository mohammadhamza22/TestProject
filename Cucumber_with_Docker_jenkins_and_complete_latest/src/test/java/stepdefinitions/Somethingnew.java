package stepdefinitions;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.pages.Loginpage;
import com.pages.Somethingnewpage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Somethingnew {
	private WebDriver driver;

	private Somethingnewpage newpage;
	private Loginpage loginpage = new Loginpage(DriverFactory.getDriver());

	@Given("User is on the login page")
	public void user_is_on_the_login_page(DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String passWord = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://foeurope--int.my.salesforce.com/");
		newpage = loginpage.doLogin(userName, passWord);
		// loginpage.enterUserName(username);
		// loginpage.enterPassword(password);
		// loginpage.clickOnLogin();

	}

	@Given("user is on Homepage")
	public void user_is_on_homepage() throws InterruptedException {
		System.out.print("User is on Homepage. Now lets see the title below");
		Thread.sleep(5000);

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		String homepagetitle = newpage.gethomepagetitle();
		// String homepagetitle = driver.getTitle();

		System.out.print(homepagetitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		System.out.print("Verified");
	}

}
