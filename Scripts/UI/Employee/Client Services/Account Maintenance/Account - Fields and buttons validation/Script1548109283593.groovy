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

WebUI.click(findTestObject('UI/Employee/Client Services/Account/a_SettingsMenu'))

WebUI.scrollToElement(findTestObject('UI/Employee/Client Services/Account/a_SettingsMenu'), 5)

WebUI.click(findTestObject('UI/Client/Client Services/Account/span_AccountSubMenu'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Services/Account/h1_Account Title'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Services/Account/h1_Account Title'), 5)

WebUI.scrollToElement(findTestObject('UI/Employee/Client Services/Account/h1_Account Title'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/b_Account_Identification'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_User Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_User Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_First Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_First Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_Last Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_Last Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_Email Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_Email Address'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_Telephone'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_Telephone'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/b_Account_Password Change'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_Current Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_Current Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_New Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_New Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/label_Account_Confirm Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/input_Account_Confirm Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/b_Account_Multifactor Authentication'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/a_Account_Setup Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/b_Account_info Message'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('UI/Employee/Client Services/Account/button_Account_Save Button'), FailureHandling.CONTINUE_ON_FAILURE)

