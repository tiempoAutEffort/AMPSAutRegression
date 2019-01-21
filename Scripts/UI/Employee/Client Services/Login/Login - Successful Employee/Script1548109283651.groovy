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

WebUI.openBrowser('https://uat.advancedpricing.com/login')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Services/ForgotPassword/a_ForgotPassword'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Services/ForgotPassword/a_ForgotPassword'), 5)

WebUI.waitForElementPresent(findTestObject('UI/General/Page_LoginPage/button_Login'), 5)

WebUI.waitForElementVisible(findTestObject('UI/General/Page_LoginPage/button_Login'), 5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Services/Login/input_Password'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Services/Login/input_Password'), 5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Client Services/Login/input_User'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Client Services/Login/input_User'), 5)

WebUI.setText(findTestObject('UI/Employee/Client Services/Login/input_User'), user)

WebUI.setText(findTestObject('UI/Employee/Client Services/Login/input_Password'), password)

WebUI.click(findTestObject('UI/Employee/Client Services/Login/button_Login'))

WebUI.waitForElementPresent(findTestObject('UI/General/Page_Employee landing page/img_AMPSLogo'), 5)

WebUI.waitForElementVisible(findTestObject('UI/General/Page_Employee landing page/img_AMPSLogo'), 5)

WebUI.waitForElementPresent(findTestObject('UI/General/Page_Employee landing page/span_ClientsMenu'), 5)

WebUI.waitForElementVisible(findTestObject('UI/General/Page_Employee landing page/span_ClientsMenu'), 5)

WebUI.waitForElementPresent(findTestObject('UI/General/Page_Employee landing page/h1_ClientsTitle'), 5)

WebUI.waitForElementVisible(findTestObject('UI/General/Page_Employee landing page/h1_ClientsTitle'), 5)

WebUI.closeBrowser()

