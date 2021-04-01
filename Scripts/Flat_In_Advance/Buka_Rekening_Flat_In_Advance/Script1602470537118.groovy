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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//open browser
WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.31.1.104:9000/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_DEV_txtUserName'), '0320131')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_DEV_txtPassword'), 'ABdxqtKrMrjcaniLVMqtrg==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_DEV_btnLogin'))

WebUI.click(findTestObject('Page_Pembukaan_Rekening/a_Loan'))

WebUI.click(findTestObject('Page_Pembukaan_Rekening/a_Pembukaan Rekening'))

WebUI.doubleClick(findTestObject('Page_Pembukaan_Rekening/input__txtCIFSearch'))

WebUI.setText(findTestObject('Page_Pembukaan_Rekening/input__txtCIFSearch'), '0000000079')

WebUI.click(findTestObject('Page_Pembukaan_Rekening/input__btnCIFSubmit'))

WebUI.selectOptionByValue(findTestObject('Page_Pembukaan_Rekening/select_- Pilih Kode Fasilitas -N - 03200000_b63e98'), 
    '0320/0000000079/PK2/004', true)

WebUI.selectOptionByValue(findTestObject('Page_Pembukaan_Rekening/select_- Pilih Loan Type -10001 - KRETAP100_1c2cf6'), 
    '10006', true)

WebUI.setText(findTestObject('Page_Pembukaan_Rekening/input__txtAmt'), '40000000')

WebUI.click(findTestObject('Page_Pembukaan_Rekening/table_Kode Cabang                          _ec749a'))

WebUI.setText(findTestObject('Page_Pembukaan_Rekening/input__txtNomRate'), '2')

WebUI.setText(findTestObject('Page_Pembukaan_Rekening/input_Suku Bunga Pinalti ()_txtpenalty'), '1')

WebUI.setText(findTestObject('Page_Pembukaan_Rekening/input__txtLoanTerm'), '12')

WebUI.selectOptionByValue(findTestObject('Page_Pembukaan_Rekening/select_-- Pilih Jenis Suku Bunga --FixedFlo_3f8a28'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Pembukaan_Rekening/select_-- Pilih Tipe Perhitungan Bunga --FL_2ca165'), 
    'FLAT IN ADVANCE', true)

WebUI.selectOptionByValue(findTestObject('Page_Pembukaan_Rekening/select_- Silahkan pilih Supervisor -0320005_1f1945'), 
    '0320005', true)

WebUI.click(findTestObject('Page_Pembukaan_Rekening/input__btnOK'))

//WebUI.selectOptionByValue(findTestObject('Page_Pembukaan_Rekening/select_- Pilih Loan Type -10001 - KRETAP100_1c2cf6'), 
 //   '10006', true)


WebUI.click(findTestObject('Page_Pembukaan_Rekening/a_Logout'))

