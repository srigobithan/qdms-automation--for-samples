
package com.qa.automation.qdms.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InprocessSamplePage {

  // QDMS user name XPath
  @FindBy(xpath = "//*[@id ='usernameOrEmail']")
  public static WebElement username;

  // QDMS Password XPath
  @FindBy(id = "password")
  public static WebElement password;

  // QDMS Login button XPath
  @FindBy(xpath = "//button[@type]")
  public static WebElement login;

  // Sample card
  @FindBy(xpath = "//a[@href='#/samples']")
  public static WebElement Sample;

  // Raw Material top click
  @FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/ul/li[1]")
  public static WebElement RawMaterialTopbar;

  // InprocessSample Site button Click
  @FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[2]/div[1]")
  public static WebElement InprocessSample;

  // Add InprocessSample button
  @FindBy(xpath = "//button[@class='ant-btn sc-gZMcBi dMdnOw']")
  public static WebElement AddInprocessSamplebtn;

  // Supplier Category Filed
  @FindBy(xpath = "//div[@name='supplierCategory']")
  public static WebElement SupplierCategoryField;

  // Plant Filed
  @FindBy(xpath = "//div[@name='plant']")
  public static WebElement PlantField;

  // Supplier Filed
  @FindBy(xpath = "//input[@id='supplierName']")
  public static WebElement SupplierNameField;

  // RawMaterial Filed
  @FindBy(xpath = "//input[@id='rawMaterialId']")
  public static WebElement RawMaterialField;

  // Vehicle No Filed
  @FindBy(xpath = "//input[@id='vehicleNo']")
  public static WebElement VehicleNoField;

  // Sample Code Filed
  @FindBy(xpath = "//input[@id='finishProductCode']")
  public static WebElement SampleCodeField;

  // Source Filed
  @FindBy(xpath = "//input[@id='source']")
  public static WebElement SourceField;

  // Date of Sampling Filed
  @FindBy(xpath = "//input[@id='creationDate']")
  public static WebElement DateofSamplingField;


  // Date of Sampling Filed CLOSE button
  @FindBy(
      xpath = "//div[contains(@class,'ant-picker ant-picker-focused')]//span[contains(@role,'button')]")
  public static WebElement DateofSamplingFieldclosebtn;

  // Sampled Time Filed
  @FindBy(xpath = "//input[@name='sampledTime']")
  public static WebElement SampledTimeField;

  // Date of Sampling Time CLOSE button
  @FindBy(
      xpath = "//div[contains(@class,'ant-picker ant-picker-focused')]//span[contains(@role,'button')]")
  public static WebElement DateofSampleTimeFieldclosebtn;

  // Arrival Date Filed
  @FindBy(xpath = "//input[@id='arrivalDate']")
  public static WebElement ArrivalDateField;

  // BL/LC No Filed
  @FindBy(xpath = "//input[@id='bllcNo']")
  public static WebElement BLLCNoField;

  // GRN Filed
  @FindBy(xpath = "//input[@id='aod']")
  public static WebElement GRNField;

  // Quantity and brand received Filed
  @FindBy(xpath = "//input[@id='quantityAndBrandReceived']")
  public static WebElement QuantityandbrandreceivedField;

  // Save Button
  @FindBy(xpath = "//button[@style='background: rgb(0, 19, 40); color: white; border: none;']")
  public static WebElement Savebtn;

  // Cancel Button
  @FindBy(xpath = "//button[@class='ant-btn']")
  public static WebElement Cancelbtn;

  // Today Click
  @FindBy(xpath = "/html/body/div[12]/div/div/div/div/div[2]/a")
  public static WebElement Todaybtn;

  // Modifi Quenthan17.04.2023
  @FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[3]/a/div/div")
  public static WebElement sampleCard;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div[2]/button")
  public static WebElement addProcessSample;

  @FindBy(xpath = "//*[@id=\"rcDialogTitle0\"]/div")
  public static WebElement addprsamtitle;

  @FindBy(id = ("supplierCategory"))
  public static WebElement supplierCategoryTextbox;

  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]")
  public static WebElement supplierCategoryTextboxerr;

  @FindBy(xpath = "//div[@class='ant-modal-footer']/button[2]")
  public static WebElement addArocessSampleSave;

  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[2]")
  public static WebElement table;

  @FindBy(id = "plant")
  public static WebElement planttextbox;

  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]")
  public static WebElement plantTextBoxErr;

  @FindBy(id = "supplierName")
  public static WebElement suupplierNameTextBox;

  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[3]/div/div[2]")
  public static WebElement suupplierNameTextBoxerr;

  @FindBy(id = "rawMaterialId")
  public static WebElement rawMaterialIdTextBox;

  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]")
  public static WebElement rawMaterialIdTextBoxerr;

  @FindBy(id = "finishProductCode")
  public static WebElement sampleCodeTextBox;

  @FindBy(
      xpath = "//form[@class='ant-legacy-form ant-legacy-form-horizontal sc-gqjmRU brqWbd']/div[2]/div[3]/div/div[1]")
  public static WebElement sampleCodeTextBoxErr;

  @FindBy(
      xpath = "//*[@id=\'root\']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[2]")
  public static WebElement processSampleTable;

  // In process Sample Dashboard
  @FindBy(
      xpath = "//div[@style='margin-top: -5px; margin-left: -10px; font-size: medium; font-weight: 600; align-self: auto; text-align: justify; padding: 10px; height: 25px; flex-basis: 650px;']")
  public static WebElement DashboardInProcess;

  // Add InProcess Sample Success Message
  @FindBy(
      xpath = "//div[@class='ant-notification-notice ant-notification-notice-success ant-notification-notice-closable']")
  public static WebElement AddInProcessSamplesuccessmsg;

  // Last added data come in first line
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]")
  public static WebElement AddInProcessfirstdata;

  // ***********************DELETE XPATH - IN PROCESS SAMPLE*******************


  // Delete Ok button Filed
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
  public static WebElement Deleteokbtn;

  // Delete InProcess Sample Success Message
  @FindBy(
      xpath = "//div[@class='ant-notification-notice ant-notification-notice-success ant-notification-notice-closable']")
  public static WebElement deleteInProcessSamplesuccessmsg;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[9]/div/div[1]/span[2]")
  public static WebElement pageSelector;

  @FindBy(
      xpath = "//*[@id=\'root\']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[9]/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div")
  public static WebElement tenPage;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[9]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div")
  public static WebElement twntyPage;

  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[9]/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div")
  public static WebElement thtyPage;

  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[9]/div/div[2]/div/div/div/div[2]/div/div/div/div[4]/div")
  public static WebElement huPage;

  // *********************In Process Sample Code Search XPath*************************
  // Code Search icon XPath
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/table/thead/tr/th[1]/div/span[2]/span")
  public static WebElement Codesearchicon;

  // Code Search text box XPath
  @FindBy(xpath = "//input[@placeholder=' Code']")
  public static WebElement Codesearchtextbox;

  // Code Search button XPath
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
  public static WebElement Codesearchbutton;

  // Code Search Reset XPath
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-sm']")
  public static WebElement Codereseticon;

  // Code Search screen PopUp icon XPath
  @FindBy(xpath = "//div[@style='padding: 8px; margin-top: -140px; width: 200px;']")
  public static WebElement Codesearchpopup;

  // ===========================================================================================
  // X-PATH -SARANKA FOR COPY PASTE

  // ============================== TABLE X PATH
  // =======================================
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div")
  public static WebElement Table;

  // ================================== COPY
  // ===========================================
  @FindBy(xpath = "(//span[@aria-label='copy'])[2]")
  public static WebElement copyIcon;

  // ==================================== NEXT BUTTON
  // =================================
  @FindBy(xpath = "//li[@title='Next Page']//button[@type='button']")
  public static WebElement NextButton;

  // ==================================== ADD PROCESS SAMPLE
  // ============================
  @FindBy(xpath = "(//button[@class='ant-btn sc-gZMcBi dMdnOw'])[1]")
  public static WebElement addProcessSampleButton;

  // ===================================== SAVE BUTTON
  // ==================================
  @FindBy(xpath = "(//button[@type='button'])[5]")
  public static WebElement SaveButton;

  // ==================================== BODY
  // ===========================================
  @FindBy(xpath = "//div[@class='ant-modal-body']")
  public static WebElement ModalBody;

  // =================================== TIME FIELD
  // ======================================
  @FindBy(xpath = "//input[@placeholder='Select time']")
  public static WebElement beforeTimeField;

  // =============================== TABLE DATA
  // ============================================
  @FindBy(xpath = "(//td[@class='ant-table-cell'])[8]")
  public static WebElement aftertableDataTimeField;

  // ============================= STATUS
  // =================================================
  @FindBy(
      xpath = "//body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[16]/span[1]/span[1]")
  public static WebElement StatusBarNew;

  // *********************In Process Sample Plant Search
  // XPath*************************
  // Plant Search icon XPath
  @FindBy(
      xpath = "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[3]/div[1]/span[2]/span[1]")
  public static WebElement Plantsearchicon;

  // Plant Search text box XPath
  @FindBy(xpath = "//input[@placeholder=' Plant']")
  public static WebElement Plantsearchtextbox;

  // Plant Search button XPath
  @FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary ant-btn-sm'])[1]")
  public static WebElement Plantsearchbutton;

  // Plant Search Reset XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div[3]/button")
  public static WebElement Plantreseticon;

  // Plant Search screen PopUp icon XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div")
  public static WebElement Plantsearchpopup;

  // *********************In Process Sample Raw Material Search XPath*************************
  // Raw Material Search icon XPath
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/table/thead/tr/th[4]/div/span[2]/span")
  public static WebElement RMsearchicon;

  // Raw Material Search text box XPath
  @FindBy(xpath = "//input[@placeholder=' Raw Material']")
  public static WebElement RMsearchtextbox;

  // Raw Material Search button XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div[1]/button")
  public static WebElement RMsearchbutton;

  // Raw Material Search Reset XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div[3]/button")
  public static WebElement RMreseticon;

  // Raw Material Search screen PopUp icon XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div")
  public static WebElement RMsearchpopup;

  // In Process Sample Scroll bar horizontal XPath
  @FindBy(xpath = "//div[@class='ant-table-body']")
  public static WebElement HRScroll;

  // In Process Sample Table XPath
  @FindBy(xpath = "//div[@class='ant-spin-container']")
  public static WebElement Inprocesssampletable;

  // *********************In Process Sample Sub Category Search XPath*************************
  // Sub Category Search icon XPath
  @FindBy(xpath = "(//span[@aria-label='search'])[5]")
  public static WebElement SCsearchicon;

  // Sub Category Search text box XPath
  @FindBy(xpath = "//input[@placeholder=' Sub Category']")
  public static WebElement Scsearchtextbox;

  // Sub Category Search button XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div[1]/button")
  public static WebElement SCsearchbutton;

  // Sub Category Search Reset XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div[3]/button")
  public static WebElement SCreseticon;

  // Sub Category Search screen PopUp icon XPath
  @FindBy(xpath = "/html/body/div[2]/div/div/div/div")
  public static WebElement SCsearchpopup;
}
