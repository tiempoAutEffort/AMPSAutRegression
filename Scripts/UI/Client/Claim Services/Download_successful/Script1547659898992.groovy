import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Env and user credentials
UAT = 'https://uat.advancedpricing.com'
USER = 'qaAuto'
PASSWD = 'a9yk100dD'

//Define Custom Path where file needs to be downloaded
String downloadPath = 'C:\\Users\\rogelio medrano\\Downloads'
FILEDOWN = "MedRecords-Demo.png"

//Open browser and navigate to AMPS login page
WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl(UAT)
WebUI.waitForPageLoad(5)

//Enter credentials and login
WebUI.setText(findTestObject('UI/Client/Claim Services/input_userCode'), USER)
WebUI.setText(findTestObject('UI/Client/Claim Services/input_userPassword'), PASSWD)

WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/input_loginButton'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/input_loginButton'))
WebUI.waitForPageLoad(5)

//Click on ABMS Client
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/span_ABMSClient'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/span_ABMSClient'))
WebUI.waitForPageLoad(5)

//Click on specific Claim
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/span_firstClaim'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/span_firstClaim'))
WebUI.waitForPageLoad(5)

//Goto Files tab
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/a_FilesTab'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/a_FilesTab'))
WebUI.waitForPageLoad(5)

//Get name of the first existing file and verify they match
fileName = WebUI.getText(findTestObject('UI/Client/Claim Services/a_firstExistingFile'))
WebUI.verifyMatch(fileName, FILEDOWN, false)

//Click on file to be downloaded
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/a_firstExistingFile'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/a_firstExistingFile'))
WebUI.delay(10)

WebDriver driver = DriverFactory.getWebDriver()
 
'Verifying the file is download in the User defined Path'
Assert.assertTrue(isFileDownloaded(downloadPath, FILEDOWN), 'Failed to download Expected document')
 
boolean isFileDownloaded(String downloadPath, String fileName) {
boolean flag = false
'Creating an object for File and passing the download Path as argument'
File dir = new File(downloadPath)
'Creating an Array where it will store all the files from that folder'
File[] dir_contents = dir.listFiles()
 
//println('Total Files Available in the folder are : ' + dir_contents.length)
'Iterating a loop for number of files available in the folder to verify file name in the folder'
for (int i = 0; i < dir_contents.length; i++) {
	//println('File Name at 0 is : ' + dir_contents[i].getName())
	'Verifying the file name is available in the folder '
	if (dir_contents[i].getName().equals(fileName)) {
		'If the file is found then it will return a value as true'
		flag = true

		return flag
}
}
'If the file is found then it will return a value as false'
return flag
}



//Logout
WebUI.waitForElementClickable(findTestObject('UI/General/Log/span_logoutAsClient'), 5)
WebUI.click(findTestObject('UI/General/Log/span_logoutAsClient'))
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_userAvatar'), 5)
WebUI.click(findTestObject('UI/General/Log/a_userAvatar'))
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_signOutAMPS'), 5)
WebUI.click(findTestObject('UI/General/Log/a_signOutAMPS'))
WebUI.delay(1)

//Close browser
WebUI.closeBrowser()
//Close browser
WebUI.closeBrowser()
