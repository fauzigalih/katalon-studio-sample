package client

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.entity.global.GlobalVariableEntity
import java.util.concurrent.ThreadLocalRandom

import internal.GlobalVariable

public class Auth {
	@Keyword
	def static void openBrowser(){
		WebUI.openBrowser(GlobalVariable.applicationURL)
		WebUI.waitForPageLoad(GlobalVariable.delayLong)
		WebUI.maximizeWindow()
	}

	@Keyword
	def static void loginApp(){
		openBrowser()
		WebUI.click(findTestObject('Object Repository/Login/link_login'))
		WebUI.setText(findTestObject('Object Repository/Login/input_email'), GlobalVariable.email)
		WebUI.click(findTestObject('Object Repository/Login/show_password'))
		WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_password'), GlobalVariable.password)  // pwd: Testingdesktop3!
		WebUI.click(findTestObject('Object Repository/Login/btn_login'))
		WebUI.verifyElementText(findTestObject('Object Repository/Login/fullname'), 'Testing Desktop 3')
	}

	@Keyword
	public String getEmail(String suffix,String prefix){
		int randomNo = (int)(Math.random() * 1000);
		return suffix + randomNo + "@" + prefix;
	}

	@Keyword
	def randomNumber(int minimum, int maximum) {
		def randomNumber = ThreadLocalRandom.current().nextInt(minimum, maximum + 1);
		return randomNumber;
	}
}
