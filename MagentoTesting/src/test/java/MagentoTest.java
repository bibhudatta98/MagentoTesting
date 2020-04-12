package com.abc.MagentoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.MagentoObject.Login;
import com.abc.MagentoObject.Main;
import com.abc.MagentoObject.Welcome;

public class MagentoTest 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w= new Welcome(driver);
		w.clickOnMyAccount();
		Login l= new Login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		Main m= new Main(driver);
		m.clickOnLogout();
		driver.quit();
		
	}

}
