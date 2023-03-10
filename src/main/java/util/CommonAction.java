package util;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonAction {

    public static void configureWebDriver() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-debugging-port=9222");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(driver);
    }

}
