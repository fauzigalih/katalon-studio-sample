import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'client.Auth.openBrowser'()

WebUI.click(findTestObject('Object Repository/Login/link_login'))

WebUI.setText(findTestObject('Object Repository/Login/input_email'), CustomKeywords.'client.Auth.getEmail'(GlobalVariable.mailSuffix, GlobalVariable.mailPrefix))

WebUI.delay(GlobalVariable.delay)

WebUI.click(findTestObject('Object Repository/Login/show_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Login/btn_login'))

WebUI.verifyElementText(findTestObject('Login/modal_login_email_tidak_terdaftar'), 'Sorry, Email tidak terdaftar')

WebUI.closeBrowser()