import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

WebUI.navigateToUrl('https://kualiteedemo.kualitee.com/')

WebUI.setText(findTestObject('Object Repository/inputemail_id'), 'shahrukh.khaliq@kualitatem.com')

WebUI.setEncryptedText(findTestObject('Object Repository/inputpassword'), 'MV9KurHwBdXuN2kGL7auTg==')

WebUI.click(findTestObject('Object Repository/input_submit-btn'))

WebUI.rightClick(findTestObject('Object Repository/span_1'))

WebUI.click(findTestObject('Object Repository/span_1'))

WebUI.click(findTestObject('Object Repository/span_1'))

WebUI.click(findTestObject('Object Repository/a_New Test Case'))

WebUI.setText(findTestObject('Object Repository/input_tc_name'), 'xsdsd')

WebUI.setText(findTestObject('Object Repository/textarea_summary'), 'sdfsdfsdf')

WebUI.click(findTestObject('Object Repository/button_Save'))

WebUI.click(findTestObject('Object Repository/button_Save'))
WebUI.takeScreenshot('Defect_Created_Successfully')

WebUI.closeBrowser()

