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

//Rule Set data
RULESETNAME = "AAAAAAN Empty Rule Set"
VALIDFROM = "01/18/2019"
VALIDTO = "01/30/2019"
RULESETTYPE = "Claim"

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

//Click on Create New Rule Set
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/a_createNewRuleSet'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/a_createNewRuleSet'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Verify New Rule Set form
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/h2_newRulesetForm'), 5)
formTitle = WebUI.getText(findTestObject('UI/Client/Rule Editor/Create Rule Set/h2_newRulesetForm'))
WebUI.verifyMatch(formTitle, "New Ruleset", false)
WebUI.delay(3)

//Enter Rule Set data - Name , Valid From , Valid To , Ruleset Type
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_ruleSetName'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_ruleSetName'), RULESETNAME)
WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_validFromDate'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_validFromDate'), VALIDFROM)
WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_validToDate'), 5)
WebUI.setText(findTestObject('UI/Client/Rule Editor/Create Rule Set/input_validToDate'), VALIDTO)
WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_ruleSetType'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/select_ruleSetType'))
WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/option_claimType'), 5)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/option_claimType'), 5)
WebUI.sendKeys(findTestObject('UI/Client/Rule Editor/Create Rule Set/option_claimType'), Keys.chord(Keys.ENTER))
WebUI.delay(2)

//Click on Save to save Rule Set
WebUI.waitForElementClickable(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRuleSet'), 5)
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_saveRuleSet'))
WebUI.delay(1)
WebUI.waitForPageLoad(5)

//Accept Rule Set saved pop-up
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleSetSaved'), 5)
WebUI.waitForElementVisible(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleSetSaved'), 5)
WebUI.focus(findTestObject('UI/Client/Rule Editor/Create Rule Set/div_alertRuleSetSaved'))
WebUI.click(findTestObject('UI/Client/Rule Editor/Create Rule Set/button_acceptRuleSetSavedPopUp'))
WebUI.delay(3)
WebUI.waitForPageLoad(5)

//Verify Edit Rule Set form
WebUI.waitForElementPresent(findTestObject('UI/Client/Rule Editor/Create Rule Set/h2_editRulesetForm'), 5)
formTitle = WebUI.getText(findTestObject('UI/Client/Rule Editor/Create Rule Set/h2_editRulesetForm'))
WebUI.verifyMatch(formTitle, "Edit Ruleset", false)
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