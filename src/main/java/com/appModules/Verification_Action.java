package com.appModules;

import org.testng.Reporter;

import com.pageObjects.BaseClass;
import com.pageObjects.CheckOut_Page;
import com.pageObjects.Confirmation_Page;

// This is called Modularization, when we club series of actions in to one Module
// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/ 
public class Verification_Action {
	 // I could have created a Function for it but I keep calculations in Functions and test steps in Module Actions
	 // It could have been avoided and simply put these steps in Test Case, it depends totally on you, everybody has their own choice
	public static void Execute() throws Exception{
		
		// This is to check that if the Product Name stored from Checkout & Confirmation page is same 
		// These are static variables, see how easy is to use them in your test
		if(CheckOut_Page.sProductName.equals(Confirmation_Page.sProductName)){
			// Here I have put a verification check on the Product Name, if it is matched, my verification will pass
			Reporter.log("Verification Passed for Product Name");
			
		}else{
			// If it not matched then the verification check is failed
			Reporter.log("Verification Failed for Product Name");
     		// If the above verification gets failed then I have to report this to my test and fail the test accordingly
     		// To achieve this, I have initialized this variable of Base class at the start of my test with value true in it
     		// At the end of my test, i will match the value, if it will be false then I will fail the test, else the test will be pass
			BaseClass.bResult=false;
		}
		
		if(CheckOut_Page.sProductPrice.equals(Confirmation_Page.sProductPrice)){
			Reporter.log("Verification Passed for Product Price");
		}else{
			Reporter.log("Verification Failed for Product Price");
			BaseClass.bResult=false;
		}
	}

}
