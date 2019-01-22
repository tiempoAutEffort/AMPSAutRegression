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
UPFILE = "C:\\uploadAMPS\\UpFile.txt"

//Claim id - Invalid/Non-Existing
INVALIDCLAIM = "0000000"

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

//Verify that no search has been performed
//List of Claims displayed and pagination button "2" displayed
WebUI.verifyElementPresent(findTestObject('UI/Client/Claim Services/span_firstClaim'), 5)
WebUI.verifyElementPresent(findTestObject('UI/Client/Claim Services/span_secondClaim'), 5)
WebUI.verifyElementPresent(findTestObject('UI/Client/Claim Services/li_pageTwo'), 5)

//Enter invalid Claim id
WebUI.waitForElementVisible(findTestObject('UI/Client/Claim Services/input_ampsClaimID'), 5)
WebUI.setText(findTestObject('UI/Client/Claim Services/input_ampsClaimID'), INVALIDCLAIM)
WebUI.delay(3)

//Click Filter to perform the search
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/button_filter'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/button_filter'))
WebUI.waitForPageLoad(5)

//Verify that No Data is displayed in the search results
WebUI.verifyElementVisible(findTestObject('UI/Client/Claim Services/div_noDataMessage'))
WebUI.verifyElementNotPresent(findTestObject('UI/Client/Claim Services/span_firstClaim'), 5)
WebUI.verifyElementNotPresent(findTestObject('UI/Client/Claim Services/span_secondClaim'), 5)
WebUI.delay(3)

//Click Clear to erase search results
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/button_clear'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/button_clear'))
WebUI.waitForPageLoad(5)

//Verify that search results have been cleared
//List of Claims and pagination button "2" should be displayed again
WebUI.verifyElementPresent(findTestObject('UI/Client/Claim Services/span_firstClaim'), 5)
WebUI.verifyElementPresent(findTestObject('UI/Client/Claim Services/span_secondClaim'), 5)
WebUI.verifyElementPresent(findTestObject('UI/Client/Claim Services/li_pageTwo'), 5)

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