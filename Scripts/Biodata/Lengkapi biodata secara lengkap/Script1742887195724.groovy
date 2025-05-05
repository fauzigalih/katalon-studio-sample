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

// Personal Data
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/PersonalData/label_personal_data'), 'Personal Data')

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_nama'), GlobalVariable.nama)

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_no_ktp'), no_ktp)

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_nama_panggilan'), GlobalVariable.nama)

WebUI.verifyElementText(findTestObject('Object Repository/Biodata/PersonalData/radio_laki'), 'Laki-Laki')
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/PersonalData/radio_perempuan'), 'Perempuan')
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/radio_laki'))

WebUI.setText(findTestObject('Object Repository/Biodata/PersonalData/input_alamat_domisili'), alamat_domisili)

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

WebUI.uploadFile(findTestObject('Object Repository/Biodata/PersonalData/upload_foto'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\johndoe.png')

WebUI.uploadFile(findTestObject('Object Repository/Biodata/PersonalData/upload_cv'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\cv.pdf')

WebUI.uploadFile(findTestObject('Object Repository/Biodata/PersonalData/upload_portfolio'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\portfolio.pdf')

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


// Pendidikan
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_nama_sekolah_sma'), 'SMA Negeri 58 Jakarta')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_mulai_sma'), '2015')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_selesai_sma'), '2018')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_jurusan_sma'), 'IPA')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_ipk_sma'), '8.5')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_nama_sekolah_d3'), 'Universitas Serang Raya')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_mulai_d3'), '2018')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_selesai_d3'), '2023')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_jurusan_d3'), 'Teknik Informatika')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_ipk_d3'), '3.7')

WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_nama_sekolah_s1'), 'Universitas Serang Raya')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_mulai_s1'), '2023')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_selesai_s1'), '2024')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_jurusan_s1'), 'Teknik Informatika')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_ipk_s1'), '3.9')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_nama_sekolah_s2'), 'Universitas Gajah Mada')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_mulai_s2'), '2024')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_tahun_selesai_s2'), '2026')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_jurusan_s2'), 'Teknik Informatika')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_ipk_s2'), '3.6')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Pendidikan/input_ipk_s2'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan1'), 'QA Automation')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan_institusi1'), 'Kemkominfo')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan_tahun_mulai1'), '2023')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan_tahun_selesai1'), '2023')
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Pendidikan/value_dropdown_pelatihan_sertifikat1'), 'Y', true)

WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_tambah_pelatihan'))
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan2'), 'Database Engineer')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan_institusi2'), 'Kemkominfo')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan_tahun_mulai2'), '2024')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_pelatihan_tahun_selesai2'), '2024')
WebUI.selectOptionByValue(findTestObject('Object Repository/Biodata/Pendidikan/value_dropdown_pelatihan_sertifikat2'), 'T', true)

WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_tambah_pelatihan'))
WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_hapus_pelatihan'))
WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Pendidikan/btn_tambah_pelatihan'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan1'), 'Kegiatan Amal')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_organisasi1'), 'Amal Soleh')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_periode1'), '2024')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_jabatan1'), 'Anggota')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_keterangan1'), 'Santunan Anak Yatim Piatu')

WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_tambah_kegiatan'))
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan2'), 'Kegiatan Sosial')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_organisasi2'), 'Sosial Experiment')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_periode2'), '2024')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_jabatan2'), 'Anggota')
WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan_keterangan2'), 'Prank')

WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_tambah_kegiatan'))
WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_hapus_kegiatan'))
WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Biodata/Pendidikan/input_hobi'), 'Belajar hal baru, membaca berita, dan membaca pikiran.')
WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_save_pendidikan'))


// Riwayat Pekerjaan
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/label_riwayat_pekerjaan'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'))
WebUI.sendKeys(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'), Keys.chord(Keys.ENTER))
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'))
WebUI.sendKeys(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'), Keys.chord(Keys.ENTER))
WebUI.verifyElementPresent(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'))
WebUI.sendKeys(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_pengalaman_kerja'), Keys.chord(Keys.ENTER))
WebUI.verifyElementPresent(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman'), GlobalVariable.delay)

WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman'))
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman'), GlobalVariable.delay)

WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_perusahaan1'), 'PT. Karya Digital')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_telepon_perusahaan1'), GlobalVariable.telphone)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_alamat_perusahaan1'), 'Jl Raya Sekang KM 40')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_jumlah_karyawan1'), '100')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_alasan_berhenti1'), 'Perusahaan tidak jalan karena covid-19')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_jabatan1'), 'Junior Web Developer')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_status_karyawan1'))
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/value_dropdown_status_karyawan1'))
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_lama_bekerja_mulai1'), '01-03-2020')
WebUI.check(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'), GlobalVariable.delay)
WebUI.uncheck(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja1'))
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_lama_bekerja_selesai1'), '30-05-2020')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja1'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja1'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_atasan1'), 'Michael Baker')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_gaji_terakhir1'), '10,000,000')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_deskripsi_pekerjaan1'), 'Membangun website sesuai dengan struktur analis.')

WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman_bottom1'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_perusahaan2'), GlobalVariable.delayLong)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_alasan_berhenti2'), GlobalVariable.delayLong)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_hapus_pengalaman_bottom1'))

WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman_bottom1'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_deskripsi_pekerjaan1'), GlobalVariable.delay)

WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_perusahaan2'), 'Bisnis Indonesia Group')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_telepon_perusahaan2'), GlobalVariable.telphone)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_alamat_perusahaan2'), 'Jl KH Mas Mansyur No. 12A Jakarta Pusat')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_jumlah_karyawan2'), '200')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_alasan_berhenti2'), 'Ingin mencari pengalaman yang lebih luas.')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_jabatan2'), 'QA Engineer & Deployment')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_status_karyawan2'))
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/value_dropdown_status_karyawan2'))
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_lama_bekerja_mulai2'), '01-11-2021')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja2'))
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_lama_bekerja_selesai2'), '30-05-2025')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja2'))
WebUI.check(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini2'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini2'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_atasan2'), 'Kristina Nuraeni')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_gaji_terakhir2'), '20,000,000')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_deskripsi_pekerjaan2'), 'Testing dan Deployment aplikasi')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_atasan2'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_add_pengalaman_bottom2'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_deskripsi_pekerjaan2'), GlobalVariable.delayLong)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_status_karyawan3'), GlobalVariable.delayLong)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_hapus_pengalaman_bottom2'))
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_simpan_pengalaman'))
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/modal_riwayat_pekerjaan_pengalaman_simpan'), 'Data Berhasil Dibuat')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/label_riwayat_pekerjaan'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_edit_pengalaman2'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/label_riwayat_pekerjaan'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_perusahaan1'), 'PT. Karya Digital Solusindo')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_telepon_perusahaan1'), GlobalVariable.telphone)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_alamat_perusahaan1'), 'Alam Sutra Tangerang Selatan')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_jumlah_karyawan1'), '10')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_alasan_berhenti1'), 'Perusahaan tidak jalan karena covid-19')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_jabatan1'), 'Junior Web Developer')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_status_karyawan1'))
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/value_dropdown_status_karyawan1'))
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_lama_bekerja_mulai1'), '01-03-2020')
WebUI.check(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'), GlobalVariable.delay)
WebUI.uncheck(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/checkbox_masih_bekerja_disini1'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja1'))
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_lama_bekerja_selesai1'), '30-05-2020')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja1'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/space_kosong_lama_bekerja1'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_nama_atasan1'), 'Michael')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_gaji_terakhir1'), '5,000,000')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_deskripsi_pekerjaan1'), 'Membangun website sesuai dengan struktur analis.')
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/dropdown_status_karyawan1'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_update_pengalaman'))
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/modal_riwayat_pekerjaan_pengalaman_update'), 'Data Berhasil Diperbarui')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/label_riwayat_pekerjaan'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_hapus_pengalaman2'))
WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/section_prestasi_kekuatan_kelemahan'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_prestasi'), 'Sukseskan acara seminar nasional.')
WebUI.setText(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/input_kekuatan_kelemahan'), 'Kekuatan: \nPengendalian emosi dan tenang \n\nKekurangan: \nPemalu')
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_save_riwayat_pekerjaan'))


// Keterangan Lain
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan1_ya'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan1_ya'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan1_tidak'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan1_tidak'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan1_ya'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan1_ya'))
WebUI.setText(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan1'), 'QA Engineer')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan1'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan2_ya'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan2_ya'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan2_tidak'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan2_tidak'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan2_ya'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan2_ya'))
WebUI.setText(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan2'), 'Penyakit Maag, Asam Lambung')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan2'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan3_ya'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan3_ya'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan3_tidak'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan3_tidak'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan3_ya'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan3_ya'))
WebUI.setText(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan3'), 'Patrick Kluivert, Head Coach Indonesia, Paman')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan3'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan4_ya'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan4_ya'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan4_tidak'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan4_tidak'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan4_ya'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/KeteranganLain/radiobtn_pertanyaan4_ya'))
WebUI.setText(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan4'), 'Ole Romeny, Striker Indonesia, Teman')

WebUI.click(findTestObject('Object Repository/Biodata/KeteranganLain/btn_save_keterangan_lain'))


// Upload Dokumen
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/UploadDokumen/label_upload_dokumen'), GlobalVariable.delay)
WebUI.uploadFile(findTestObject('Object Repository/Biodata/UploadDokumen/upload_ktp'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\ktp.jpg')
WebUI.uploadFile(findTestObject('Object Repository/Biodata/UploadDokumen/upload_kk'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\kk.pdf')
WebUI.uploadFile(findTestObject('Object Repository/Biodata/UploadDokumen/upload_ijazah'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\ijazah.pdf')
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/UploadDokumen/upload_ijazah'), GlobalVariable.delay)
WebUI.uploadFile(findTestObject('Object Repository/Biodata/UploadDokumen/upload_transkip_nilai'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\transkip.pdf')
WebUI.uploadFile(findTestObject('Object Repository/Biodata/UploadDokumen/upload_surat_referensi_kerja'), 'C:\\Users\\fauzi.galih\\Katalon Studio\\Karier Bisnis Indonesia\\Sources\\referensi.pdf')
WebUI.click(findTestObject('Object Repository/Biodata/UploadDokumen/btn_save_upload_dokumen'))


// Tunjangan & Fasilitas
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/TunjanganFasilitas/label_tunjangan_fasilitas'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/TunjanganFasilitas/input_gaji_terakhir'), '10,000,000')
WebUI.setText(findTestObject('Object Repository/Biodata/TunjanganFasilitas/input_gaji_diminta'), '20,000,000')
WebUI.check(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_dapat_dirundingkan_ya'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_dapat_dirundingkan_ya'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_dapat_dirundingkan_tidak'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_dapat_dirundingkan_tidak'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_dapat_dirundingkan_tidak'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_dapat_dirundingkan_ya'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_dapat_dirundingkan_ya'))

WebUI.check(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_segera'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_segera'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_setelah_tanggal'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_estimasi'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_setelah_tanggal'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_segera'), GlobalVariable.delay)
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_setelah_tanggal'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_estimasi'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/TunjanganFasilitas/input_ketersediaan_setelah_tanggal'), '30-05-2025')
WebUI.check(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_estimasi'))
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_segera'), GlobalVariable.delay)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_setelah_tanggal'), GlobalVariable.delay)
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/radiobtn_ketersediaan_estimasi'), GlobalVariable.delay)
WebUI.setText(findTestObject('Object Repository/Biodata/TunjanganFasilitas/input_ketersediaan_estimasi'), '1')

WebUI.scrollToElement(findTestObject('Object Repository/Biodata/TunjanganFasilitas/input_ketersediaan_estimasi'), GlobalVariable.delay)
WebUI.check(findTestObject('Object Repository/Biodata/TunjanganFasilitas/check_kebijakan'))
WebUI.verifyElementChecked(findTestObject('Object Repository/Biodata/TunjanganFasilitas/check_kebijakan'), GlobalVariable.delay)

WebUI.click(findTestObject('Object Repository/Biodata/TunjanganFasilitas/btn_save_tunjangan_fasilitas'))
WebUI.verifyElementText(findTestObject('Object Repository/Biodata/TunjanganFasilitas/modal_tunjangan_fasilitas_berhasil'), 'Data Berhasil Diperbarui')
WebUI.click(findTestObject('Object Repository/Biodata/TunjanganFasilitas/btn_kembali_ke_halaman_utama'))

WebUI.closeBrowser()

/*
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/PersonalData/dropdown_ktp'), GlobalVariable.delay)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/PersonalData/input_nomor_telepon'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/PersonalData/btn_save_personal_data'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Keluarga/label_keluarga'), GlobalVariable.delay)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Keluarga/btn_tambah_anak'), GlobalVariable.delay)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Keluarga/input_telepon_suami_istri'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/Keluarga/btn_save_keluarga'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Pendidikan/input_ipk_s2'), GlobalVariable.delay)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Pendidikan/btn_tambah_pelatihan'), GlobalVariable.delay)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/Pendidikan/input_kegiatan1'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/Pendidikan/btn_save_pendidikan'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/label_riwayat_pekerjaan'), GlobalVariable.delay)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/section_prestasi_kekuatan_kelemahan'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/RiwayatPekerjaan/btn_save_riwayat_pekerjaan'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/KeteranganLain/input_pertanyaan2'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/KeteranganLain/btn_save_keterangan_lain'))
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/UploadDokumen/label_upload_dokumen'), GlobalVariable.delay)
WebUI.scrollToElement(findTestObject('Object Repository/Biodata/UploadDokumen/upload_ijazah'), GlobalVariable.delay)
WebUI.click(findTestObject('Object Repository/Biodata/UploadDokumen/btn_save_upload_dokumen'))
*/
