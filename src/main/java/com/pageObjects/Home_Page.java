package com.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageObjects.BaseClass;
import com.utility.Log;

import com.utility.Utils;
    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }    
        public static WebElement lnk_MyAccount() throws Exception{
            try{ 
	        	 element = driver.findElement(By.xpath(".//*[@id='account']/a"));
	             Log.info("My Account link is found on the Home Page");
            }catch (Exception e){
           		Log.error("My Acocunt link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        public static WebElement lnk_LogOut() throws Exception{
            try{
	        	element = driver.findElement(By.id("account_logout"));
	        
	            Log.info("Log Out link is found on the Home Page");
            }catch (Exception e){
            	Log.error("Log Out link is not found on the Home Page");
           		throw(e);
           		}
           	return element;
        }
        
        public static class TopNavigation{
        	
        	public static class Product_Type{
        		
        			static WebElement mainElement;
      		
        		public static void Accessories() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "Accessories");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        		public static void iMacs() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iMacs");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        		public static void iPads() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iPads");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        		public static void iPhones() throws Exception{
        			try{
	        			mainElement = driver.findElement(By.linkText("Product Category"));
	        			Log.info("Product category link is found under Top Navigation");
	        			Utils.mouseHoverAction(mainElement, "iPhones");
        			}catch (Exception e){
        				Log.error("Accessories link is not found under Product Category");
        				throw(e);
        			}
                   }
        		
        	}
        	
        }
        

      
    }
