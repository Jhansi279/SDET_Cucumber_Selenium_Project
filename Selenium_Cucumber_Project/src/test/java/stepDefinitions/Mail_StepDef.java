package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import locators.Locators;

public class Mail_StepDef extends BaseTest {

	@Before
	public void setUp() {
		BaseTest.initialization();
	}

	
	  @Given("User has logged into the application") 
	  public void user_has_logged_into_the_application() {
		  driver.findElement(Locators.uname_Textbox).sendKeys(properties.getProperty("username"));
		  driver.findElement(Locators.pass_Textbox).sendKeys(properties.getProperty("password"));
		  driver.findElement(Locators.login_Btn).click();
	  }

	  @When("The user clicks on Compose option on homepage")
	public void the_user_clicks_on_compose_option_on_homepage() {
		  driver.findElement(Locators.homepage).click();
		  driver.findElement(Locators.compose).click();
	}

	@When("Enters the required details for emailid as {string}, subject as {string},mail body as {string}")
	public void enters_the_required_details_for_emailid_as_subject_as_mail_body_as(String emailid, String sub,
			String body) {
		driver.findElement(Locators.sendTo_Textbox).sendKeys(emailid);
		driver.findElement(Locators.email_list).click();
		driver.findElement(Locators.sub_Textbox).sendKeys(sub);
		
		//switch to iframe
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 60);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.msg_header)
		 * ); driver.switchTo().frame(0);
		 * driver.findElement(Locators.body_Textbox).sendKeys(body);
		 * //driver.findElement(Locators.body_Textbox).sendKeys(body);
		 * driver.switchTo().defaultContent();
		 */

	}

	@When("clicks on Send button")
	public void clicks_on_send_button() {
		driver.findElement(Locators.send_Btn).click();
	}

	@Then("an acknowledgement message is displayed")
	public void an_acknowledgement_message_is_displayed() {
		String actualMsg = driver.findElement(Locators.confMsg_Text).getText();
		actualMsg = actualMsg.strip();
		System.out.println("actualMsg: " + actualMsg);
		String expectedMsg = "The message has been sent to naveen1 naveen1 (naveen1)";
		//assert.assertEquals("check if the mail is sent", , );
		Assert.assertEquals("check if the mail is sent", expectedMsg, actualMsg);
		
	}

}
