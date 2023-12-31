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

WebUI.click(findTestObject('Object Repository/html_Kualitee 3.0 Pre Production        (fu_ff11d5'))

WebUI.click(findTestObject('Object Repository/div_block-ui-wrapper block-ui-main active'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://provf.kualitee.com/')

WebUI.setText(findTestObject('Object Repository/inputemail_id'), 'faran.khurshid+0002@kualitatem.com')

WebUI.setEncryptedText(findTestObject('Object Repository/inputpassword'), 'v3kAI8dBmpbvybN/9lFmqA==')

WebUI.sendKeys(findTestObject('Object Repository/inputpassword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/span_1'))

WebUI.click(findTestObject('Object Repository/a_br-sb-buttons'))

WebUI.click(findTestObject('Object Repository/a_Import Defects'))

WebUI.click(findTestObject('Object Repository/span_Browse'))

WebUI.click(findTestObject('Object Repository/div_Browse Drag and Drop here'))

WebUI.click(findTestObject('Object Repository/div_Browse Drag and Drop here'))

WebUI.click(findTestObject('Object Repository/span_Browse'))

WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Assign To provf faran.khurshid0002'), '16970', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Assign To provf faran.khurshid0002'), '16970', true)

WebUI.click(findTestObject('Object Repository/button_Next'))

