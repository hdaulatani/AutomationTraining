package com.training.selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver;
	static Actions action;
	//public static void main(String[] args) throws InterruptedException {
     //WebDriver driver;
     public static void login(){
     WebDriverManager.edgedriver().setup();
     driver=new EdgeDriver();
     driver.get("https://selenium-prd.firebaseapp.com/");
     driver.manage().window().maximize();
     driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
     driver.findElement(By.id("password_field")).sendKeys("admin123");
   
   
    //WebElement email= driver.findElement(By.xpath("//input[contains(@id,'email_field']"));
     //email.sendKeys("admin123@gamil.com");
  // //h3[text()=' Web login ']
     //WebElement password=driver.findElement(By.xpath("//input[contains(@id,'password_field'])"));
     //password.sendKeys("admin123");	
     driver.findElement(By.xpath("//button[normalize-space()='Login to Account']")).click();
     //Thread.sleep(5000);
     //driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();  
     Actions action=new Actions(driver);}
     public static void openWindows() {
     WebElement SwitchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
     action.moveToElement(SwitchTo).build().perform(); 
     driver.findElement(By.xpath("//a[contains(text(),'Windows')]"));
     //WebElementWait wait=
	}
	

}
