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

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/span_Scheduled Reports Sub Menu'), 5)

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Scheduled Reports Sub Menu'))

WebUI.waitForElementNotPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 10)

WebUI.waitForElementNotVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 10)

WebUI.scrollToElement(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_New Schedule button'), 3)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_New Schedule button'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/h2_New Scheduled Report_Title'), 
    5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/h2_New Scheduled Report_Title'), 
    5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Report Type dropdown arrow'), 
    5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Report Type dropdown arrow'), 
    5)

WebUI.delay(2)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Report Type dropdown arrow'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Report Type dropdown input'), 
    reportTypeName)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Report Type dropdown outter select'))

WebUI.scrollToElement(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/button_Save'), 
    3)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/button_Save'))

WebUI.waitForElementNotPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 10)

WebUI.waitForElementNotVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 10)

WebUI.clearText(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Search textbox'))

WebUI.sendKeys(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Search textbox'), reportTypeName)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/table_First Row_Report Name'), reportTypeName)

