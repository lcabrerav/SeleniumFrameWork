package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.TestLogger;


import java.io.IOException;

public class TestSearch extends CommonAPI {

    @Test
    public void searchData()throws IOException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
    @Test
    public void TodaysDealFunction() throws IOException{
        WebElement element = driver.findElement(By.className("nav-a"));
        element.click();
    }





}
