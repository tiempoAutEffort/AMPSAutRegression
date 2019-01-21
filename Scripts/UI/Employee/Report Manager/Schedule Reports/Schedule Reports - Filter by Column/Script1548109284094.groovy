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

not_run: WebUI.click(findTestObject('UI/Employee/Report Manager/span_Report Management Menu'))

not_run: WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/span_Scheduled Reports Sub Menu'), 5)

not_run: WebUI.click(findTestObject('UI/Employee/Report Manager/span_Scheduled Reports Sub Menu'))

not_run: WebUI.waitForElementNotPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 
    10)

not_run: WebUI.waitForElementNotVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 
    10)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Columns tab'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Actions'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Actions'), 5)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Actions'))

WebUI.verifyElementNotVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Actions'))

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Actions'))

