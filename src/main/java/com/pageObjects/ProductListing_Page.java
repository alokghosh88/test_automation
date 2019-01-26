package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageObjects.BaseClass;
import com.utility.Log;
 
public class ProductListing_Page extends BaseClass {
	private static WebElement element;
    public ProductListing_Page(WebDriver driver){
    	super(driver);
    	} 
     public static class Product_1{
 
         
    	 public static WebElement txt_Price() throws Exception{
        	 element = null;
           	try{
           		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[1]/p[1]/span[2]"));
           		Log.info("Product Price is found for Product 1");
           	}catch (Exception e){
           		Log.error("Product 1 Sales Price is not found");
           		
           		throw(e);
           		}
           	return element;
            }
 
  
         public static WebElement img_Product() throws Exception{
        	 element = null;
          	try{
          		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[1]/a"));
          		Log.info("Product Image is found for Product 1");
          	}catch (Exception e){
          		Log.error("Product 1 Image is not found");
          		throw(e);
          		}
          	return element;
            }
         
 
         public static WebElement txt_Name() throws Exception{
            element = null;
         	try{
         		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2"));
         		Log.info("Product Name is found for Product 1");
         	}catch (Exception e){
         		Log.error("Product 1 Name is not found");
         		throw(e);
         		}
         	return element;
            }
 
 
         public static WebElement btn_AddToCart() throws Exception{
        	  element = null;
           	try{
           		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[2]/div[1]/span/input"));
           		Log.info("Add to Cart button is found for Product 1");
           	}catch (Exception e){
           		Log.error("Product 1 Add to Cart button is not found");
           		throw(e);
           		}
           	return element;
         	}
 
         }
     
	public static class Product_2{
	 
	         
		 public static WebElement txt_Price() throws Exception{
	    	 element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[1]/p[1]/span[2]"));
	       		Log.info("Product Price is found for Product 2");
	       	}catch (Exception e){
	       		Log.error("Product 2 Sales Price is not found");
	       		throw(e);
	       		}
	       	return element;
	        }
	
	
	     public static WebElement img_Product() throws Exception{
	    	 element = null;
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[1]/a"));
	      		Log.info("Product Image is found for Product 2");
	      	}catch (Exception e){
	      		Log.error("Product 2 Image is not found");
	      		throw(e);
	      		}
	      	return element;
	        }
	     
	
	     public static WebElement txt_Name() throws Exception{
	        element = null;
	     	try{
	     		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/h2"));
	     		Log.info("Product Name is found for Product 2");
	     	}catch (Exception e){
	     		Log.error("Product 2 Name is not found");
	     		throw(e);
	     		}
	     	return element;
	        }
	
	
	     public static WebElement btn_AddToCart() throws Exception{
	    	  element = null;
	       	try{
	       		element= driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[4]/div[2]/form/div[2]/div[1]/span/input"));
	       		Log.info("Add to Cart button is found for Product 2");
	       	}catch (Exception e){
	       		Log.error("Product 2 Add to Cart button is not found");
	       		throw(e);
	       		}
	       	return element;
	     	}
	 
	     }
	
	
	public static class PopUpAddToCart{
		 
	    
		 public static WebElement btn_GoToCart() throws Exception{
	   	 element = null;
	      	try{
	      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[1]"));
	      		Log.info("Go to Cart button is found on the Cart Pop Up window");
	      	}catch (Exception e){
	      		Log.info("Go to Cart button is not found on the Cart Pop Up window");
	      		throw(e);
	      		}
	      	return element;
	       }
		 
		 public static WebElement btn_ContShopping() throws Exception{
		   	 element = null;
		      	try{
		      		element= driver.findElement(By.xpath(".//*[@id='fancy_notification_content']/a[2]"));
		      		Log.info("Continue Shopping button is found on Cart Pop Up window");
		      	}catch (Exception e){
		      		Log.info("Continue Shopping button is not found on Cart Pop Up window");
		      		throw(e);
		      		}
		      	return element;
		       }
		}
	 
}