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

WebUI.callTestCase(findTestCase('Login_orangehrm'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ascenttechnologyconsulting.sharepoint.com/sites/Ascent_Documents/Shared%20Documents/Forms/AllItems.aspx?csf=1&web=1&e=xX0f2m&cid=0533f8d9%2D6c5a%2D4d33%2D8b99%2D661e435e6f3a&FolderCTID=0x012000620C63211E6B884DB8D427CAA1658228&id=%2Fsites%2FAscent%5FDocuments%2FShared%20Documents%2FAutoRecon%2FClients%2FFidelity%2FDeliverables%2FTesting%2FTest%20Cases%2FDefect&viewid=429bb808%2Df2ae%2D484e%2D9e29%2D9242ec088953&OR=Teams%2DHL&CT=1682322359950&clickparams=eyJBcHBOYW1lIjoiVGVhbXMtRGVza3RvcCIsIkFwcFZlcnNpb24iOiIyNy8yMzAzMDUwMTExMCIsIkhhc0ZlZGVyYXRlZFVzZXIiOmZhbHNlfQ')

WebUI.switchToWindowTitle('OrangeHRM')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_My Info'))

