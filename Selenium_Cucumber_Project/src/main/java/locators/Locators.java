package locators;

import org.openqa.selenium.By;

public class Locators {

	public static By signUp_Btn = By.xpath("//a[contains(text(),'Sign up!')]");
	
	public static By firstName_Textbox = By.id("registration_firstname");
	public static By lastName_Textbox = By.id("registration_lastname");
	public static By email_Textbox = By.id("registration_email");
	public static By username_Textbox = By.id("username");
	public static By pwd_Textbox = By.id("pass1");
	public static By confPwd_Textbox = By.id("pass2");
	public static By register_Btn = By.id("registration_submit");
	
	public static By welcome_text = By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/p[1]");
	//*[@class='breadcrumb']//following-sibling::div//p[1]
	
	public static By uname_Textbox = By.id("login");
	public static By pass_Textbox = By.id("password");
	public static By login_Btn = By.id("form-login_submitAuth");
	
	public static By homepage = By.xpath("//a[@title='Homepage']");
	//a[@title='Homepage']
	//a[text()='Compose']
	public static By compose = By.xpath("//a[text()='Compose']");
	
	public static By sendTo_Textbox = By.xpath("//input[@placeholder='Please select an option']");
	public static By sub_Textbox = By.id("compose_message_title");
	public static By body_Textbox = By.xpath("//*[@contenteditable='true']");
	public static By send_Btn = By.id("compose_message_compose");
	public static By confMsg_Text = By.cssSelector("div[class='alert alert-success']");
	public static By email_list = By.xpath("//*[@class='select2-results__option select2-results__option--highlighted']");
	public static By msg_header = By.id("public static By confMsg_Text");
	
	
	
	
	
	
	
	
}
