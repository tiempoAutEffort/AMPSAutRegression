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

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Report Management Menu'))

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/span_Scheduled Reports Sub Menu'), 5)

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Scheduled Reports Sub Menu'))

WebUI.waitForElementNotPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 10)

WebUI.waitForElementNotVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Loading Spinner'), 10)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/h1_Scheduled Reports_Title'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/h1_Scheduled Reports_Title'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/h1_Scheduled Reports_Title'), 'Scheduled Reports', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_New Schedule button'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_New Schedule button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_New Schedule button'), 'NEW SCHEDULE', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Search textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Search textbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Filters tab'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Filters tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Filters tab'), 'Filters', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Client'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Client'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Client'), 'Client', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Client textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Client textbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Client Name'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Client Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Client Name'), 'Client Name', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Client Name_textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Client Name_textbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Group Name'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Group Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Group Name'), 'Group Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Group Name_textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Group Name_textbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Report Name'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Report Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Report Name'), 'Report Name', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Report Name_textbox'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/input_Report Name_textbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Active'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Active'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Active'), 'Active', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/span_Active dropdown'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/span_Active dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Run Status'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Run Status'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Run Status'), 'Run Status', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/span_Run Status dropdown'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/span_Run Status dropdown'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/button_Filter'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/button_Filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/button_Filter'), 'Filter', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Columns tab'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Columns tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Columns tab'), 'Columns', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_Columns tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Actions'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Actions'), 5)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Actions'), 'Actions', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Client'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Client'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Client'), 'Client', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Client Name'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Client Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Client Name'), 'Client Name', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Group Name'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Group Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Group Name'), 'Group Name', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Report Name'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Report Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Report Name'), 'Report Name', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Frequency'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Frequency'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Frequency'), 'Frequency', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Active'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Active'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Active'), 'Active', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Add to File Area'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Add to File Area'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Add to File Area'), 'Add to File Area', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_File Only'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_File Only'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_File Only'), 'File Only', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Email and File'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Email and File'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Email and File'), 'Email and File', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Overrides'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Overrides'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Overrides'), 'Overrides', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Last Run Status'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Last Run Status'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Last Run Status'), 'Last Run Status', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Last Run Date'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Last Run Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/label_Columns_Last Run Date'), 'Last Run Date', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Actions'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Actions'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Actions'), 
    'Actions', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Client'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Client'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Client'), 
    'Client', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Client Name'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Client Name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Client Name'), 
    'Client Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Group Name'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Group Name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Group Name'), 
    'Group Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Report Name'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Report Name'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Report Name'), 
    'Report Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Frequency'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Frequency'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Frequency'), 
    'Frequency', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Active'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Active'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Active'), 
    'Active', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Add to File Area'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Add to File Area'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Add to File Area'), 
    'Add to File Area', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_File Only'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_File Only'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_File Only'), 
    'File Only', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Email and File'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Email and File'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/th_Schedule Reports Table_Header_Email and File'), 
    'Email and File', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('UI/Employee/Report Manager/Schedule Reports/button_Schedules Reports per page'), 3)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/button_Schedules Reports per page'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/button_Schedules Reports per page'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Pagination'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/div_Pagination'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_New Schedule button'), 3)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/a_New Schedule button'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/h2_New Scheduled Report_Title'), 
    5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/h2_New Scheduled Report_Title'), 
    5)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/h2_New Scheduled Report_Title'), 
    'New Scheduled Report', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/a_Common Data tab'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/a_Common Data tab'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/a_Common Data tab'), 
    'Common Data', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Internal Report'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Internal Report'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Internal Report'), 
    'Internal Report', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/span_Internal Report_switch'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/span_Internal Report_switch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Active'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Active'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Active'), 
    'Active', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/span_Active_switch'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/span_Active_switch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Add to File Area'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Add to File Area'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Add to File Area'), 
    'Add to File Area', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/span_Add to File Area_switch'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/span_Add to File Area_switch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Report Type'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Report Type'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Report Type'), 
    'Report Type', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Report Type dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Report Type dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Client'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Client'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Client'), 
    'Client', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Client dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Client dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Group'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Group'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Group'), 
    'Group', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Group dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Group dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Available Recipients'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Available Recipients'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Available Recipients'), 
    'Available Recipients (0)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Recipients input'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Recipients input'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/a_Custom Data tab'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Success Template'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Success Template'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Success Template'), 
    'Custom Success Template', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Custom Success Template dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Custom Success Template dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Schedule Dates'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Schedule Dates'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Schedule Dates'), 
    'Custom Schedule Dates', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Custome Schedule date dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Custome Schedule date dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Range'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Range'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Custom Range'), 
    'Custom Range', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Custom range dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Custom range dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Filters'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Filters'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/label_Filters'), 
    'Filters', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/textarea_Filter textbox'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/textarea_Filter textbox'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Upload Report Template'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/div_Upload Report Template'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/input_Choose file button'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/input_Choose file button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/button_Cancel'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/button_Cancel'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/button_Save'), 
    3)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/button_Save'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Schedule Reports/Create and edit Schedule report/button_Save'), 
    FailureHandling.CONTINUE_ON_FAILURE)

