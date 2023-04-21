package com.qa.automation.qdms.sample.commonmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.automation.qdms.base.DriverIntialization;

public class SampleActionMethods extends DriverIntialization {
  public static void clicking(WebElement element, long waitTimeInSecond, String comment) {
    boolean Value1 = false;
    try {
      boolean value1 = element.isDisplayed();
      SampleCommonMethods.TestCasePrint(comment + " IS DISPLAYED", "true", String.valueOf(value1));
      boolean value2 = element.isEnabled();
      SampleCommonMethods.TestCasePrint(comment + " IS ENABLED", "true", String.valueOf(value2));
      element.click();
    } catch (Exception e) {
      SampleCommonMethods.TestCasePrint(comment + " IS NOT THERE ", "true", String.valueOf(Value1),
          String.valueOf(e));
    }

  }

  public static void sendkeys(WebElement element, String text, String comment) {
    boolean Value1 = false;
    try {
      boolean value1 = element.isDisplayed();
      SampleCommonMethods.TestCasePrint(comment + " IS DISPLAYED", "true", String.valueOf(value1));
      boolean value2 = element.isEnabled();
      SampleCommonMethods.TestCasePrint(comment + " IS ENABLED", "true", String.valueOf(value2));
      element.click();
      element.clear();
      element.sendKeys(text);
    } catch (Exception e) {
      SampleCommonMethods.TestCasePrint(comment + " IS NOT THERE ", "true", String.valueOf(Value1),
          String.valueOf(e));
    }
  }

  public static void selectByVisibleText(WebElement element, String text, String comment) {
    boolean Value1 = false;
    try {
      boolean value1 = element.isDisplayed();
      SampleCommonMethods.TestCasePrint(comment + " IS DISPLAYED", "true", String.valueOf(value1));
      boolean value2 = element.isEnabled();
      SampleCommonMethods.TestCasePrint(comment + " IS ENABLED", "true", String.valueOf(value2));
      Select select = new Select(element);
      select.selectByVisibleText(text);
    } catch (Exception e) {
      SampleCommonMethods.TestCasePrint(comment + " IS NOT THERE ", "true", String.valueOf(Value1),
          String.valueOf(e));
    }
  }

  // Accepting alert
  public static void alertaccepting(WebDriver driver) {
    driver.switchTo().alert().accept();
  }

  // dismiss alert
  public static void alertdismiss(WebDriver driver) {
    driver.switchTo().alert().dismiss();
  }

  public static void mousehover(WebElement element, String comment) {
    boolean Value1 = false;
    try {
      boolean value1 = element.isDisplayed();
      SampleCommonMethods.TestCasePrint(comment + " IS DISPLAYED", "true", String.valueOf(value1));
      boolean value2 = element.isEnabled();
      SampleCommonMethods.TestCasePrint(comment + " IS ENABLED", "true", String.valueOf(value2));
      Actions action = new Actions(driver);
      action.moveToElement(element).build().perform();

    } catch (Exception e) {
      SampleCommonMethods.TestCasePrint(comment + " IS NOT THERE ", "true", String.valueOf(Value1),
          String.valueOf(e));
    }
  }

  public static void webelementUi(WebElement element, String clour, String text, String comment) {
    boolean Value1 = false;
    try {
      boolean value1 = element.isDisplayed();
      SampleCommonMethods.TestCasePrint(comment + " IS DISPLAYED", "true", String.valueOf(value1));
      boolean value2 = element.isEnabled();
      SampleCommonMethods.TestCasePrint(comment + " IS ENABLED", "true", String.valueOf(value2));
      String value = element.getText();
      SampleCommonMethods.TestCasePrint(comment + " TEXT", text, String.valueOf(value));
      String value3 = element.getAttribute(clour);
      SampleCommonMethods.TestCasePrint(comment + " CCLOUR", clour, String.valueOf(value3));

    } catch (Exception e) {
      SampleCommonMethods.TestCasePrint(comment + " IS NOT THERE ", "true", String.valueOf(Value1),
          String.valueOf(e));
    }
  }

  public static void tableDataCount(WebElement table, String count, WebElement nextPageButton,
      String comment) {
    boolean Value1 = false;
    try {
      boolean value1 = table.isDisplayed();
      SampleCommonMethods.TestCasePrint(comment + " IS DISPLAYED", "true", String.valueOf(value1));
      boolean value2 = table.isEnabled();
      SampleCommonMethods.TestCasePrint(comment + " IS ENABLED", "true", String.valueOf(value2));
      boolean hasNextPage = true;
      while (hasNextPage) {
        // Extract the table data for the current page
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
        @SuppressWarnings("unused")
        int columnCount = columns.size();
        // Count the table data for the current page
        @SuppressWarnings("unused")
        int dataCount = 0;
        for (WebElement row : rows) {
          List<WebElement> cells = row.findElements(By.tagName("td"));
          for (WebElement cell : cells) {
            @SuppressWarnings("unused")
            String cellText = cell.getText();
            // Do something with the cell text, e.g. count it
            dataCount++;
          }
        }
        // Check if there is a next page
        hasNextPage = nextPageButton.isEnabled();
        // Navigate to the next page if there is one
        if (hasNextPage) {
          nextPageButton.click();
        }
        if (count.equals(rowCount)) {
          SampleCommonMethods.TestCasePrint("EXPECTED DATA COUNT AVILABLE IN " + comment, count,
              String.valueOf(rowCount));
        } else {
          SampleCommonMethods.TestCasePrint("EXPECTED DATA COUNT NOT AVILABLE IN " + comment, count,
              String.valueOf(rowCount));
        }
      }
    } catch (Exception e) {
      SampleCommonMethods.TestCasePrint(comment + " IS NOT THERE ", "true", String.valueOf(Value1),
          String.valueOf(e));
    }
  }

  // search particular data from table data and click button
  // @table :- which table data should be search and find
  // @searchQuery:- search data
  // @button :- which button should be click in row
  // @nextPageButton:- next page button
  public static void perticularDataSearch(WebElement table, String searchQuery, WebElement button,
      WebElement nextPageButton) {
    // Identify the web element that contains the table data
    // WebElement table = driver.findElement(By.id("table-id"));

    // Define the search query
    // String searchQuery = "search term";

    // Check if the table data spans across multiple pages
    boolean hasNextPage = true;
    while (hasNextPage) {
      // Search for the particular data on the current page
      boolean foundData = false;
      List<WebElement> rows = table.findElements(By.tagName("tr"));
      for (WebElement row : rows) {
        List<WebElement> cells = row.findElements(By.tagName("td"));
        for (WebElement cell : cells) {
          String cellText = cell.getText();
          if (cellText.contains(searchQuery)) {
            // Take the necessary action if the data is found
            foundData = true;
            // Example action: Click a button in the same row as the data
            // WebElement button = row.findElement(By.tagName("button"));
            button.click();
            break;
          }
        }
        if (foundData) {
          // SampleCommonMethods.TestCasePrint("EXPECTED DATA FOUND IN DATA TABLE ");
          break;
        }
      }
      if (foundData) {
        break;
      }
      // Check if there is a next page
      hasNextPage = nextPageButton.isEnabled();
      // Navigate to the next page if there is one
      if (hasNextPage) {
        nextPageButton.click();
      }
      SampleCommonMethods.TestCasePrint("EXPECTED DATA FOUND IN DATA TABLE ");
    }
  }
}
