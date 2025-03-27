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
    'testingdesktop3+100@gm')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22'), 
    'testingdesktop3+100@gma')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23'), 
    'testingdesktop3+100@gmai')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24'), 
    'testingdesktop3+100@gmail')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25'), 
    'testingdesktop3+100@gmail.')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26'), 
    'testingdesktop3+100@gmail.c')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27'), 
    'testingdesktop3+100@gmail.co')

WebUI.setText(findTestObject('Object Repository/Random/input_Email_form-control form-control_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28'), 
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

WebUI.click(findTestObject('Object Repository/Random/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Random/button_Selanjutnya_1'))

WebUI.setText(findTestObject('Object Repository/Random/input__nama0'), 'SMA Negeri 58 Jakarta')

WebUI.setText(findTestObject('Object Repository/Random/input__mulai0'), '2000')

WebUI.setText(findTestObject('Object Repository/Random/input__selesai0'), '')

WebUI.click(findTestObject('Object Repository/Random/input__selesai0'))

WebUI.click(findTestObject('Object Repository/Random/td__py-3'))

WebUI.setText(findTestObject('Object Repository/Random/input__mulai0'), '2015')

WebUI.setText(findTestObject('Object Repository/Random/input__selesai0'), '2018')

WebUI.setText(findTestObject('Object Repository/Random/input__jurusan0'), 'IPA')

WebUI.setText(findTestObject('Object Repository/Random/input__ipk0'), '8.5')

WebUI.setText(findTestObject('Object Repository/Random/input_D3_nama1'), 'Universitas Serang Raya')

WebUI.setText(findTestObject('Object Repository/Random/input_D3_mulai1'), '2018')

WebUI.setText(findTestObject('Object Repository/Random/input_D3_selesai1'), '2023')

WebUI.setText(findTestObject('Object Repository/Random/input_D3_jurusan1'), 'Teknik Informatika')

WebUI.setText(findTestObject('Object Repository/Random/input_D3_ipk1'), '3.7')

WebUI.setText(findTestObject('Object Repository/Random/input_D3_selesai1'), '2023')

WebUI.setText(findTestObject('Object Repository/Random/input__nama2'), 'Universitas Serang Raya')

WebUI.setText(findTestObject('Object Repository/Random/input__mulai2'), '')

WebUI.click(findTestObject('Object Repository/Random/input__mulai2'))

WebUI.setText(findTestObject('Object Repository/Random/input__mulai2'), '2023')

WebUI.setText(findTestObject('Object Repository/Random/input__selesai2'), '2024')

WebUI.setText(findTestObject('Object Repository/Random/input__jurusan2'), 'Teknik Informatika')

WebUI.setText(findTestObject('Object Repository/Random/input__ipk2'), '3.9')

WebUI.setText(findTestObject('Object Repository/Random/input_S2_nama3'), 'Universitas Gajah Mada')

WebUI.setText(findTestObject('Object Repository/Random/input_D3_mulai1'), '2018')

WebUI.setText(findTestObject('Object Repository/Random/input_S2_mulai3'), '2024')

WebUI.setText(findTestObject('Object Repository/Random/input_S2_selesai3'), '2026')

WebUI.setText(findTestObject('Object Repository/Random/input_S2_jurusan3'), 'Teknik Informatika')

WebUI.setText(findTestObject('Object Repository/Random/input_S2_ipk3'), '3.6')

WebUI.click(findTestObject('Object Repository/Random/input_Sertifikat_pelatihan0'))

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_pelatihan0'), 'QA Automation')

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_nama_institusi0'), 'Kementrian Informatika')

WebUI.click(findTestObject('Object Repository/Random/input_Sertifikat_pelatihan0'))

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_nama_institusi0'), 'Kemkominfo')

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_mulai0'), '2023')

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_selesai0'), '')

WebUI.click(findTestObject('Object Repository/Random/input_Sertifikat_selesai0'))

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_selesai0'), '2023')

WebUI.selectOptionByValue(findTestObject('Object Repository/Random/select_--Pilih--YaTidak'), 'Y', true)

WebUI.click(findTestObject('Object Repository/Random/img_Sertifikat_icon-add mx-2'))

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_pelatihan1'), 'Database Engineer')

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_nama_institusi1'), 'Kemkominfo')

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_mulai1'), '2024')

WebUI.setText(findTestObject('Object Repository/Random/input_Sertifikat_selesai1'), '2024')

WebUI.selectOptionByValue(findTestObject('Object Repository/Random/select_--Pilih--YaTidak_1'), 'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Random/select_--Pilih--YaTidak_1'), 'T', true)

WebUI.click(findTestObject('Object Repository/Random/input_Sertifikat_pelatihan1'))

WebUI.click(findTestObject('Object Repository/Random/form_Pendidikan FormalPendidikanNama Sekola_2270ac'))

WebUI.click(findTestObject('Object Repository/Random/img_Sertifikat_icon-add mx-2'))

WebUI.click(findTestObject('Object Repository/Random/i_Sertifikat_btn btn-warning fa-solid fa-mi_8fcadf'))

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_jenis0'), 'Kegiatan Amal')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_lembaga0'), 'Amal Soleh')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_periode0'), '2024')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_jabatan0'), 'Anggota')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_keterangan0'), 'Santunan Anak Yatim Piatu')

WebUI.click(findTestObject('Object Repository/Random/img_Keterangan Lain_icon-add mx-2'))

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_jenis1'), 'Kegiatan Sosial')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_lembaga1'), 'Sosial Experiment')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_periode1'), '2024')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_jabatan1'), 'Anggota')

WebUI.setText(findTestObject('Object Repository/Random/input_Keterangan Lain_keterangan1'), 'Prank')

WebUI.click(findTestObject('Object Repository/Random/img_Keterangan Lain_icon-add mx-2'))

WebUI.click(findTestObject('Object Repository/Random/i_Keterangan Lain_btn btn-warning fa-solid _aa8276'))

WebUI.setText(findTestObject('Object Repository/Random/textarea_M'), 'M')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Me'), 'Me')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Men'), 'Men')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Mena'), 'Mena')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Menab'), 'Menab')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Menabu'), 'Menabu')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Menabun'), 'Menabun')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Menabung'), 'Menabung')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Menabun'), 'Menabun')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Menabu'), 'Menabu')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Menab'), 'Menab')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Mena'), 'Mena')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Men'), 'Men')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Me'), 'Me')

WebUI.setText(findTestObject('Object Repository/Random/textarea_M'), 'M')

WebUI.setText(findTestObject('Object Repository/Random/textarea__hobi'), '')

WebUI.setText(findTestObject('Object Repository/Random/textarea_B'), 'B')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Be'), 'Be')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Bel'), 'Bel')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Bela'), 'Bela')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belaj'), 'Belaj')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belaja'), 'Belaja')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar'), 'Belajar')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar_1'), 'Belajar ')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar h'), 'Belajar h')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar ha'), 'Belajar ha')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal'), 'Belajar hal')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal_1'), 'Belajar hal ')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal b'), 'Belajar hal b')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal ba'), 'Belajar hal ba')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal bar'), 'Belajar hal bar')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru'), 'Belajar hal baru')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru,'), 'Belajar hal baru,')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru,_1'), 'Belajar hal baru, ')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, m'), 'Belajar hal baru, m')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, me'), 'Belajar hal baru, me')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, mem'), 'Belajar hal baru, mem')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, memb'), 'Belajar hal baru, memb')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, memba'), 'Belajar hal baru, memba')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membac'), 'Belajar hal baru, membac')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca'), 'Belajar hal baru, membaca')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca_1'), 'Belajar hal baru, membaca ')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca b'), 'Belajar hal baru, membaca b')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca be'), 'Belajar hal baru, membaca be')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca ber'), 'Belajar hal baru, membaca ber')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca beri'), 'Belajar hal baru, membaca beri')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berit'), 'Belajar hal baru, membaca berit')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita'), 'Belajar hal baru, membaca berita')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita,'), 'Belajar hal baru, membaca berita,')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita,_1'), 'Belajar hal baru, membaca berita, ')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, d'), 'Belajar hal baru, membaca berita, d')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, da'), 'Belajar hal baru, membaca berita, da')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, dan'), 'Belajar hal baru, membaca berita, dan')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, dan_1'), 'Belajar hal baru, membaca berita, dan ')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, dan m'), 'Belajar hal baru, membaca berita, dan m')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, dan me'), 'Belajar hal baru, membaca berita, dan me')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, dan mem'), 'Belajar hal baru, membaca berita, dan mem')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _2841fe'), 'Belajar hal baru, membaca berita, dan memb')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _745442'), 'Belajar hal baru, membaca berita, dan memba')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _b564ff'), 'Belajar hal baru, membaca berita, dan membac')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _a500ab'), 'Belajar hal baru, membaca berita, dan membaca')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _a500ab_1'), 'Belajar hal baru, membaca berita, dan membaca ')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _ffc6e6'), 'Belajar hal baru, membaca berita, dan membaca p')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _0e42c8'), 'Belajar hal baru, membaca berita, dan membaca pi')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _281a94'), 'Belajar hal baru, membaca berita, dan membaca pik')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _9167ee'), 'Belajar hal baru, membaca berita, dan membaca piki')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _c6b860'), 'Belajar hal baru, membaca berita, dan membaca pikir')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _ede11b'), 'Belajar hal baru, membaca berita, dan membaca pikira')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _c5f59e'), 'Belajar hal baru, membaca berita, dan membaca pikiran')

WebUI.setText(findTestObject('Object Repository/Random/textarea_Belajar hal baru, membaca berita, _c5f59e_1'), 'Belajar hal baru, membaca berita, dan membaca pikiran.')

WebUI.closeBrowser()

