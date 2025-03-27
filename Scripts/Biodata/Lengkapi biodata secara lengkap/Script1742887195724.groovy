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
/*
// Personal Data
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/PersonalData/label_personal_data'), 'Personal Data')

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_nama'), GlobalVariable.nama)

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_no_ktp'), GlobalVariable.no_ktp)

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_nama_panggilan'), GlobalVariable.nama)

WebUI.verifyElementText(findTestObject('Object Repository/Biodata/PersonalData/radio_laki'), 'Laki-Laki')
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/PersonalData/radio_perempuan'), 'Perempuan')
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/radio_laki'))

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_alamat_domisili'), GlobalVariable.alamat_domisili)

WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/dropdown_domisili'))
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/value_dropdown_kota_domisili_ke2'))

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_alamat_ktp'), GlobalVariable.alamat_ktp)

WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/dropdown_ktp'))
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/value_dropdown_kota_ktp_ke5'))

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/PersonalData/dropdown_ktp'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_tempat_lahir'), GlobalVariable.tempat_lahir)
WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_tgl_lahir'), '01-01-2000')

WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/dropdown_agama'))
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/value_dropdown_agama_ke1'))

WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/dropdown_status_perkawinan'))
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/value_dropdown_status_perkawinan_ke1'))

WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/dropdown_golongan_darah'))
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/value_dropdown_golongan_darah_ke3'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Biodata/PersonalData/input_email'), 'value', GlobalVariable.email, GlobalVariable.delay)

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_nomor_telepon'), GlobalVariable.telphone)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/PersonalData/input_nomor_telepon'), GlobalVariable.delay)

WebUI.uploadFile(findTestObject('Object Repository/Biodata/PersonalData/upload_foto'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Image\\johndoe.png')

WebUI.uploadFile(findTestObject('Object Repository/Biodata/PersonalData/upload_cv'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Image\\cv.pdf')

WebUI.uploadFile(findTestObject('Object Repository/Biodata/PersonalData/upload_portfolio'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Image\\portfolio.pdf')

WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/btn_save_personal_data'))

//Keluarga
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Keluarga/label_keluarga'), GlobalVariable.delay)

WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_ayah'), GlobalVariable.ayah)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_tgl_lahir_ayah'), '21-05-1980')
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_pendidikan_ayah'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_pendidikan_ayah'), 'S3', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_pekerjaan_ayah'), 'DPRD Banten')

WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_ibu'), GlobalVariable.ibu)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_tgl_lahir_ibu'), '21-05-1985')
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_pendidikan_ibu'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_pendidikan_ibu'), 'S1', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_pekerjaan_ibu'), 'Ibu rumah tangga')

WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_anak1'), GlobalVariable.anak1)
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_jenis_kelamin_anak1'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_jenis_kelamin_anak1'), 'L', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_tgl_lahir_anak1'), '21-05-1990')
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_pendidikan_anak1'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_pendidikan_anak1'), 'S1', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_pekerjaan_anak1'), 'Karyawan')

WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/btn_tambah_anak'))
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_anak2'), GlobalVariable.anak2)
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_jenis_kelamin_anak2'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_jenis_kelamin_anak2'), 'P', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_tgl_lahir_anak2'), '21-05-2005')
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_pendidikan_anak2'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_pendidikan_anak2'), 'SMA', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_pekerjaan_anak2'), 'Pelajar')

WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/btn_tambah_anak'))
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/btn_hapus_anak'))
WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Keluarga/btn_tambah_anak'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_suami_istri'), 'Fanny')
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_jenis_kelamin_suami_istri'), 'P', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_tgl_lahir_suami_istri'), '20-03-2000')
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_pendidikan_suami_istri'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_pendidikan_suami_istri'), 'S1', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_pekerjaan_suami_istri'), 'Ibu rumah tangga')
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_telepon_suami_istri'), GlobalVariable.telphone)

WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_anak1_section2'), 'Struick')
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_jenis_kelamin_anak1_section2'), 'L', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_tgl_lahir_anak1_section2'), '25-05-2009')
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_pendidikan_anak1_section2'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_pendidikan_anak1_section2'), 'S1', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_pekerjaan_anak1_section2'), 'Atlit Sepak Bola Senior')
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_telepon_anak1_section2'), GlobalVariable.telphone)

WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_anak2_section2'), 'Haye')
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_jenis_kelamin_anak2_section2'), 'L', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_tgl_lahir_anak2_section2'), '29-09-2010')
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/dropdown_pendidikan_anak2_section2'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Keluarga/value_dropdown_pendidikan_anak2_section2'), 'S1', true)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_pekerjaan_anak2_section2'), 'Atlit Sepak Bola U20')
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_telepon_anak2_section2'), GlobalVariable.telphone)

WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/btn_tambah_anak_section2'))
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/btn_hapus_anak_section2'))
WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Keluarga/input_telepon_suami_istri'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_nama_darurat'), 'Jay Idzes')
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_hubungan_darurat'), 'Sahabat')
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_alamat_darurat'), 'Venezia, Italia')
WebUI.setText(findTestObject('Object Repository/Biodata/Keluarga/input_telepon_darurat'), GlobalVariable.telphone)

WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/btn_save_keluarga'))
*/

WebUI.
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/btn_save_personal_data'))




