package org.example;

public class frontend_DataHack_Tests {
    package frontend;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

    public class DataHackUITests extends BaseTest {

        @BeforeMethod
        public void setup() {
            initBrowser();
            driver.get(prop.getProperty("baseUrl"));
        }

        @Test
        public void verifyPageTitle() {
            Assert.assertTrue(driver.getTitle().contains("DataHack"), "Title validation failed");
        }

        @Test
        public void verifyHeroText() {
            WebElement hero = driver.findElement(By.cssSelector("h2"));
            Assert.assertTrue(hero.getText().toLowerCase().contains("compete"), "Hero text mismatch");
        }

        @Test
        public void verifyTestNowNavigation() {
            WebElement btn = driver.findElement(By.xpath("//a[contains(text(),'Test Now')]"));
            btn.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("data"), "Navigation failed");
        }

        @AfterMethod
        public void closeBrowser() {
            tearDown();
        }
    }

}
