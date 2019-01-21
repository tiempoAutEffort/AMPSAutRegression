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
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Report Management Menu'))

WebUI.click(findTestObject('UI/Employee/Report Manager/span_Report Types Sub Menu'))

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/h1_Report Types Title'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/h1_Report Types Title'), 5)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/a_Create New_button'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/a_Create New_button'), 5)

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

def tableElement

def deleteButton

while (true) {
    for (int rowID = 1; rowID <= 10; rowID++) {
        tableElement = driver.findElement(By.xpath(('//*[@id=\'content\']/div/div/div/div[3]/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr[' + 
                rowID) + ']/td[4]'))

        if (reportName.equals(tableElement.getText())) {
            deleteButton = driver.findElement(By.xpath(('//*[@id=\'content\']/div/div/div/div[3]/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/table/tbody/tr[' + 
                    rowID) + ']/td[2]/div/div/i'))

            break
        }
    }
    
    if (reportName.equals(tableElement.getText())) {
        break
    }
    
    WebUI.click(findTestObject('Object Repository/UI/Employee/Report Manager/Report Types/a_Next Page button'))
}

WebUI.delay(2)

deleteButton.click()

WebUI.delay(2)

WebUI.click(findTestObject('UI/Employee/Report Manager/Report Types/button_delete warning message_Yes Button'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('UI/Employee/Report Manager/Report Types/h_Report Deleted Tittle'), 5)

WebUI.waitForElementVisible(findTestObject('UI/Employee/Report Manager/Report Types/h_Report Deleted Tittle'), 5)

WebUI.verifyElementText(findTestObject('UI/Employee/Report Manager/Report Types/h_Report Deleted Tittle'), 'Report Deleted')

WebUI.click(findTestObject('UI/Employee/Report Manager/Report Types/button_delete warning message_Yes Button'))

