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

WebUI.callTestCase(findTestCase('Login Page Swag Labs'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_firstName'), findTestData('New Test Data').getValue(
        3, 1))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_lastName'), findTestData('New Test Data').getValue(
        4, 1))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_postalCode'), findTestData('New Test Data').getValue(
        5, 1))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/button_Back Home'))

not_run: WebUI.closeBrowser()

