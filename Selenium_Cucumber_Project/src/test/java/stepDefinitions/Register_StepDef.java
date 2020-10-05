package stepDefinitions;

import org.junit.Assert;

import base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;

public class Register_StepDef extends BaseTest{

	@Before
	public void setUp() {
		BaseTest.initialization();
	}
	
	@Given("The user is on the application home page.")
	public void the_user_is_on_the_application_home_page() {
	    
	}
	@When("The user clicks on Sign Up option")
	public void the_user_clicks_on_sign_up_option() {
	   driver.findElement(Locators.signUp_Btn).click();
	}
	@When("user enters details for {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters_details_for(String fname, String lname, String email,
			String uname, String pass, String confpass) {
	    driver.findElement(Locators.firstName_Textbox).sendKeys(fname);
	    driver.findElement(Locators.lastName_Textbox).sendKeys(lname);
	    driver.findElement(Locators.email_Textbox).sendKeys(email);
	    driver.findElement(Locators.username_Textbox).sendKeys(uname);
	    driver.findElement(Locators.pwd_Textbox).sendKeys(pass);
	    driver.findElement(Locators.confPwd_Textbox).sendKeys(confpass);
	    
	    
	}
	@When("clicks on Register button")
	public void clicks_on_register_button() {
	    driver.findElement(Locators.register_Btn).click();
		
	}
	
	@Then("user is logged into the application and sees a confirmation message on the screen.")
	public void user_is_logged_into_the_application_and_sees_a_confirmation_message_on_the_screen() {
	    String expected_Msg = "Dear Tester1606 SDET";
	    String s = "Dear Tester10 SDET,\r\n" + 
	    		"\r\n" + 
	    		"Your personal settings have been registered.";

	    String actual_Msg = driver.findElement(Locators.welcome_text).getText();
	    actual_Msg = actual_Msg.replaceAll("\r\n", "");
	    System.out.println("actual_Msg :" + actual_Msg);
	    //Assert.assertEquals("Check if User is Registered successfully", expected_Msg, actual_Msg);
		
		boolean flag = actual_Msg.contains(expected_Msg);
		Assert.assertTrue(flag);
		System.out.println("User registered successfully");
	}
}
