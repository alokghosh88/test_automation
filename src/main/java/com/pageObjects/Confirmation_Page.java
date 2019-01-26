package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageObjects.BaseClass;
import com.utility.Log;

public class Confirmation_Page extends BaseClass{
    private static WebElement element = null;
    public static String sProductName;
    public static String sProductPrice;
    
    public Confirmation_Page(WebDriver driver){
        	super(driver);
    }    
    public static WebElement txt_ProductName() throws Exception{
        try{ 
        	 element = driver.findElement(By.xpath(".//*[@id='post-30']/div/div[2]/table/tbody/tr/td[1]"));
             Log.info("Product name is found on the Confirmation Page");
        }catch (Exception e){
       		Log.error("Product name is not found on the Confirmation Page");
       		throw(e);
       		}
       	return element;
    }
    
    public static WebElement txt_ProductPrice() throws Exception{
        try{ 
        	 element = driver.findElement(By.xpath(".//*[@id='post-30']/div/div[2]/table/tbody/tr/td[4]"));
             Log.info("Product price is found on the Confirmation Page");
        }catch (Exception e){
       		Log.error("Product price is not found on the Confirmation Page");
       		throw(e);
       		}
       	return element;
    }

}
