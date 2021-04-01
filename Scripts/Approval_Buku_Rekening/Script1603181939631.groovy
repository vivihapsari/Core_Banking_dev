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

//Halaman Login
WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.31.1.104:9000/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_DEV_txtUserName'), '0320005')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_DEV_txtPassword'), '33333333')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_DEV_txtPassword'), '33333333', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Login/input_DEV_btnLogin'))

//Halaman General
WebUI.click(findTestObject('Object Repository/Page_Approval/a_General'))

WebUI.click(findTestObject('Object Repository/Page_Approve_Reject/a_ApproveReject Dual Control'))

WebUI.click(findTestObject('Object Repository/Page_Approval_2/input_Membutuhkan Override Supervisor_showdetail button'))

//WebUI.click(findTestObject('Object Repository/Page_Approval_2/input_Approval Comment_btnAccept'))
WebUI.click(findTestObject('Object Repository/Page_Approval_2/input_Approval Comment_btnReject'))

WebUI.acceptAlert()

//WebUI.click(findTestObject('Object Repository/Page_Logout/a_Logout'))

