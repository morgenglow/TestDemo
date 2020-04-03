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
        driver.findElementByXPath("//*[@id=\"content\"]/div/div[3]/div[1]/div[2]/button").click();
        checkBox("2");
    }

    @Test
    public void thirdTest() throws InterruptedException {
        driver.manage().window().fullscreen();
        driver.get("https://www.delivery-club.ru/moscow");
        driver.findElementByXPath("//input[@placeholder=\"Укажите адрес доставки\"]").sendKeys("Москва, ул. Мироновская, 25");
        String address = driver.findElementByXPath("//div[@class=\"address-suggest-item__container address-suggest-item__container_at-header\"][1]").getText();
        Assert.assertEquals("Москва, Мироновская улица, 25 ", address);
        Thread.sleep(600000L);
        driver.findElementByXPath("//div[@class=\"address-suggest-item__container address-suggest-item__container_at-header\"][1]").click();
        driver.findElementByXPath("//span[@class='delivery-time-button__status']").click();
        driver.findElementByXPath("//div[@class='delivery-time-form__field-name   Hover' and text()=\"Указать время\"]").click();
        driver.findElementByXPath("//li[@class=\'dropdown__options-el is-selected\']").click();
        driver.findElementByXPath("//li[contains(.,\"00:00\")]").click();

    }

    @Test
    public void forthTest() {
        driver.get("https://www.delivery-club.ru/moscow");
        WebElement adress = driver.findElementByClassName("address-input__wrap");
        driver.findElementByXPath("//button[@class='header-login-button']").click();
        driver.findElementByXPath("//input[@class='input--def filled']").sendKeys("9204171240");

    }
}
