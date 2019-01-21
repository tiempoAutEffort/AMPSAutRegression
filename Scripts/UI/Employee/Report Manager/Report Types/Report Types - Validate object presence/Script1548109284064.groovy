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

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Report Types Sub Menu'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/h1_Report Types Title'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/h1_Report Types Title'), 5)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/h1_Report Types Title'), 'Report Types', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Reports Table_Header_Actions'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Reports Table_Header_Actions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Reports Table_Header_Actions'), 'Actions', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Active'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Active'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Active'), 'Active', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Name'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Name'), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Report Range'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Report Range'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Report Range'), 'Report Range', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Schedule Dates'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Schedule Dates'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Schedule Dates'), 
    'Schedule Dates', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Mass Distributed'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Mass Distributed'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Mass Distributed'), 
    'Mass Distributed', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Client Wide'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Client Wide'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Client Wide'), 'Client Wide', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Scope'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Scope'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_Header_Scope'), 'Scope', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_ Header_Query Table'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_ Header_Query Table'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/th_Report Table_ Header_Query Table'), 'Query Table', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('UI/Employee/Report Manager/Report Types/a_Create New_button'))

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Report Name'), 
    5)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Report Name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Report Name'), 
    'Report Name', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_Report Name'), 
    5)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_Report Name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Edit Form Title'), 
    5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Edit Form Title'), 
    5)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Edit Form Title'), 
    'Edit Form', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_File Area Tag'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_File Area Tag'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_File Area Tag'), 
    'File Area Tag', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_File Area Tag dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_File Area Tag dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Active'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Active'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Active'), 'Active', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Active_switch'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Active_switch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Has PHI'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Has PHI'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Has PHI'), 
    'Has PHI', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Has PHI_switch'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Has PHI_switch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Use Query Central'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Use Query Central'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Use Query Central'), 
    'Use Query Central', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Use Query Central_switch'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Use Query Central_switch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Client-Wide Report'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Client-Wide Report'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Client-Wide Report'), 
    'Client-Wide Report', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Client-Wide Report_switch'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Client-Wide Report_switch'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_DB Table to Query'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_DB Table to Query'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_DB Table to Query'), 
    'DB Table to Query', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_DB Table to Query dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_DB Table to Query dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Query Central report query'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Query Central report query'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Query Central report query'), 
    'Query Central report query', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Query Central report query dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Query Central report query dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Range'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Range'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Range'), 'Range', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Range dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Range dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Schedule Dates'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Schedule Dates'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Schedule Dates'), 
    'Schedule Dates', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Schedule dates tip label'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Schedule dates tip label'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Schedule dates tip label'), 
    'Comma separated dates or days of the week. Example: Mon,15,daily', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_Schedule dates textbox'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_Schedule dates textbox'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Scope'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Scope'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Scope'), 'Scope', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Scope tip label'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Scope tip label'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Scope tip label'), 
    'RBR and MBR scope only affects reports based on Excel templates', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Scope dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Scope dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Filters'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Filters'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Filters'), 
    'Filters', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/textarea_Filters input'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/textarea_Filters input'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Current Report Template'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Current Report Template'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Current Report Template'), 
    'Current Report Template (Excel file, with columns defined on Data tab)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Upload Report Template'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Upload Report Template'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/label_Upload Report Template'), 
    'Upload Report Template', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Upload Report Template tip label'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Upload Report Template tip label'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/i_Upload Report Template tip label'), 
    'Please include a tab named Data with headers that correspond to columns you would like the report to populate. To include dynamic dates, use placeholders enclosed in double curly brackets anywhere in the report: {{today}} {{yesterday}} {{to}} {{from}}', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_choose file button'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_choose file button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/button_Save'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/button_Save'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/a_Cancel'), 5, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/a_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/a_Enable Mass Distribution'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/a_Enable Mass Distribution'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Report-On-Demand'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Report-On-Demand'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Report-On-Demand'), 
    'Report-On-Demand', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/div_Create On-Demand Report'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/div_Create On-Demand Report'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/div_Create On-Demand Report'), 
    'Create On-Demand Report for:   ', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Create On-Deman report dropdown'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_Create On-Deman report dropdown'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/button_Create and Download'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/button_Create and Download'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/a_Cancel'))

