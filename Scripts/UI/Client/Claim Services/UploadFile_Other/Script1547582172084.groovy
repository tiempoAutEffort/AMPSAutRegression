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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Env and user credentials
UAT = 'https://uat.advancedpricing.com'
USER = 'qaAuto'
PASSWD = 'a9yk100dD'

//Upload File path
UPFILE = "C:\\uploadAMPS\\Upload-Demo.txt"

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


//Upload file
WebUI.uploadFile(findTestObject('UI/Client/Claim Services/input_NewFile'), UPFILE)
WebUI.delay(3)

//Select file name dropdown and select "Other"
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/selectFileNameDropDown'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/selectFileNameDropDown'))
WebUI.delay(2)
WebUI.click(findTestObject('UI/Client/Claim Services/option_otherFile'))
WebUI.delay(3)

//Click "Save" button to upload file
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/buttonSaveUpload'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/buttonSaveUpload'))
WebUI.waitForPageLoad(5)

//Verify "File uploaded" message
WebUI.verifyElementVisible(findTestObject('UI/Client/Claim Services/strong_uploadedFileMessage'))

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
