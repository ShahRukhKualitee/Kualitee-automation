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

WebUI.click(findTestObject('Object Repository/span_1'))

WebUI.click(findTestObject('Object Repository/a_Your Checklist'))

WebUI.click(findTestObject('Object Repository/i_fa-solid fa-times'))

WebUI.click(findTestObject('Object Repository/label_custom-control-label'))

WebUI.click(findTestObject('Object Repository/label_custom-control-label'))

WebUI.click(findTestObject('Object Repository/label_custom-control-label'))

WebUI.click(findTestObject('Object Repository/label_custom-control-label'))

WebUI.click(findTestObject('Object Repository/label_custom-control-label'))

WebUI.click(findTestObject('Object Repository/button_Bulk Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select BuildBuild2 Build3 build1'), '21227', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select BuildBuild2 Build3 build1'), '21227', true)

WebUI.click(findTestObject('Object Repository/div_RequirementSelect RequirementTest Scena_7d154f'))

WebUI.click(findTestObject('Object Repository/button_Apply'))

WebUI.click(findTestObject('Object Repository/span_Bulk update completed successfully'))

