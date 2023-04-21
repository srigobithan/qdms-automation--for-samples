package com.qa.automation.qdms.sample.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomingSamplePage {

  // *********************************************************************
  // Incoming Sample "Supplier Category" field
  // *********************************************************************
  @FindBy(id = "supplierCategory")
  public static WebElement suppliercattextbox;

  // **********************************************************************************
  // Incoming Sample "Supplier Category" field Validation message
  // **********************************************************************************
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]")
  public static WebElement suppliercattextboxValidation;

  // *********************************************************************
  // Incoming Sample "Plant" field
  // *********************************************************************
  @FindBy(id = "plant")
  public static WebElement planttextbox;

  // **********************************************************************************
  // Incoming Sample "Plant" field Validation message
  // **********************************************************************************
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]")
  public static WebElement planttextboxValidation;

  // *********************************************************************
  // Incoming Sample "Supplier" field
  // *********************************************************************
  @FindBy(id = "supplierName")
  public static WebElement suppliertextbox;

  // **********************************************************************************
  // Incoming Sample "Supplier" field Validation message
  // **********************************************************************************
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[3]/div/div[2]")
  public static WebElement suppliertextboxValidation;

  // *********************************************************************
  // Incoming Sample "Raw material" field
  // *********************************************************************
  @FindBy(id = "rawMaterialId")
  public static WebElement rawmaterialtextbox;

  // **********************************************************************************
  // Incoming Sample "Raw material" field Validation message
  // **********************************************************************************
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[2]")
  public static WebElement rawmaterialtextboxValidation;

  // *********************************************************************
  // Incoming Sample "Raw material" field
  // *********************************************************************
  @FindBy(id = "finishProductCode")
  public static WebElement samplecodetextbox;

  // **********************************************************************************
  // Incoming Sample "Raw material" field Validation message
  // **********************************************************************************
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[3]/div/div[1]")
  public static WebElement samplecodetextboxValidation;

  // **********************************************************************************
  // Incoming Sample "Save" Button
  // **********************************************************************************
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/button[2]")
  public static WebElement savebutton;

  // **********************************************************************************
  // Incoming Sample "Add Incoming sample" Button
  // **********************************************************************************
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div[2]/button")
  public static WebElement addincomingsample;

  // =================================TABLE X PATH
  // ====================================================
  @FindBy(
      xpath = "(//div[@class='ant-table ant-table-small ant-table-ping-right ant-table-fixed-header ant-table-fixed-column ant-table-scroll-horizontal ant-table-has-fix-left ant-table-has-fix-right'])[1]")
  public static WebElement incomingSampleTable;

  // ==================================== ADD INCOMING BUTTON
  // =============================================
  @FindBy(xpath = "//tbody/tr[2]/td[23]/span[1]/a[3]/span[1]//*[name()='svg']")
  public static WebElement addIncomingBtn;

  // ====================================== NEXT BUTTON
  // =====================================================
  @FindBy(xpath = "//li[@title='Next Page']//button[@type='button']")
  public static WebElement NextBtn;

  // ======================================== ADD BUTTON
  // ====================================================
  @FindBy(xpath = "//button[@class='ant-btn sc-gZMcBi dMdnOw']")
  public static WebElement addIncomSample;

  // ======================================== SAVE BUTTON
  // ==================================================
  @FindBy(xpath = "(//button[@type='button'])[5]")
  public static WebElement SaveBtn;

  // ==================================== BODY
  // =============================================================
  @FindBy(xpath = "//div[@class='ant-modal-body']")
  public static WebElement BodyOf_AddIncomingSample;

  // ============================ TIME FIELD
  // ==========================================================
  @FindBy(xpath = "//input[@placeholder='Select time']")
  public static WebElement TimeBefore;

  // ================================= TABLE DATA
  // =======================================================
  @FindBy(xpath = "(//td[@class='ant-table-cell'])[11]")
  public static WebElement tableDataTime;

  // ================================== STATUS
  // ========================================================
  @FindBy(
      xpath = "//body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[16]/span[1]/span[1]")
  public static WebElement StatusNew;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[11]/div/div[1]/span[2]")
  public static WebElement pageSelector;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[11]/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div")
  public static WebElement tenPage;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[11]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div")
  public static WebElement twntyPage;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[11]/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div")
  public static WebElement thtyPage;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/ul/li[11]/div/div[2]/div/div/div/div[2]/div/div/div/div[4]/div")
  public static WebElement huPage;
  @FindBy(
      xpath = "//*[@id=\'root\']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[2]")
  public static WebElement processSampleTable;

  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div/div[2]")
  public static WebElement IncSamTableContainer;

  // ============================== DELETE ============================================
  @FindBy(xpath = "(//span[@aria-label='delete'])[5]")
  public static WebElement DeleteButtonIcon;

  // ============================== DELETE OKAY =======================================
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
  public static WebElement DeleteOkayButton;

  // ============================== ALERT=============================================
  @FindBy(xpath = "//div[@class='ant-popover-inner-content']")
  public static WebElement alertDelete;

  @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div[3]/button[2]")
  public static WebElement incsameditbutton;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement CodeSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement SupplierSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement PlantSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement RawMaterialSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement SubCategorySearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement DateSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement ArrivalDateSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement SamplingDateSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement VehicleNoSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement SampleCodeSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement SourceSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement SampleTimeSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement BL_LC_NoSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement GRNSearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement QuantitySearchIcon;

  @FindBy(xpath = "//th[1]//div[1]//span[2]")
  public static WebElement StatusSearchIcon;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Code']")
  public static WebElement CodeTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Supplier']")
  public static WebElement SupplierTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Plant']")
  public static WebElement PlantTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Raw Material']")
  public static WebElement RawMaterialTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Sub Category']")
  public static WebElement SubCategoryTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Date ']")
  public static WebElement DateTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Arrival Date']")
  public static WebElement ArrivalDateTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Creation Date']")
  public static WebElement SamplingDateTextBox;

  @FindBy(
      xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder='  Vehicle No / Vessels']")
  public static WebElement VehicleNoTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder='  Sample code']")
  public static WebElement SampleCodeTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder='  Source']")
  public static WebElement SourceTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder='  Sample Time']")
  public static WebElement SampleTimeTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' BL/LC No']")
  public static WebElement BL_LC_NoTextBox;

  @FindBy(xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' GRN']")
  public static WebElement GRNTextBox;

  @FindBy(
      xpath = "//div[@class='ant-table-filter-dropdown']//input[@placeholder=' Quantity & Brand Received']")
  public static WebElement QuantityTextBox;

  @FindBy(
      xpath = "//div[@class='ant-table-filter-dropdown']//input[@class='ant-select-selection-search-input']")
  public static WebElement StatusTextBox;

  @FindBy(
      xpath = "//div[@class='ant-dropdown ant-dropdown-placement-bottomRight ']/div/div/div[2]/div/button[@class='ant-btn ant-btn-primary ant-btn-sm']")
  public static WebElement SearchButton;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
  public static List<WebElement> codeColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[2]")
  public static List<WebElement> SupplierColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[3]")
  public static List<WebElement> PlantColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[4]")
  public static List<WebElement> RawMaterialColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[5]")
  public static List<WebElement> SubCategoryColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[6]")
  public static List<WebElement> DateColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[7]")
  public static List<WebElement> ArrivalDateColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[8]")
  public static List<WebElement> SamplingDateColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[9]")
  public static List<WebElement> VehicleNoColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[10]")
  public static List<WebElement> SampleCodeColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[11]")
  public static List<WebElement> SourceColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[12]")
  public static List<WebElement> SampleTimeColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[13]")
  public static List<WebElement> BL_LC_NoColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[14]")
  public static List<WebElement> GRNColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[15]")
  public static List<WebElement> QuantityColumn;

  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[16]")
  public static List<WebElement> StatusColumn;

  // Before Search and After Search
  // ----------------------------------

  public static String codeBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String codeAfterSearch = "]/td[1]";

  public static String SupplierBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String SupplierAfterSearch = "]/td[2]";

  public static String PlantBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String PlantAfterSearch = "]/td[3]";

  public static String RawMaterialBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String RawMaterialAfterSearch = "]/td[4]";

  public static String SubCategoryBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String SubCategoryAfterSearch = "]/td[5]";

  public static String DateBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String DateAfterSearch = "]/td[6]";

  public static String ArrivalDateBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String ArrivalDateAfterSearch = "]/td[7]";

  public static String SamplingDateBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String SamplingDateAfterSearch = "]/td[8]";

  public static String VehicleNoBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String VehicleNoAfterSearch = "]/td[9]";

  public static String SampleCodeBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String SampleCodeAfterSearch = "]/td[10]";

  public static String SourceBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String SourceAfterSearch = "]/td[11]";

  public static String SampleTimeBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String SampleTimeAfterSearch = "]/td[12]";

  public static String BL_LC_NoBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String BL_LC_NoAfterSearch = "]/td[13]";

  public static String GRNBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String GRNAfterSearch = "]/td[14]";

  public static String QuantityBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String QuantityAfterSearch = "]/td[15]";

  public static String StatusBeforeSearch = "//tbody[@class='ant-table-tbody']/tr[";
  public static String StatusAfterSearch = "]/td[16]";

}
