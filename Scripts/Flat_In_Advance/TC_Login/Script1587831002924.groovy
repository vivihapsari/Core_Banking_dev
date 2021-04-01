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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.maximizeWindow()

WebUI.takeScreenshot()

// case benar dan salah

switch (check.toString()) {
	
	case 'Ya':
	
		WebUI.setText(findTestObject('null'), username)

		WebUI.setText(findTestObject('null'), password)

		WebUI.click(findTestObject('null'))
	
		WebUI.takeScreenshot()
		
		// jika user masih login di perangkat lain
		if (WebUI.verifyTextPresent('User Id masih Login di perangkat lain atau anda keluar aplikasi tanpa Logout.', false,
			FailureHandling.OPTIONAL) == true) {
		
			WebUI.delay(3)
			
			WebUI.clearText(findTestObject('null'))
			
			WebUI.clearText(findTestObject('null'))
			
			WebUI.setText(findTestObject('null'), usernameSYS)
			
			WebUI.setText(findTestObject('null'), passwordSYS)
						
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
			
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
						
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
						
			WebUI.takeScreenshot()
			
			WebUI.selectOptionByValue(findTestObject('null'), kacabSYS, false)
						
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
						
			WebUI.takeScreenshot()
			
			// pilih user yang akan direset
			switch (pilihSYS.toString()) {
				
				case 'pilih1':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih2':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih3':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih4':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih5':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih6':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih7':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih8':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih9':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih10':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih11':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih12':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih13':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih14':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih15':
					WebUI.click(findTestObject('null'))

					break
			}
			
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))

			WebUI.click(findTestObject('null'))

			WebUI.waitForAlert(3)

			WebUI.verifyAlertPresent(3)

			WebUI.delay(3)

			WebUI.acceptAlert()
			
			WebUI.click(findTestObject('null'))

			WebUI.takeScreenshot()
			
			// pilih user yang akan direset
			switch (pilihSYS2.toString()) {
				case 'pilih1':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih2':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih3':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih4':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih5':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih6':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih7':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih8':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih9':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih10':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih11':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih12':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih13':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih14':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih15':
					WebUI.click(findTestObject('null'))

					break
			}
			
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
			
			WebUI.takeScreenshot()

			WebUI.click(findTestObject('null'))

			WebUI.waitForAlert(3)

			WebUI.verifyAlertPresent(3)

			WebUI.delay(3)

			WebUI.acceptAlert()

			WebUI.click(findTestObject('null'))
			
			WebUI.takeScreenshot()

			// pilih user yang akan direset
			switch (pilihSYS2.toString()) {
				case 'pilih1':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih2':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih3':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih4':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih5':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih6':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih7':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih8':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih9':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih10':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih11':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih12':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih13':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih14':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih15':
					WebUI.click(findTestObject('null'))

					break
			}
			
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
			
			WebUI.takeScreenshot()

			WebUI.click(findTestObject('null'))

			WebUI.waitForAlert(3)

			WebUI.verifyAlertPresent(3)

			WebUI.delay(3)

			WebUI.acceptAlert()

			WebUI.click(findTestObject('null'))

			WebUI.click(findTestObject('null'))

			WebUI.switchToDefaultContent()

			WebUI.click(findTestObject('null'))
			
			WebUI.setText(findTestObject('null'), usernameadm)
			
			WebUI.setText(findTestObject('null'), passwordadm)
						
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
						
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
						
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
			
			WebUI.selectOptionByValue(findTestObject('null'), kacabadmin, false)
						
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
			
			// pilih user yang akan direset
			switch (pilihSYS.toString()) {
				case 'pilih1':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih2':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih3':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih4':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih5':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih6':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih7':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih8':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih9':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih10':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih11':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih12':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih13':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih14':
					WebUI.click(findTestObject('null'))

					break
				case 'pilih15':
					WebUI.click(findTestObject('null'))

					break
			}
			
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))

			WebUI.setText(findTestObject('null'), ipadd)
			
			WebUI.takeScreenshot()

			WebUI.click(findTestObject('null'))

			WebUI.waitForAlert(3)

			WebUI.verifyAlertPresent(3)

			WebUI.delay(5)

			WebUI.acceptAlert()

			WebUI.click(findTestObject('null'))

			WebUI.switchToDefaultContent()

			WebUI.click(findTestObject('null'))
			
		} else {
		
			WebUI.delay(2)
		
		}
		
			break
		
		case 'No':
			WebUI.setText(findTestObject('null'), username)
	
			WebUI.setText(findTestObject('null'), password)
			
			WebUI.takeScreenshot()
	
			WebUI.click(findTestObject('null'))
	
			WebUI.verifyAlertPresent(2)
			
			WebUI.takeScreenshot()
	
			WebUI.acceptAlert()
	
			def info = WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.OPTIONAL)
	
			def username = info.username
	
			def password = info.password
	
			WebUI.clearText(findTestObject('null'))
	
			WebUI.setText(findTestObject('null'), username)
	
			WebUI.setText(findTestObject('null'), password)
	
			WebUI.takeScreenshot()
			
			WebUI.click(findTestObject('null'))
	
			break
		
			case 'No':
			// jika login 3x salah
			for (a = 0; a < 3; a++) {
				WebUI.setText(findTestObject('null'), username)
	
				WebUI.setText(findTestObject('null'), password)
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
			}
			
			if (WebUI.verifyTextPresent('User Locked: Gunakan menu user SYS untuk melakukan reset', false, FailureHandling.OPTIONAL) ==
			true) {
				WebUI.delay(3)
	
				def info = WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.OPTIONAL)
	
				def username = info.username
	
				def password = info.password
	
				WebUI.clearText(findTestObject('null'))
	
				WebUI.setText(findTestObject('null'), username)
	
				WebUI.setText(findTestObject('null'), password)
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.delay(3)
	
				WebUI.clearText(findTestObject('null'))
	
				WebUI.clearText(findTestObject('null'))
	
				WebUI.setText(findTestObject('null'), usernameSYS)
	
				WebUI.setText(findTestObject('null'), passwordSYS)
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.selectOptionByValue(findTestObject('null'), kacabSYS, false)
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				switch (pilihSYS.toString()) {
					case 'pilih1':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih2':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih3':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih4':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih5':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih6':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih7':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih8':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih9':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih10':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih11':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih12':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih13':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih14':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih15':
						WebUI.click(findTestObject('null'))
	
						break
				}
				
				WebUI.takeScreenshot()
				
				WebUI.click(findTestObject('null'))
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.waitForAlert(3)
	
				WebUI.verifyAlertPresent(3)
	
				WebUI.delay(3)
	
				WebUI.acceptAlert()
				
				WebUI.click(findTestObject('null'))
	
				switch (pilihSYS2.toString()) {
					case 'pilih1':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih2':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih3':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih4':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih5':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih6':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih7':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih8':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih9':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih10':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih11':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih12':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih13':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih14':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih15':
						WebUI.click(findTestObject('null'))
	
						break
				}
				
				WebUI.takeScreenshot()
				
				WebUI.click(findTestObject('null'))
	
				WebUI.click(findTestObject('null'))
	
				WebUI.waitForAlert(3)
	
				WebUI.verifyAlertPresent(3)
	
				WebUI.delay(3)
	
				WebUI.acceptAlert()
	
				WebUI.click(findTestObject('null'))
	
				switch (pilihSYS2.toString()) {
					case 'pilih1':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih2':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih3':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih4':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih5':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih6':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih7':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih8':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih9':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih10':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih11':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih12':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih13':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih14':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih15':
						WebUI.click(findTestObject('null'))
	
						break
				}
				
				WebUI.takeScreenshot()
				
				WebUI.click(findTestObject('null'))
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.waitForAlert(3)
	
				WebUI.verifyAlertPresent(3)
	
				WebUI.delay(3)
	
				WebUI.acceptAlert()
				
				WebUI.click(findTestObject('null'))
	
				WebUI.click(findTestObject('null'))
	
				WebUI.switchToDefaultContent()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.setText(findTestObject('null'), usernameadm)
	
				WebUI.setText(findTestObject('null'), passwordadm)
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.selectOptionByValue(findTestObject('null'), kacabadmin, false)
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				switch (pilihSYS.toString()) {
					case 'pilih1':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih2':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih3':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih4':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih5':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih6':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih7':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih8':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih9':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih10':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih11':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih12':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih13':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih14':
						WebUI.click(findTestObject('null'))
	
						break
					case 'pilih15':
						WebUI.click(findTestObject('null'))
	
						break
				}
				
				WebUI.takeScreenshot()
				
				WebUI.click(findTestObject('null'))
	
				WebUI.setText(findTestObject('null'), ipadd)
				
				WebUI.takeScreenshot()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.waitForAlert(3)
	
				WebUI.verifyAlertPresent(3)
	
				WebUI.delay(3)
	
				WebUI.acceptAlert()
	
				WebUI.click(findTestObject('null'))
	
				WebUI.switchToDefaultContent()
	
				WebUI.click(findTestObject('null'))
				
			} else {
			
				WebUI.delay(5)
			}
			
			break
					
}