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

//Click on Turn Around Tracker
WebUI.waitForElementClickable(findTestObject('UI/Client/Turn Around Tracker/a_turnAroundTracker'), 5)
WebUI.click(findTestObject('UI/Client/Turn Around Tracker/a_turnAroundTracker'))
WebUI.waitForPageLoad(5)

//Verify Turn Around Tracker page
WebUI.waitForElementVisible(findTestObject('UI/Client/Turn Around Tracker/h1_turnAroundTrackerHeader'), 5)
pageHeader = WebUI.getText(findTestObject('UI/Client/Turn Around Tracker/h1_turnAroundTrackerHeader'))
WebUI.verifyMatch(pageHeader, "Turn Around Tracker", false)
WebUI.delay(3)

//Logout
WebUI.waitForElementClickable(findTestObject('UI/General/Log/span_logoutAsClient'), 5)
WebUI.click(findTestObject('UI/General/Log/span_logoutAsClient'))

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_userAvatar'), 5)
WebUI.click(findTestObject('UI/General/Log/a_userAvatar'))
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_signOutAMPS'), 5)
WebUI.click(findTestObject('UI/General/Log/a_signOutAMPS'))
WebUI.delay(1)

//Close browser
WebUI.closeBrowser()