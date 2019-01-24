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

WebUI.callTestCase(findTestCase('UI/General/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/span_Users'))

WebUI.verifyElementClickable(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/a_Create New User'))

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/a_Create New User'))

WebUI.delay(5)

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/span_customer_Select-arrow'))

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/Selector_account_Type_option3'))

WebUI.delay(3)

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/span_Select..._Select-arrow'))

WebUI.sendKeys(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/INPUT_dropdown_Role'), 'admin')

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/Selector_Role_Always_Option1'))

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/div_Select...'))

WebUI.delay(2)

WebUI.setText(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/input_User Code_code'), 'TestAdmin')

WebUI.setText(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/input_Email_email'), 'Howartz@amps.com')

WebUI.setText(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/input_First Name_firstName'), 
    'Stephen')

WebUI.setText(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/input_Last Name_lastName'), 
    'Howart')

WebUI.delay(2)

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/a_Access'))

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/span_All Groups'))

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/a_'))

WebUI.delay(2)

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/a_Permissions'))

WebUI.setText(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/input_All Groups_form-control'), 
    'user')

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/input_Description_permissions5'))

WebUI.delay(2)

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/button_Save'))

WebUI.verifyTextPresent('User Created', false)

WebUI.click(findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/button_OK'))
WebUI.closeBrowser()

