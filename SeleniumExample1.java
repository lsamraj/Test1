package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
driver = new ChromeDriver();
driver.get("https://www.google.com/");

	}

}
