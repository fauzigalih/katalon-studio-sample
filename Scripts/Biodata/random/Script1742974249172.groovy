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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://karirdev3.bisnisindonesia.id/')

WebUI.click(findTestObject('Object Repository/Random/div_Login'))

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control'), 't')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1'), 'te')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2'), 'tes')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3'), 'test')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4'), 'testi')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5'), 'testin')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6'), 'testing')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7'), 'testingd')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8'), 'testingde')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9'), 'testingdes')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10'), 'testingdesk')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11'), 
    'testingdeskt')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'testingdeskto')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'testingdesktop')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    'testingdesktop3')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    'testingdesktop3+')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'testingdesktop3+1')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'testingdesktop3+10')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'), 
    'testingdesktop3+100')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'), 
    'testingdesktop3+100@')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'), 
    'testingdesktop3+100@g')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21'), 
    'testingdesktop3+100@ga')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'), 
    'testingdesktop3+100@g')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22'), 
    'testingdesktop3+100@gm')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23'), 
    'testingdesktop3+100@gma')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24'), 
    'testingdesktop3+100@gmai')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25'), 
    'testingdesktop3+100@gmail')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26'), 
    'testingdesktop3+100@gmail.')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27'), 
    'testingdesktop3+100@gmail.c')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28'), 
    'testingdesktop3+100@gmail.co')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29'), 
    'testingdesktop3+100@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control'), 'w8atsD+HWGA=')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1'), '5YBX8nk5MuA=')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2'), 'KMoFZeaWkJg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3'), 'P11S1FO2cCA=')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4'), 'wD5SB8vrgas=')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5'), 'Ol+yO8Rfw+k=')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6'), 
    'E2TLQFXDXGo=')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7'), 
    'UKQSOiE+2phuOXCXz8MkWg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8'), 
    'UKQSOiE+2piO7b/eOeG17w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8_9'), 
    'UKQSOiE+2pjK5473J5yrOQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8_9_10'), 
    'UKQSOiE+2pi+VRh1uspoug==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8_9_10_11'), 
    'UKQSOiE+2pgqO2C6PmkEXA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12'), 
    'UKQSOiE+2pi+4Y5JhJSjfA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    'UKQSOiE+2phedFa3jAY6rA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 
    'UKQSOiE+2pi7T0Lzdh7hdw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Random/input_Password_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 
    'UKQSOiE+2pghxes+2bJCUqDHcKEBXWKs')

WebUI.click(findTestObject('Object Repository/Random/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Random/button_Testing Desktop 3'))

WebUI.click(findTestObject('Object Repository/Random/a_Edit Profile'))

WebUI.click(findTestObject('Object Repository/Biodata/dropdown_domisili'))

WebUI.click(findTestObject('Object Repository/Random/div_Aceh Barat'))

WebUI.rightClick(findTestObject('Object Repository/Biodata/dropdown_domisili'))

WebUI.click(findTestObject('Object Repository/Random/div_Kota Domisili Aceh Barat'))

WebUI.click(findTestObject('Object Repository/Biodata/dropdown_domisili'))

WebUI.click(findTestObject('Object Repository/Random/div_Aceh Barat'))

WebUI.click(findTestObject('Object Repository/Random/div_Pilih_css-19bb58m_1'))

WebUI.click(findTestObject('Object Repository/Random/div_Aceh Barat'))

WebUI.click(findTestObject('Object Repository/Random/div_Pilih_css-19bb58m_1_2'))

WebUI.click(findTestObject('Object Repository/Random/div_Islam'))

WebUI.click(findTestObject('Object Repository/Random/div_Pilih_css-19bb58m_1_2_3'))

WebUI.click(findTestObject('Object Repository/Random/div_A'))

