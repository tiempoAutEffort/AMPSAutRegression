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

WebUI.navigateToUrl('https://uat.advancedpricing.com/')

WebUI.maximizeWindow()

// user
WebUI.setText(findTestObject('UI/Employee/Files/input_AMPS Portal Sign In_code'), 'qaAuto')

// pass
WebUI.setEncryptedText(findTestObject('UI/Employee/Files/input_AMPS Portal Sign In_pass'), 'yjiIhAfFXTz0yohvbOLmCA==')

// button join
WebUI.click(findTestObject('UI/Employee/Files/input_Forgot Password_btn btn-'))

// go to Files
WebUI.click(findTestObject('UI/Employee/Files/a_Files'))

WebUI.delay(3)

//VERIFY DATE////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
Date today = new Date()

attribute = WebUI.getText(findTestObject('UI/Employee/Files/h1_DateHeader'))
println(attribute)

attribute.contains(today.format('EEEE') + ', ' + today.format('MMMM') + ' ' + today.format('dd'))
attribute.contains(today.format('yyyy'))

//upload settings//////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////	///////////////////////////////////////////////
// upload files , set the file as you prefer
WebUI.uploadFile(findTestObject('UI/Employee/Files/Element_1547578954950'), '/Users/miguel camarena/Downloads/eb61f4ad-6215-4f42-9c70-9ac4439222d1.jpeg')

// upload files , set the file as you prefer
WebUI.uploadFile(findTestObject('UI/Employee/Files/Element_1547578954950'), '/Users/miguel camarena/Downloads/eb61f4ad-6215-4f42-9c70-9ac4439222d1.jpeg')

WebUI.delay(1)

//Searching by Amanda Lima (AMPS)
WebUI.setText(findTestObject('UI/Employee/Files/input'), 'Amanda Lima (AMPS)')

WebUI.delay(1)

// send Tab
WebUI.sendKeys(findTestObject('UI/Employee/Files/input'), Keys.chord(Keys.TAB))

WebUI.delay(1)

// UPload FIle
WebUI.click(findTestObject('UI/Employee/Files/button_Upload'))

WebUI.delay(1)

//Verify if is uploaded the file
WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/strong_File(s) uploaded succes'), 0)

// Verify Objects (VERIFY FOLDER)//////////////////////////////////////////////////////////////////////////////////////////WebUI.click(findTestObject('UI/Employee/Files/Verify/div_All Groups'))
WebUI.click(findTestObject('UI/Employee/Files/Verify/div_All File Tags'))

WebUI.click(findTestObject('UI/Employee/Files/Verify/span_Show'))

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/a_All'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/a_Today'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/a_This Month'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/a_This Year'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/a_This Year'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/th_Group Name'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/th_File Name'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/th_Action'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/th_Tag'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/th_Upload Date'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/th_File Size'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/td_Client Wide'), 0)

WebUI.verifyElementPresent(findTestObject('UI/Employee/Files/Verify/td_Uploaded by User'), 0)

WebUI.delay(1)

///Validate day by days, months and years.///////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
// days
Date dates = new Date()

WebUI.click(findTestObject('UI/Employee/Files/Verify/a_Today'))

WebUI.click(findTestObject('UI/Employee/Files/Verify/div_Check_first_value'))

todays = WebUI.getText(findTestObject('UI/Employee/Files/Verify/div_Check_first_value'))

boolean s = todays.contains(dates.format('dd').toString())

WebUI.verifyMatch('true', s.toString(), true)

// Months
WebUI.click(findTestObject('UI/Employee/Files/Verify/a_This Month'))

WebUI.click(findTestObject('UI/Employee/Files/Verify/div_Check_first_value'))

month = WebUI.getText(findTestObject('UI/Employee/Files/Verify/div_Check_first_value'))

String validate = dates.format('MM')

if (validate == '01') {
    validate = 'Jan'
}

if (validate == '02') {
    validate = 'Feb'
}

if (validate == '03') {
    validate = 'Mar'
}

if (validate == '04') {
    validate = 'Apr'
}

if (validate == '05') {
    validate = 'May'
}

if (validate == '06') {
    validate = 'Jun'
}

if (validate == '07') {
    validate = 'Jul'
}

if (validate == '08') {
    validate = 'Aug'
}

if (validate == '09') {
    validate = 'Sep'
}

if (validate == '10') {
    validate = 'Oct'
}

if (validate == '11') {
    validate = 'Nov'
}

if (validate == '11') {
    validate = 'Dec'
}

s = month.contains(validate)

WebUI.verifyMatch('true', s.toString(), true)

// Years
WebUI.click(findTestObject('UI/Employee/Files/Verify/a_This Year'))

WebUI.click(findTestObject('UI/Employee/Files/Verify/div_Check_first_value'))

year = WebUI.getText(findTestObject('UI/Employee/Files/Verify/div_Check_first_value'))

s = year.contains(dates.format('yyyy').toString())

WebUI.verifyMatch('true', s.toString(), true)

//download file
not_run: WebUI.click(findTestObject('UI/Employee/Files/a_eb61f4ad-6215-4f42-9c70-9ac4'))

WebUI.closeBrowser()

