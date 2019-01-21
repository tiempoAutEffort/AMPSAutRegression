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

WebUI.click(findTestObject('UI/Employee/Client Services/Account/span_AccountSubMenu'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Services/Account/h1_Account Title'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Services/Account/h1_Account Title'), 5)

WebUI.scrollToElement(findTestObject('UI/Employee/Client Services/Account/h1_Account Title'), 5)

WebUI.sendKeys(findTestObject('UI/Employee/Client Services/Account/input_Account_Current Password'), currentPassword)

WebUI.sendKeys(findTestObject('UI/Employee/Client Services/Account/input_Account_New Password'), newPassword)

WebUI.sendKeys(findTestObject('UI/Employee/Client Services/Account/input_Account_Confirm Password'), newPassword)

not_run: WebUI.click(findTestObject('UI/Employee/Client Services/Account/button_Account_Save Button'))

not_run: WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Services/Account/strong_Account_Profile Updated Message'), 
    5)

not_run: WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Services/Account/strong_Account_Profile Updated Message'), 
    5)

not_run: actualUpdateMessage = WebUI.getText(findTestObject('UI/Employee/Client Services/Account/strong_Account_Profile Updated Message'))

not_run: WebUI.verifyEqual(actualUpdateMessage, expectedUpdateMessage)

WebUI.scrollToElement(findTestObject('UI/Employee/Client Services/Account/h1_Account Title'), 5)

WebUI.sendKeys(findTestObject('UI/Employee/Client Services/Account/input_Account_Current Password'), newPassword)

WebUI.sendKeys(findTestObject('UI/Employee/Client Services/Account/input_Account_New Password'), currentPassword)

WebUI.sendKeys(findTestObject('UI/Employee/Client Services/Account/input_Account_Confirm Password'), currentPassword)

not_run: WebUI.click(findTestObject('UI/Employee/Client Services/Account/button_Account_Save Button'))

not_run: WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Services/Account/strong_Account_Profile Updated Message'), 
    5)

not_run: WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Services/Account/strong_Account_Profile Updated Message'), 
    5)

