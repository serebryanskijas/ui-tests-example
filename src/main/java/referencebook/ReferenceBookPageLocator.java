package referencebook;

import org.openqa.selenium.By;

public class ReferenceBookPageLocator {

    public static final By REFERENCE_BOOKS_LIST = By.xpath("//span[text()=\"Регистрация события риска\"]");
    public static final By REFERENCE_BOOK = By.xpath("//span[text()=\"Информационные системы\"]");
    public static final By CREATE_BTN = By.xpath("//span[text()=\"Создать\"]");
    public static final By REFERENCE_BOOK_FULL_NAME = By.xpath("//label[text()=\"Полное наименование\"]/../..//input");
    public static final By SAVE_BTN = By.xpath("//form[@id=\"objectEditMainCommand\"]//span[text()=\"Сохранить\"]");

}
