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

def actualSavings = findTestObject('UI/Employee/Performance Monitor/Objects Performance Monitor/Page_AMPS Portal/div_979268824')
def last3MonthsSavings = findTestObject('UI/Employee/Performance Monitor/Objects Performance Monitor/Page_AMPS Portal/div_67758396')

WebUI.callTestCase(findTestCase('UI/General/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('UI/Employee/Performance Monitor/Objects Performance Monitor/Page_AMPS Portal/span_Performance Monitor'))

WebUI.delay(5)

WebUI.click(findTestObject('UI/Employee/Performance Monitor/Objects Performance Monitor/Page_AMPS Portal/button_Last 3 Months'))

WebUI.delay(5)

WebUI.verifyNotEqual(actualSavings, last3MonthsSavings)

WebUI.click(findTestObject('UI/Employee/Performance Monitor/Objects Performance Monitor/Page_AMPS Portal/button_ITD'))

WebUI.delay(5)

WebUI.verifyEqual(actualSavings, actualSavings)

WebUI.closeBrowser()

