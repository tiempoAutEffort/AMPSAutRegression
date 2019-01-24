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

WebUI.callTestCase(findTestCase('UI/General/No Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent((findTestObject('UI/Employee/user detail/Create new User/Page_AMPS Portal/span_Users')), 4)

WebUI.delay(3)

WebUI.navigateToUrl('https://uat.advancedpricing.com/users/new')

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('UI/General/Page_LoginPage/button_Login'), 5)

WebUI.closeBrowser()



