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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.advancedpricing.com/login?next=%2F')
WebUI.maximizeWindow()

// user
	WebUI.setText(findTestObject('UI/Employee/Files/input_AMPS Portal Sign In_code'), 'qaAuto')

// pass
	WebUI.setEncryptedText(findTestObject('UI/Employee/Files/input_AMPS Portal Sign In_pass'), 'yjiIhAfFXTz0yohvbOLmCA==')

// button join
	WebUI.click(findTestObject('UI/Employee/Files/input_Forgot Password_btn btn-'))


WebUI.click(findTestObject('UI/Employee/Uploader/a_Uploader'))
WebUI.delay(2)

// adding a new user///////////////////////////////////////////////////////////////////

	Date today = new Date()
	WebUI.click(findTestObject('UI/Employee/Uploader/button_Add New User'))
	//WebUI.setText(findTestObject('UI/Employee/Uploader/input_Name_name'), 'TEST '+ today.format("MM/DD/YYYY"))
	WebUI.setText(findTestObject('UI/Employee/Uploader/Calendar_NewUser'), "12/12/2020")
	WebUI.setText(findTestObject('UI/Employee/Uploader/input_Name_name'),'TESTh')
	WebUI.sendKeys(null, Keys.chord(Keys.TAB))
	WebUI.click(findTestObject('UI/Employee/Uploader/input_Name_name'))
	WebUI.setText(findTestObject('UI/Employee/Uploader/input_Email_email'), 'test@test.com')
	WebUI.delay(2)
	WebUI.setText(findTestObject('UI/Employee/Uploader/input_Email_email'), 'test@test.com')
	WebUI.click(findTestObject('UI/Employee/Uploader/button_Save (1)'))
	//WebUI.click(findTestObject('UI/Employee/Uploader/button_Save (1)'))
	WebUI.delay(4)
	WebUI.doubleClick(findTestObject('UI/Employee/Uploader/strong_User created.'))


// close pop up and continue verifying objects///////////////////////////////////////////////////////////////////
	
	WebUI.click(findTestObject('UI/Employee/Uploader/button_Close'))
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Uploader/i_Expires_fa fa-check aria-hid'))
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Uploader/span_There is no data to displ'))	
	WebUI.click(findTestObject('UI/Employee/Uploader/span__dropdown'))
	WebUI.click(findTestObject('UI/Employee/Uploader/th_FileName'))
	WebUI.click(findTestObject('UI/Employee/Uploader/td_There is no data to display'))
	WebUI.click(findTestObject('UI/Employee/Uploader/span_Date_dropdown'))
	
	WebUI.click(findTestObject('UI/Employee/Uploader/th_Size'))

	WebUI.click(findTestObject('UI/Employee/Uploader/button_Close'))
	
//searching for user con with files ///////////////////////////////////////////////////////////////////
	
	WebUI.delay(2)
	WebUI.setText(findTestObject('UI/Employee/Uploader/input_Search By Name or Email_'), 'sfrancis@wellsystems.com')
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Uploader/button_Filter'))
	WebUI.click(findTestObject('UI/Employee/Uploader/i_Expires_fa fa-times aria-hid'))
	WebUI.click(findTestObject('UI/Employee/Uploader/span_Size_dropdown'))
	WebUI.click(findTestObject('UI/Employee/Uploader/th_Size (1)'))
	WebUI.click(findTestObject('UI/Employee/Uploader/span_330.3 KB'))
	WebUI.click(findTestObject('UI/Employee/Uploader/th_Size (1)'))
	WebUI.click(findTestObject('UI/Employee/Uploader/span_358.4 KB'))
	WebUI.click(findTestObject('UI/Employee/Uploader/button_Close'))

	WebUI.closeBrowser()
