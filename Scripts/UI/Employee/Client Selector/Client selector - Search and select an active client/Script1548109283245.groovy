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

WebUI.click(findTestObject('UI/Employee/Client Selector/span_ClientsMenu'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/h1_ClientsTitle'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/h1_ClientsTitle'), 5)

WebUI.sendKeys(findTestObject('UI/Employee/Client Selector/input_Serach textbox'), clientAbbr)

WebUI.click(findTestObject('UI/Employee/Client Selector/span_Searched Client Abbr'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/h1_Claim List Title'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/h1_Claim List Title'), 5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/span_Claim List_Header with clients Abbr'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/span_Claim List_Header with clients Abbr'), 5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/span_Logout button'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/span_Logout button'), 5)

claimListHeaderText = WebUI.getText(findTestObject('UI/Employee/Client Selector/span_Claim List_Header with clients Abbr'), 
    FailureHandling.STOP_ON_FAILURE)

logoutButtonText = WebUI.getText(findTestObject('UI/Employee/Client Selector/span_Logout button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(claimListHeaderText.contains(clientAbbr), true)

WebUI.verifyEqual(logoutButtonText.contains(clientAbbr), true)

WebUI.click(findTestObject('UI/Employee/Client Selector/span_Logout button'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/h1_ClientsTitle'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/h1_ClientsTitle'), 5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/input_Serach textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/input_Serach textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

