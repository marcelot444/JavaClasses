package com.class26;

public class WebDriverTest {
	public static void main(String[] args) {
		ChromeDriver chrome =new ChromeDriver();
		chrome.refresh();
		chrome.open();
		System.out.println();
		
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		System.out.println();
		//creating an object of the child class
		WebDriver driver= new FirefoxDriver();
		driver.open();//child class 
		driver.refresh();
		
	}

}
