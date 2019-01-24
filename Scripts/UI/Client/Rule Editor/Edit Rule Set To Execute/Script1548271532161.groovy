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
VALIDTO = "12/31/2019"
RULENAME = "Date Creation Rule"
CONDITION = "Claim: Create Date"
CREATEDATE = "08/27/2018"
ACTION = "Generic: Log a Debug Message"
MESSAGE = "Testing Execution of Rules"
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

//**** Edit Rule set by adding a Rule ****//

//Click on Edit icon to edit Rule Set - Valid To date
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Edit Rule Set/a_editRuleSetIcon'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Edit Rule Set/a_editRuleSetIcon'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('UI/Client/Rule Editor/Edit Rule Set/span_clearValidTo'))
WebUI.delay(1)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_validToDate'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_validToDate'), VALIDTO)
WebUI.delay(2)

//Click on Add Rules button
WebUI.waitForElementPresent(findTestObject('Object Repository/UI/Client/Rule Editor/Create Rule Set/a_addRuleToRuleSet'), 5)
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/a_addRuleToRuleSet'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/a_addRuleToRuleSet'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Verify New Rules form
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/h2_newRulesForm'), 5)
formTitle = WebUI.getText(findTestObject('UI/Client/Rule Editor/Create Rule Set/h2_newRulesForm'))
WebUI.verifyMatch(formTitle, "New Rules", false)
WebUI.delay(3)

//Enter Rule data - Name , Acceptance , Actions
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_ruleName'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_ruleName'), RULENAME)
WebUI.delay(2)

//Fill Condition
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_addCondition'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_focusAddCondition'))
WebUI.delay(1)

for (i = 0 ; i < 12 ; i++){
	WebUI.sendKeys(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_addCondition'), Keys.chord(Keys.ARROW_DOWN))
	WebUI.delay(1)
}

WebUI.sendKeys(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_addCondition'), Keys.chord(Keys.ENTER))
WebUI.delay(1)
WebUI.waitForElementClickable(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/a_addConditionLogic'), 5)
WebUI.click(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/a_addConditionLogic'))
WebUI.delay(1)
WebUI.waitForElementPresent(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/div_conditionForm'), 5)
formTitle = WebUI.getText(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/div_conditionForm'))
WebUI.verifyMatch(formTitle, CONDITION, false)
WebUI.waitForElementClickable(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/span_clearDate'), 5)
WebUI.click(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/span_clearDate'))
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/input_dateCreated'), CREATEDATE)
WebUI.sendKeys(findTestObject('UI/Client/Rule Editor/Edit Rule Set/input_dateCreated'), Keys.chord(Keys.TAB))
WebUI.delay(1)

//Fill Action
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_addAction'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_addAction'))
WebUI.delay(1)

for (i = 0 ; i < 16 ; i++){
	WebUI.sendKeys(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_focusAddAction'), Keys.chord(Keys.ARROW_DOWN))
	WebUI.delay(1)
}

WebUI.sendKeys(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_focusAddAction'), Keys.chord(Keys.ENTER))
WebUI.delay(3)
WebUI.waitForElementClickable(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/a_addAction'), 5)
WebUI.click(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/a_addAction'))
WebUI.delay(3)
WebUI.waitForElementPresent(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/div_actionForm'), 5)
formTitle = WebUI.getText(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/div_actionForm'))
WebUI.waitForElementVisible(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/input_debugMessage'), 5)
WebUI.setText(findTestObject('Object Repository/UI/Client/Rule Editor/Edit Rule Set/input_debugMessage'), MESSAGE)
WebUI.delay(1)

//Click on Save to add the Rule
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRule'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRule'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Verify first rule is displayed
WebUI.verifyElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/span_firstRule'), 5)
WebUI.delay(2)

//Click on Save to save the Rule Set
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRuleSet'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRuleSet'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Accept Rule updated pop-up
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleAdded'), 5)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleAdded'), 5)
WebUI.focus(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleAdded'))
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_acceptRuleAddedPopUp'))
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
