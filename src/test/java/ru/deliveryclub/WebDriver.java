package ru.deliveryclub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriver {
    public ChromeDriver driver;

    public void checkBox(String name){

        String fpath = "//div[@class=\"popup--def__content\"]/ul/li[1]/label/following::span['%s']";
        if(!driver.findElementByXPath(String.format(fpath, name)).isSelected())
        driver.findElementByXPath(String.format(fpath,name)).click();
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Администратор\\IdeaProjects\\Delivery\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        System.out.println("start");
    }
    @After
    public void finStep() {
        driver.quit();
        System.out.println("finish");
    }
}
