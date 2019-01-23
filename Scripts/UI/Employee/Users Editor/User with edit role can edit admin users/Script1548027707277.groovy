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

WebUI.callTestCase(findTestCase('UI/General/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/span_Users'))

WebUI.delay(5)

WebUI.setText(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/input_User Code_code'), 
    'purposeTest')

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/button_Filter'))

WebUI.delay(5)

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/i_Status_fa fa-pencil'))

WebUI.delay(5)

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/a_Access'))

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/span_All Groups'))

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/a_'))

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/a_Basics'))

WebUI.delay(5)

WebUI.setText(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/input_Mobile_mobile'), 
    '909-564-2554')

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/button_Save'))

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/h2_User Updated'))

WebUI.verifyTextPresent('User Updated', false)

WebUI.click(findTestObject('UI/Employee/user detail/modify user/Page_AMPS Portal/Page_AMPS Portal/button_OK'))

WebUI.closeBrowser()

