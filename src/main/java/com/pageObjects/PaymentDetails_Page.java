package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.pageObjects.BaseClass;
import com.utility.Log;

public class PaymentDetails_Page extends BaseClass {
		private static WebElement element;
    
	 public PaymentDetails_Page(WebDriver driver){
   	     super(driver);
   	    }
	
	 public static WebElement txt_Email() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("wpsc_checkout_form_9"));
       		Log.info("Email text box on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("Email text box on Payment Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement txt_FirstName() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("wpsc_checkout_form_2"));
       		Log.info("First Name text box on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("First Name text box on Payment Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement txt_LastName() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("wpsc_checkout_form_3"));
       		Log.info("Last Name text box on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("Last Name text box on Payment Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement txt_Address() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("wpsc_checkout_form_4"));
       		Log.info("Address text box on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("Address text box on Payment Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement txt_City() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("wpsc_checkout_form_5"));
       		Log.info("City text box on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("City text box on Payment Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static void drpdwn_Country(String sCountry) throws Exception{
    	 element = null;
       	try{
       		Select element= new Select(driver.findElement(By.id("wpsc_checkout_form_7")));
       		Log.info("Country dropdown on Payment Details page is found.");
       		element.selectByVisibleText(sCountry);
       	}catch (Exception e){
       		Log.error("Country dropdown on Payment Details page is not found");
       		throw(e);
       		}
        }
	 
	 public static WebElement txt_Phone() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("wpsc_checkout_form_18"));
       		Log.info("Phone text box on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("Phone text box on Payment Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement chkbx_SameAsBillingAdd() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.id("shippingSameBilling"));
       		Log.info("Same as Billing address check box on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("Same as Billing address check box on Payment Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 
	 public static WebElement btn_Purchase() throws Exception{
    	 element = null;
       	try{
       		element= driver.findElement(By.xpath(".//*[@id='wpsc_shopping_cart_container']/form/div[4]/div/div/span/input"));
       		Log.info("Purchase button on Payment Details page is found.");
       	}catch (Exception e){
       		Log.error("Purchase button on Personal Details page is not found");
       		throw(e);
       		}
       	return element;
        }
	 

}
