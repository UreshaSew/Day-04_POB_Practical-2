package com.xyz.fashion.test;

import com.xyz.fashion.page.HomePage;
import com.xyz.fashion.util.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {
    @Test
    public void tc_01(){
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickSearch("TOKYO TALKIES");

    }
}
