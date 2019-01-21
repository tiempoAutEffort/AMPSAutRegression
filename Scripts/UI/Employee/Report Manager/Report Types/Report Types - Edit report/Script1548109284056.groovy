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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Report Management Menu'))

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Report Types Sub Menu'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/h1_Report Types Title'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/h1_Report Types Title'), 5)

WebDriver driver = DriverFactory.getWebDriver()

def tableElement

def editButton

WebUI.delay(2)

while (true) {
    for (int rowID = 1; rowID <= 10; rowID++) {
        tableElement = driver.findElement(By.xpath(('//*[@id=\'content\']/div/div/div/div[3]/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr[' + 
                rowID) + ']/td[4]'))

        if (reportName.equals(tableElement.getText())) {
            editButton = driver.findElement(By.xpath(('//*[@id="content"]/div/div/div/div[3]/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr[' + 
                    rowID) + ']/td[2]/div/a/i'))

            break
        }
    }
    
    if (reportName.equals(tableElement.getText())) {
        break
    }
    
    WebUI.click(findTestObject('Object Repository/UI/Employee/Report Manager/Report Types/a_Next Page button'))
}

WebUI.delay(2)

editButton.click()

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Edit Form Title'), 
    5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/span_Edit Form Title'), 
    5)

WebUI.clearText(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_Report Name'))

WebUI.sendKeys(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/input_Report Name'), editedReportName)

WebUI.selectOptionByIndex(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/select_File Area Tag dropdown'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/button_Save'), 0)

WebUI.click(findTestObject('UI/Employee/Report Manager/Report Types/Create and Edit report/button_Save'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/a_Create New_button'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/a_Create New_button'), 5)

WebUI.delay(2)

while (true) {
    for (int rowID = 1; rowID <= 10; rowID++) {
        tableElement = driver.findElement(By.xpath(('//*[@id=\'content\']/div/div/div/div[3]/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr[' + 
                rowID) + ']/td[4]'))

        if (editedReportName.equals(tableElement.getText())) {
            break
        }
    }
    
    if (editedReportName.equals(tableElement.getText())) {
        break
    }
    
    WebUI.click(findTestObject('Object Repository/UI/Employee/Report Manager/Report Types/a_Next Page button'))
}

