package base;

import org.openqa.selenium.By;

public class BasePageLocator {
    public static final By LOGIN_FIELD = By.xpath("//input[@id=\"loginForm:username\"]");
    public static final By PASSWORD_FIELD = By.xpath("//input[@id=\"loginForm:password\"]");
    public static final By LOGIN_BTN = By.xpath("//span[text()=\"Вход\"]");
    public static final By REGISTRATION_RISK = By.xpath("//span[text()=\"Регистрация события риска\"]");
}
