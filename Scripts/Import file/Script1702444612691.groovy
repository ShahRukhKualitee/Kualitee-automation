import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://provf.kualitee.com/')

WebUI.setText(findTestObject('Object Repository/inputemail_id'), 'faran.khurshid+0002@kualitatem.com')

WebUI.setEncryptedText(findTestObject('Object Repository/inputpassword'), 'v3kAI8dBmpbvybN/9lFmqA==')

WebUI.click(findTestObject('Object Repository/input_submit-btn'))
WebUI.click(findTestObject('Object Repository/span'))

WebUI.click(findTestObject('Object Repository/a_Import Defects'))
//WebUI.waitForElementClickable('Object Repository/span_Browse', 10)
//WebUI.click(findTestObject('Object Repository/span_Browse'))
WebUI.waitForPageLoad(10) // if you are moving to a new page // if you are waiting for element to appear
excelFilePath = 'C:/Users/Shahrukh Khaliq/Downloads/bug.xlsx'
WebUI.uploadFile(findTestObject('Object Repository/span_Browse'), 'C:/Users/Shahrukh Khaliq/Downloads/bug.xlsx')
//WebUI.uploadFile(findTestOject('Object Repository/span_Browse'), excelFilePath)

WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Assign To provf faran.khurshid0002'), '16970', true)

//a[text()='Your Button Text']

WebUI.click(findTestObject('Object Repository/button_Next'))


WebUI.closeBrowser()

