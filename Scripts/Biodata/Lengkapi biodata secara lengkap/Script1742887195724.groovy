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

CustomKeywords.'client.Auth.loginApp'()

WebUI.click(findTestObject('Object Repository/Login/fullname'))

WebUI.click(findTestObject('Object Repository/Biodata/link_edit_biodata'))

WebUI.verifyElementText(findTestObject('Object Repository/Biodata/label_personal_data'), 'Personal Data')

WebUI.setText(findTestObject('Object Repository/Biodata/input_nama'), GlobalVariable.nama)

WebUI.setText(findTestObject('Object Repository/Biodata/input_no_ktp'), GlobalVariable.no_ktp)

WebUI.setText(findTestObject('Object Repository/Biodata/input_nama_panggilan'), GlobalVariable.nama)

WebUI.verifyElementText(findTestObject('Object Repository/Biodata/radio_laki'), 'Laki-Laki')
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/radio_perempuan'), 'Perempuan')
WebUI.click(findTestObject('Object Repository/Biodata/radio_laki'))

WebUI.setText(findTestObject('Object Repository/Biodata/input_alamat_domisili'), GlobalVariable.alamat_domisili)

WebUI.click(findTestObject('Object Repository/Biodata/dropdown_domisili'))
WebUI.click(findTestObject('Object Repository/Biodata/value_dropdown_kota_domisili_ke2'))

WebUI.setText(findTestObject('Object Repository/Biodata/input_alamat_ktp'), GlobalVariable.alamat_ktp)

WebUI.click(findTestObject('Object Repository/Biodata/dropdown_ktp'))
WebUI.click(findTestObject('Object Repository/Biodata/value_dropdown_kota_ktp_ke5'))

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/dropdown_ktp'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/input_tempat_lahir'), GlobalVariable.tempat_lahir)
WebUI.setText(findTestObject('Object Repository/Biodata/input_tgl_lahir'), '01-01-2000')

WebUI.click(findTestObject('Object Repository/Biodata/dropdown_agama'))
WebUI.click(findTestObject('Object Repository/Biodata/value_dropdown_agama_ke1'))

WebUI.click(findTestObject('Object Repository/Biodata/dropdown_status_perkawinan'))
WebUI.click(findTestObject('Object Repository/Biodata/value_dropdown_status_perkawinan_ke1'))

WebUI.click(findTestObject('Object Repository/Biodata/dropdown_golongan_darah'))
WebUI.click(findTestObject('Object Repository/Biodata/value_dropdown_golongan_darah_ke3'))

WebUI.delay(5)
//
//WebUI.closeBrowser()