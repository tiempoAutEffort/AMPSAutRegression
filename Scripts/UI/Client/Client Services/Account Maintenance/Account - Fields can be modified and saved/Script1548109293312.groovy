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

not_run: WebUI.click(findTestObject('UI/Client/Client Services/Account/a_SettingsMenu'))

not_run: WebUI.scrollToElement(findTestObject('UI/Client/Client Services/Account/a_SettingsMenu'), 5)

not_run: WebUI.click(findTestObject('UI/Client/Client Services/Account/span_AccountSubMenu'))

not_run: WebUI.waitForElementPresent(findTestObject('UI/Client/Client Services/Account/h1_Account Title'), 5)

not_run: WebUI.waitForElementVisible(findTestObject('UI/Client/Client Services/Account/h1_Account Title'), 5)

WebUI.scrollToElement(findTestObject('UI/Client/Client Services/Account/h1_Account Title'), 5)

WebUI.clearText(findTestObject('UI/Client/Client Services/Account/input_Account_First Name'))

WebUI.sendKeys(findTestObject('UI/Client/Client Services/Account/input_Account_First Name'), firstName)

WebUI.clearText(findTestObject('UI/Client/Client Services/Account/input_Account_Last Name'))

WebUI.sendKeys(findTestObject('UI/Client/Client Services/Account/input_Account_Last Name'), lastName)

WebUI.clearText(findTestObject('UI/Client/Client Services/Account/input_Account_Email Address'))

WebUI.sendKeys(findTestObject('UI/Client/Client Services/Account/input_Account_Email Address'), emailAddress)

WebUI.clearText(findTestObject('UI/Client/Client Services/Account/input_Account_Telephone'))

WebUI.sendKeys(findTestObject('UI/Client/Client Services/Account/input_Account_Telephone'), telephone)

WebUI.click(findTestObject('UI/Client/Client Services/Account/button_Account_Save Button'))

WebUI.waitForElementPresent(findTestObject('UI/Client/Client Services/Account/strong_Account_Profile Updated Message'), 
    5)

WebUI.waitForElementVisible(findTestObject('UI/Client/Client Services/Account/strong_Account_Profile Updated Message'), 
    5)

actualUpdateMessage = WebUI.getText(findTestObject('UI/Client/Client Services/Account/strong_Account_Profile Updated Message'))

WebUI.verifyEqual(actualUpdateMessage, expectedUpdateMessage)

