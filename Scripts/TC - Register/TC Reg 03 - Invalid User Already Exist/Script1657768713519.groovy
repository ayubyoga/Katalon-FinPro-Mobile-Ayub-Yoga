import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.callTestCase(findTestCase('TC - Register/TC Reg 02 - Valid'), [('firstname') : 'second', ('lastname') : 'account'
        , ('country') : 'USA', ('username') : 'secondaccount', ('password') : 'GjpfHMqYYvap3a0RmZe3oA==', ('confirmpassword') : 'GjpfHMqYYvap3a0RmZe3oA=='], 
    FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login-Homepage/btn_CreateAProfile'), 0)

Mobile.tap(findTestObject('Create Profile/setText_FirstName'), 0)

Mobile.setText(findTestObject('Create Profile/setText_FirstName'), firstname, 0)

Mobile.tap(findTestObject('Create Profile/setText_LastName'), 0)

Mobile.setText(findTestObject('Create Profile/setText_LastName'), lastname, 0)

Mobile.tap(findTestObject('Create Profile/setText_Country'), 0)

Mobile.setText(findTestObject('Create Profile/setText_Country'), country, 0)

Mobile.tap(findTestObject('Create Profile/setText_Username'), 0)

Mobile.setText(findTestObject('Create Profile/setText_Username'), username, 0)

Mobile.tap(findTestObject('Create Profile/setText_Password'), 0)

Mobile.setEncryptedText(findTestObject('Create Profile/setText_Password'), password, 0)

Mobile.tap(findTestObject('Create Profile/setText_ConfirmPassword'), 0)

Mobile.setEncryptedText(findTestObject('Create Profile/setText_ConfirmPassword'), confirmpassword, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Create Profile/btn_CreateProfile'), 0)

driver.terminateApp(GlobalVariable.apiPackage)

