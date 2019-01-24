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

import org.openqa.selenium.Keys as Keys

//Env and user credentials

UAT = 'https://uat.advancedpricing.com'
USER = 'qaAuto'
PASSWD = 'a9yk100dD'

//Rule data
RULENAME = "Date Creation Rule"
CLAIMID = "1027963"

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

//Display Rule Set Details
WebUI.waitForElementVisible(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/td_expandRuleSet'), 5)
WebUI.click(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/td_expandRuleSet'))
WebUI.waitForPageLoad(5)
WebUI.delay(3)

//Enter valid Claim id
WebUI.waitForElementPresent(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/input_claimID'), 5)
WebUI.waitForElementVisible(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/input_claimID'), 5)
WebUI.setText(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/input_claimID'), CLAIMID)
WebUI.delay(3)

//Click on Run button
WebUI.waitForElementClickable(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/button_runButton'), 5)
WebUI.click(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/button_runButton'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Verify Script Output table is displayed
WebUI.waitForElementPresent(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/label_scriptOutputTable'), 5)
formTitle = WebUI.getText(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/label_scriptOutputTable'))
WebUI.verifyMatch(formTitle, "Script Output", false)

//Verify executed Rule table is displayed
WebUI.waitForElementPresent(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/td_executedRuleTable'), 5)
formTitle = WebUI.getText(findTestObject('Object Repository/UI/Client/Rule Editor/Execute Rule Set/td_executedRuleTable'))
WebUI.verifyMatch(formTitle, RULENAME, false)
WebUI.delay(3)

//Logout
WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_userAvatar'), 5)
WebUI.click(findTestObject('UI/General/Log/a_userAvatar'))
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_signOutAMPS'), 5)
WebUI.click(findTestObject('UI/General/Log/a_signOutAMPS'))
WebUI.delay(1)

//Close browser
WebUI.closeBrowser()
