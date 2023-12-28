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

WebUI.click(findTestObject('Object Repository/a_New Test Case'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_SelectBuild2 Build3 build1'), '21212', true)

WebUI.click(findTestObject('Object Repository/div_block-ui-wrapper block-ui-main active'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Selectmod1module1'), '73325', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Requirement Title 1'), '53842', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Test Scenario name 1 Test Sce_cf48c7'), '168343', 
    true)

WebUI.setText(findTestObject('Object Repository/input_tc_name'), 'i will be executing this from katalon cli')

WebUI.setText(findTestObject('Object Repository/textarea_summary'), 'this will be amazing')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_SelectPending Approval Approved Rejected'), '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_SelectPending Approval Approved Rejected'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Testing Type3 Testing Type2 T_73554a'), 'Testing_Type3', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Priority3  Priority2  Priorit_f0f572'), 'Low', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_SelectOpen Tasks Ongoing Tasks Compl_640ee5'), '69960', 
    true)

WebUI.setText(findTestObject('Object Repository/input_time'), '02:00')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select'), '0', true)

WebUI.click(findTestObject('Object Repository/div_BuildSelectBuild2 Build3 build1  Module_b8495e'))

WebUI.click(findTestObject('Object Repository/button_Save'))

WebUI.click(findTestObject('Object Repository/td_i will be executing this from katalon cli'))

WebUI.click(findTestObject('Object Repository/td_this will be amazing'))

WebUI.click(findTestObject('Object Repository/td_2023-12-21'))

