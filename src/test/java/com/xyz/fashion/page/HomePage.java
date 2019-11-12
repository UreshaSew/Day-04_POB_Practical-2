package com.xyz.fashion.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath  = "//*[@id=\"noo-site\"]/header/div[2]/div/a")
    WebElement btnsearch;



    public void clickSearch(String key){
        btnsearch.click();
        btnsearch.sendKeys(key);

    }


}
