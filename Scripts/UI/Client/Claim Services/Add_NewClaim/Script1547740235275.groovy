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

//Env and user credentials
UAT = 'https://uat.advancedpricing.com'
USER = 'qaAuto'
PASSWD = 'a9yk100dD'

//New Claim data
CLAIMNUMBER = "22222"
RXDATE = "01/18/2019"
BILLCHRG = "182019"
PPONAME = "None"

//Upload File path
UPFILE = "C:\\uploadAMPS\\MedRecords-Demo.png"

//Open browser and navigate to AMPS login page
WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl(UAT)
WebUI.waitForPageLoad(5)

//Enter credentials and login
WebUI.setText(findTestObject('UI/Client/Claim Services/input_userCode'), USER)
WebUI.setText(findTestObject('UI/Client/Claim Services/input_userPassword'), PASSWD)

WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/input_loginButton'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/input_loginButton'))
WebUI.waitForPageLoad(5)

//Click on ABMS Client
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/span_ABMSClient'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/span_ABMSClient'))
WebUI.waitForPageLoad(5)

//Click on Add Claim
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/NewClaim/a_addClaim'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/NewClaim/a_addClaim'))
WebUI.waitForPageLoad(5)
WebUI.delay(3)

//Accept Terms & Conditions pop-up
WebUI.focus(findTestObject('UI/Client/Claim Services/NewClaim/h4_termsConditions'))
WebUI.delay(3)
WebUI.click(findTestObject('UI/Client/Claim Services/NewClaim/button_Accept'))
WebUI.delay(2)


//Verify New Claim form is displayed
WebUI.waitForElementVisible(findTestObject('UI/Client/Claim Services/NewClaim/span_newClaimHeader'), 5)
newClaim = WebUI.getText(findTestObject('UI/Client/Claim Services/NewClaim/span_newClaimHeader'))
WebUI.verifyMatch(newClaim, "New", false)
WebUI.delay(3)

//Fill Claim form using valid data
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/NewClaim/select_clientGroupId'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/NewClaim/select_clientGroupId'))
WebUI.delay(2)
WebUI.click(findTestObject('UI/Client/Claim Services/NewClaim/option_twoKellog'))
WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('UI/Client/Claim Services/NewClaim/input_claimNumber'), 5)
WebUI.setText(findTestObject('UI/Client/Claim Services/NewClaim/input_claimNumber'), CLAIMNUMBER)
WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('UI/Client/Claim Services/NewClaim/input_receiveDate'), 5)
WebUI.setText(findTestObject('UI/Client/Claim Services/NewClaim/input_receiveDate'), RXDATE)
WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/NewClaim/radio_noneNetwork'), 5)
WebUI.check(findTestObject('UI/Client/Claim Services/NewClaim/radio_noneNetwork'))
WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('UI/Client/Claim Services/NewClaim/input_billedCharges'), 5)
WebUI.setText(findTestObject('UI/Client/Claim Services/NewClaim/input_billedCharges'), BILLCHRG)
WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('UI/Client/Claim Services/NewClaim/input_ppoName'), 5)
WebUI.setText(findTestObject('UI/Client/Claim Services/NewClaim/input_ppoName'), PPONAME)
WebUI.delay(5)

//Click Save to add new Claim
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/NewClaim/button_saveClaim'), 5)
WebUI.check(findTestObject('UI/Client/Claim Services/NewClaim/button_saveClaim'))
WebUI.delay(5)

//Verify Claim created pop-up
WebUI.focus(findTestObject('UI/Client/Claim Services/NewClaim/h4_alertClaim'))
WebUI.delay(3)
WebUI.click(findTestObject('UI/Client/Claim Services/NewClaim/button_closeAlertClaim'))
WebUI.delay(3)

//Verify Claim was created
WebUI.waitForElementVisible(findTestObject('UI/Client/Claim Services/NewClaim/span_attachFiles'), 5)
WebUI.verifyElementVisible(findTestObject('UI/Client/Claim Services/NewClaim/span_attachFiles'))

//Add files to the new Claim
//Goto Files tab
WebUI.waitForElementClickable(findTestObject('Claim Services/a_filesTab'), 5)
WebUI.click(findTestObject('Claim Services/a_filesTab'))
WebUI.waitForPageLoad(5)


//Upload file
WebUI.uploadFile(findTestObject('UI/Client/Claim Services/input_NewFile'), UPFILE)
WebUI.delay(3)

//Select file name dropdown and select "Other"
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/selectFileNameDropDown'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/selectFileNameDropDown'))
WebUI.delay(2)
WebUI.click(findTestObject('UI/Client/Claim Services/option_otherFile'))
WebUI.delay(3)

//Click "Save" button to upload file
WebUI.waitForElementClickable(findTestObject('UI/Client/Claim Services/buttonSaveUpload'), 5)
WebUI.click(findTestObject('UI/Client/Claim Services/buttonSaveUpload'))
WebUI.waitForPageLoad(5)
WebUI.delay(3)

//Verify "File uploaded" message
WebUI.verifyElementVisible(findTestObject('UI/Client/Claim Services/strong_uploadedFileMessage'))
WebUI.delay(5)


//Logout
WebUI.waitForElementClickable(findTestObject('UI/General/Log/span_logoutAsClient'), 5)
WebUI.click(findTestObject('UI/General/Log/span_logoutAsClient'))
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_userAvatar'), 5)
WebUI.click(findTestObject('UI/General/Log/a_userAvatar'))
WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('UI/General/Log/a_signOutAMPS'), 5)
WebUI.click(findTestObject('UI/General/Log/a_signOutAMPS'))
WebUI.delay(1)

//Close browser
WebUI.closeBrowser()