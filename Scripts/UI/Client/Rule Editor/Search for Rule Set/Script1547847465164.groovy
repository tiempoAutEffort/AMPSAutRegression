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

//Valid Rule Set data
CLEAR = ""
RULESETNAME = "Arkansas"
RULESETNAME2 = "a"

//Invalid Rule Set data
INVALIDNAME = "QWERTY"
INVALIDNAME2 = "0000"

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
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Verify Clients page
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/h1_Clients'), 5)
pageTitle = WebUI.getText(findTestObject('UI/Client/Rule Editor/h1_Clients'))
WebUI.verifyMatch(pageTitle, "Clients", false)
WebUI.delay(3)

//Click on Rules Editor
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/span_ruleEditorMenu'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/span_ruleEditorMenu'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Verify Rule Editor page
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/h1_ruleEditor'), 5)
pageTitle = WebUI.getText(findTestObject('UI/Client/Rule Editor/h1_ruleEditor'))
WebUI.verifyMatch(pageTitle, "Rule Editor", false)
WebUI.delay(3)

//**** Search using valid data - Search results displayed

//Enter valid search data
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), RULESETNAME)
WebUI.delay(3)
WebUI.verifyElementNotPresent(findTestObject('UI/Client/Rule Editor/Search Rule Set/div_noSearchResults'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), CLEAR)
WebUI.delay(3)


WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), RULESETNAME2)
WebUI.delay(3)
WebUI.verifyElementNotPresent(findTestObject('UI/Client/Rule Editor/Search Rule Set/div_noSearchResults'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), CLEAR)
WebUI.delay(3)



//**** Search using invalid data - No search results displayed
WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), INVALIDNAME)
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('UI/Client/Rule Editor/Search Rule Set/div_noSearchResults'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), CLEAR)
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), 7)


WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), INVALIDNAME2)
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('UI/Client/Rule Editor/Search Rule Set/div_noSearchResults'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Search Rule Set/input_searchRuleSet'), CLEAR)



//Logout
WebUI.waitForElementPresent(findTestObject('UI/General/Log/a_userAvatar'), 2)
WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_userAvatar'), 5)
WebUI.click(findTestObject('UI/General/Log/a_userAvatar'))
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_signOutAMPS'), 5)
WebUI.click(findTestObject('UI/General/Log/a_signOutAMPS'))
WebUI.delay(1)

//Close browser
WebUI.closeBrowser()