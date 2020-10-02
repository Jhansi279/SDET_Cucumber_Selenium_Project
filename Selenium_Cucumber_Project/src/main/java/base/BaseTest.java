package base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class BaseTest {

	public static Properties properties;
	private final String propertyFilePath = "Configuration.properties";

	public BaseTest() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public static WebDriver driver;
	public static String chromeDriver_Path = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe";

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", chromeDriver_Path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String url = properties.getProperty("url");
		driver.get("http://elearningm1.upskills.in/");
	}

}
