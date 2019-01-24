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

//Rule Set data
RULESETNAME = "AAAAAAN Empty Rule Set"
VALIDFROM = "01/02/2019"
VALIDTO = "12/31/2019"
RULESETTYPE = "Claim"
//RULESETTYPE = "Itemized Bill Lane"

//Rule data
RULENAME = "Second Rule"

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

//Click on Edit icon to edit Rule Set
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Edit Rule Set/a_editRuleSetIcon'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Edit Rule Set/a_editRuleSetIcon'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//**** Delete Rule from a Rule Set ****//

//Click on Delete icon to delete a Rule
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_deleteRule'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_deleteRule'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Confirm Rule to be deleted
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'), 5)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'), 5)
WebUI.focus(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'))
WebUI.click(findTestObject('UI/Client/Rule Editor/Delete Rule Set/button_confirmDeleteRule'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)
WebUI.delay(3)

//Verify Rule is not displayed
WebUI.verifyElementNotPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/span_firstRule'), 5)
WebUI.delay(2)

//Click on Save to save the Rule Set
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRuleSet'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRuleSet'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Accept Rule added pop-up
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleAdded'), 5)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleAdded'), 5)
WebUI.focus(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleAdded'))
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_acceptRuleSetSavedPopUp'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)
WebUI.delay(3)

//Verify New Rule Set is displayed
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/td_ruleSetAddedList'), 5)
firstRuleSetName = WebUI.getText(findTestObject('UI/Client/Rule Editor/Create Rule Set/td_ruleSetAddedList'))
WebUI.verifyMatch(firstRuleSetName, RULESETNAME, false)
WebUI.delay(3)

//**** Delete Rule Set ****//

//Click on Delete icon to delete a Rule Set
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_deleteRuleSet'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_deleteRuleSet'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Confirm Rule Set to be deleted
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'), 5)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'), 5)
WebUI.focus(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'))
WebUI.click(findTestObject('UI/Client/Rule Editor/Delete Rule Set/button_confirmDeleteRule'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)
WebUI.delay(3)

//Verify Rule Set is not displayed anymore
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/td_ruleSetAddedList'), 5)
firstRuleSetName = WebUI.getText(findTestObject('UI/Client/Rule Editor/Create Rule Set/td_ruleSetAddedList'))
WebUI.verifyNotMatch(firstRuleSetName, RULESETNAME, false)
WebUI.delay(3)

//Confirm Rule Set deleted
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'), 5)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'), 5)
WebUI.focus(findTestObject('UI/Client/Rule Editor/Delete Rule Set/div_alertDeleteRule'))
WebUI.click(findTestObject('UI/Client/Rule Editor/Delete Rule Set/button_confirmDeleteRule'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)
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
