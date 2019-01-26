package com.appModules;
import org.testng.Reporter;

import com.pageObjects.Home_Page;
import com.pageObjects.LogIn_Page;
import com.utility.Log;

import com.utility.Constant;
import com.utility.ExcelUtils;
import com.utility.Utils;
     
    // This is called Modularization, when we club series of actions in to one Module
	// For Modular Driven Framework, please see http://www.toolsqa.com/modular-driven/   
    public class SignIn_Action {
    	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
    	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
    	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
        public static void Execute(int iTestCaseRow) throws Exception{
        	
        	// Clicking on the My Account link on the Home Page
        	Home_Page.lnk_MyAccount().click();
        	Log.info("Click action is perfromed on My Account link" );
        	
        	// Storing the UserName in to a String variable and Getting the UserName from Test Data Excel sheet
        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_UserName is the column number for UserName column in the Test Data sheet
        	// Please see the Constant class in the Utility Package
        	// For Use of Constant Variables, please see http://www.toolsqa.com/constant-variables/
        	String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
        	// Here we are sending the UserName string to the UserName Textbox on the LogIN Page
        	// This is call Page Object Model (POM)
        	// For use of POM, please see http://www.toolsqa.com/page-object-model/
            LogIn_Page.txtbx_UserName().sendKeys(sUserName);
            // Printing the logs for what we have just performed
            Log.info(sUserName+" is entered in UserName text box" );
            
            String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
            LogIn_Page.txtbx_Password().sendKeys(sPassword);
            Log.info(sPassword+" is entered in Password text box" );
            
            LogIn_Page.btn_LogIn().click();
            Log.info("Click action is performed on Submit button");
            
            // I noticed in few runs that Selenium is trying to perform the next action before the complete Page load
            // So I have decided to put a wait on the Logout link element
            // Now it will wait 10 secs separately before jumping out to next step
            Utils.waitForElement(Home_Page.lnk_LogOut());
            
            // This is another type of logging, with the help of TestNg Reporter log
            // This has to be very carefully used, you should only print the very important message in to this
            // This will populate the logs in the TestNG HTML reports
            // I have used this Reporter log just once in this whole module 
            Reporter.log("SignIn Action is successfully perfomred");
            
        }
    }
