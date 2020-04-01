package ru.deliveryclub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriver {

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/moscow");
        String title = driver.getTitle();
        Assert.assertEquals("Доставка еды из ресторанов Москвы за 15-30 минут! Delivery Club", title);

    }
    @Test
    public void secondTest() {
        driver.get("https://www.delivery-club.ru/moscow");
        WebElement adress = driver.findElementByClassName("address-input__wrap");
        driver.findElementByXPath("//button[@class='header-login-button']").click();
        driver.findElementByXPath("//input[@class='input--def filled']").sendKeys("9204171240");

    }
}
