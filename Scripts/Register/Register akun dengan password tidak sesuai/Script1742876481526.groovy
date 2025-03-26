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

WebUI.click(findTestObject('Register/link_login'))
WebUI.click(findTestObject('Register/link_register'))

WebUI.sendKeys(findTestObject('Register/input_nama'), GlobalVariable.nama)
WebUI.sendKeys(findTestObject('Register/input_email'), GlobalVariable.email)
WebUI.sendKeys(findTestObject('Register/input_telp'), GlobalVariable.telphone)
WebUI.click(findTestObject('Register/show_password'))
WebUI.sendKeys(findTestObject('Register/input_password'), 'wrong-password')
WebUI.delay(GlobalVariable.delay)

WebUI.click(findTestObject('Register/btn_register'))
WebUI.verifyElementText(findTestObject('Register/modal_register_password_tidak_sesuai'), 'Sorry, Password tidak sesuai')

WebUI.closeBrowser()