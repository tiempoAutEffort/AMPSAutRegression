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

WebUI.click(findTestObject('UI/Employee/Client Selector/span_ClientsMenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/h1_ClientsTitle'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/h1_ClientsTitle'), 5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/label_Is Active'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/label_Is Active'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/div_Is Active dropdown'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/div_Is Active dropdown'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/button_Filter'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/button_Filter'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/input_Serach textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/input_Serach textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/th_Client List Header_Abbr'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/th_Client List Header_Abbr'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/th_Client List Header_Client'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/th_Client List Header_Client'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/th_Client List Header_Is Active'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/th_Client List Header_Is Active'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/button_Clients per page'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/button_Clients per page'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Selector/ul_Pagination'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Selector/ul_Pagination'), 5, FailureHandling.CONTINUE_ON_FAILURE)

