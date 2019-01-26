package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageObjects.BaseClass;
import com.utility.Log;

public class CheckOut_Page extends BaseClass{
		private static WebElement element;
		public static String sProductName;
		public static String sProductPrice;
     public CheckOut_Page(WebDriver driver){
    	super(driver);
    	}
     
	 public static WebElement txt_ProductPrice() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[4]"));
       		Log.info("Product Price for purchased product is found on the Check Out Page");
       	}catch (Exception e){
       		Log.error("Price for purchased product on Check Out page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement txt_ProductName() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[2]/a"));
       		Log.info("Product Name for purchased product is found on the Check Out Page");
       	}catch (Exception e){
       		Log.error("Price for purchased product on Check Out page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement btn_Continue() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='checkout_page_container']/div[1]/a/span"));
       		Log.info("Continue button is found on the Check Out Page");
       	}catch (Exception e){
       		Log.error("Continue button on Check Out page is not found");
       		throw(e);
       		}
       	return element;
        }
}
