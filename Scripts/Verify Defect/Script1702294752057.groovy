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

WebUI.navigateToUrl('https://kualiteedemo.kualitee.com')

WebUI.click(findTestObject('Object Repository/inputemail_id'))

WebUI.setText(findTestObject('Object Repository/inputemail_id'), 'shahrukh.khaliq@kualitatem.com')

WebUI.setEncryptedText(findTestObject('Object Repository/inputpassword'), 'MV9KurHwBdXuN2kGL7auTg==')

WebUI.sendKeys(findTestObject('Object Repository/inputpassword'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Object Repository/Defects created'), 10)

alert = WebUI.getText(findTestObject('Object Repository/Defects created'))

System.out.println(alert)

String expectedText = 'Invalid credentials.'

if (!(expectedText.equals(alert))) {
    // Strings are not equal
    KeywordUtil.markFailed("Text comparison failed! Expected: $expectedText, Actual: $actualText")
}

WebUI.setEncryptedText(findTestObject('Object Repository/inputpassword'), 'v3kAI8dBmpbvybN/9lFmqA==')

WebUI.click(findTestObject('Object Repository/input_submit-btn'))

WebUI.click(findTestObject('Object Repository/span_1'))

WebUI.click(findTestObject('Object Repository/a_New Defect'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Blocker Major Minor'), 'Major', true)

WebUI.setText(findTestObject('Object Repository/input_description'), 'demo katalon studio')

WebUI.click(findTestObject('Object Repository/button_Save'))

//WebUI.verifyElementNotPresent(findTestObject('Object Repository/div_block-ui-wrapper block-ui-main active'), 10)
WebUI.waitForElementPresent(findTestObject('Object Repository/span_Defects created successfully'), 10)

text = WebUI.getText(findTestObject('Object Repository/span_Defects created successfully'))

System.out.println(text)

WebUI.closeBrowser()

