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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.advancedpricing.com/')

//WebUI.maximizeWindow()

// user
WebUI.setText(findTestObject('UI/Employee/Files/input_AMPS Portal Sign In_code'), 'qaAuto')

// pass
WebUI.setEncryptedText(findTestObject('UI/Employee/Files/input_AMPS Portal Sign In_pass'), 'yjiIhAfFXTz0yohvbOLmCA==')

// button join
WebUI.click(findTestObject('UI/Employee/Files/input_Forgot Password_btn btn-'))


// click care navigator
WebUI.click(findTestObject('UI/Employee/Care Navigator/span_Care Navigator'))


//Search////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
			WebUI.click(findTestObject('UI/Employee/Care Navigator/Arrow to Write (1)'))
			WebUI.setText(findTestObject('UI/Employee/Care Navigator/input_Results_form-control inp'), 'The Benefit Group')
			
		
		//searching by Review
			
			WebUI.click(findTestObject('UI/Employee/Care Navigator/Arrow to Write'))
			WebUI.setText(findTestObject('UI/Employee/Care Navigator/input'), 'Review')
			WebUI.delay(1)
			WebUI.sendKeys(findTestObject('UI/Employee/Care Navigator/input'), Keys.chord(Keys.ENTER))
			WebUI.delay(1)
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_1 In Review'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_1 In Review'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_1 In Review'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_1 In Review'))
		
		
		//Searching by Local
			WebUI.click(findTestObject('UI/Employee/Care Navigator/Arrow to Write'))
			WebUI.setText(findTestObject('UI/Employee/Care Navigator/input'), 'Local')
			WebUI.delay(1)
			WebUI.sendKeys(findTestObject('UI/Employee/Care Navigator/input'), Keys.chord(Keys.ENTER))
			WebUI.delay(1)
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_2. Locating Facility'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_2. Locating Facility'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_2. Locating Facility'))
		
		//Searching by Schedule
			WebUI.click(findTestObject('UI/Employee/Care Navigator/Arrow to Write'))
			WebUI.setText(findTestObject('UI/Employee/Care Navigator/input'), 'Schedule')
			WebUI.delay(1)
			WebUI.sendKeys(findTestObject('UI/Employee/Care Navigator/input'), Keys.chord(Keys.ENTER))
			WebUI.delay(1)
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_4. Scheduled'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_4. Scheduled'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_4. Scheduled'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_4. Scheduled'))
			WebUI.click(findTestObject('UI/Employee/Care Navigator/td_4. Scheduled'))
			
		
			WebUI.click(findTestObject('UI/Employee/Care Navigator/Arrow to Write'))
			
		
///Care Detail (Click on event id from search results)/////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
//Searching by The Benefit Group
WebUI.delay(2)
WebUI.setText(findTestObject('UI/Employee/Care Navigator/input_Results_form-control inp_13'), 'The Benefit Group')

// saving data

	WebDriver driver = DriverFactory.getWebDriver()
	WebUI.delay(1)
	String stage = driver.findElement(By.xpath("//*[@id=\"DataTable6\"]/tbody/tr[1]/td[2]")).getText()
	String CurrentStatus = driver.findElement(By.xpath("//*[@id=\"DataTable6\"]/tbody/tr[1]/td[3]")).getText()
	String Followup = driver.findElement(By.xpath("//*[@id=\"DataTable6\"]/tbody/tr[1]/td[4]")).getText()
	String Patient = driver.findElement(By.xpath("//*[@id=\"DataTable6\"]/tbody/tr[1]/td[5]")).getText()
	String Client = driver.findElement(By.xpath("//*[@id=\"DataTable6\"]/tbody/tr[1]/td[6]")).getText()
	String Group = driver.findElement(By.xpath("//*[@id=\"DataTable6\"]/tbody/tr[1]/td[7]")).getText()
	
	WebUI.click(findTestObject('UI/Employee/Care Navigator/a_1477'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/a_Connex Events'))

	//String stage2 = driver.findElement(By.xpath("//*[@id=\"connexEventsTab\"]/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[4]")).getText()
	//String CurrentStatus2 = driver.findElement(By.xpath("//*[@id=\"connexEventsTab\"]/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[5]")).getText()
	//String Followup2 = driver.findElement(By.xpath("//*[@id=\"connexEventsTab\"]/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).getText()
	
	String Patient2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[3]/div/div[1]/div[1]/h1")).getText()
	String Client2 = driver.findElement(By.xpath("//*[@id=\"patientProfileTab\"]/div/div[1]/p/strong")).getText()
	String Group2 = driver.findElement(By.xpath("//*[@id=\"patientProfileTab\"]/div/div[2]/p/strong")).getText()

	Client2.contains(Client)
	Patient2.contains(Patient)
	Group2.contains(Group)

///	Connex Events (From Case Detail, Connext Event Tab)
/// veriy data from last screeen
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Client'))
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Care Navigator/strong_The Benefit Group'))
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Phone'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/strong_(582) 555-4747'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Client Group'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/strong_PeopleServices Inc. (RB'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Email'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/a_nothingnobody.com'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Date of Birth'))
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Care Navigator/strong_10091946'))
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Care Navigator/i_Showing 0 to 0 of 0 entries_'))
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Care Navigator/a_Other'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Note'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Current Status'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/label_Follow-up'))

///// Create new Connex Event (Click on Account from Account Search Results,
	WebUI.setText(findTestObject('UI/Employee/Care Navigator/textarea_Test automation'), 'Test automation')
	WebUI.selectOptionByValue(findTestObject('UI/Employee/Care Navigator/select_1 In Review2. Locating'), '10', true)
	WebUI.selectOptionByValue(findTestObject('UI/Employee/Care Navigator/select_Gathering InformationVe'), '7', true)
	WebUI.delay(2)
	WebUI.click(findTestObject('UI/Employee/Care Navigator/div_Follow-upJanuary 2019SunMo'))
	WebUI.setText(findTestObject('UI/Employee/Care Navigator/Calendar'), '12/12/2020')
	WebUI.setText(findTestObject('UI/Employee/Care Navigator/input_Follow-up_form-control f'), '12/12/2020')
	WebUI.click(findTestObject('UI/Employee/Care Navigator/div_Stage1 In Review2. Locatin'))

//// Account Search (Click on Account Search from Care Navigation)	
	WebUI.delay(1)
	WebUI.click(findTestObject('UI/Employee/Care Navigator/button_Save'))
	WebUI.delay(1)
	WebUI.setText(findTestObject('UI/Employee/Care Navigator/input_Transfer Provider Call_f'), 'other')
	WebUI.sendKeys(findTestObject('UI/Employee/Care Navigator/input_Transfer Provider Call_f'), Keys.chord(Keys.ENTER))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/td_Other'))
	WebUI.click(findTestObject('UI/Employee/Care Navigator/span_2. Locating Facility'))


	WebUI.closeBrowser()


