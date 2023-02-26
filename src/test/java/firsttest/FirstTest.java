package firsttest;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import util.CommonAction;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    @AfterEach
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

    @Test
    @Step("Пройти авторизацию")
    @Disabled
    public void authorizationTest() throws InterruptedException {
        CommonAction.configureWebDriver();
        open("http://terra.labma.ru:8880/orm/");
        $(By.xpath("//input[@id=\"loginForm:username\"]")).shouldBe(visible).setValue("deniss");
        $(By.xpath("//input[@id=\"loginForm:password\"]")).shouldBe(visible).setValue("deniss");
        $(By.xpath("//span[text()=\"Вход\"]")).click();
        $(By.xpath("//span[text()=\"Задачи\"]")).shouldBe(visible);
    }

    @Test
    @Disabled
    public void createNewReferenceBookTest() {
        CommonAction.configureWebDriver();
        open("http://terra.labma.ru:8880/orm/");
        $(By.xpath("//input[@id=\"loginForm:username\"]")).shouldBe(visible).setValue("deniss");
        $(By.xpath("//input[@id=\"loginForm:password\"]")).shouldBe(visible).setValue("deniss");
        $(By.xpath("//span[text()=\"Вход\"]")).click();
        $(By.xpath("//span[text()=\"Справочники\"]")).shouldBe(visible).click();
        $(By.xpath("//span[text()=\"Информационные системы\"]")).shouldBe(visible).click();
        $(By.xpath("//span[text()=\"Создать\"]")).shouldBe(visible).click();
        $(By.xpath("//label[text()=\"Полное наименование\"]/../..//input")).shouldBe(visible).setValue("Тестовое название");
        $(By.xpath("//form[@id=\"objectEditMainCommand\"]//span[text()=\"Сохранить\"]")).click();
        $(byText("Объект успешно сохранен")).shouldBe(visible);
    }

    @Test
    @Disabled
    public void createNewReferenceBookFailedTest() throws InterruptedException {
        CommonAction.configureWebDriver();
        open("http://terra.labma.ru:8880/orm/");
        $(By.xpath("//input[@id=\"loginForm:username\"]")).shouldBe(visible).setValue("deniss");
        $(By.xpath("//input[@id=\"loginForm:password\"]")).shouldBe(visible).setValue("deniss");
        $(By.xpath("//span[text()=\"Вход\"]")).click();
        $(By.xpath("//span[text()=\"Справочники\"]")).shouldBe(visible).click();
        $(By.xpath("//span[text()=\"Информационные системы\"]")).shouldBe(visible).click();
        $(By.xpath("//span[text()=\"Создать\"]")).shouldBe(visible).click();
        $(By.xpath("//form[@id=\"objectEditMainCommand\"]//span[text()=\"Сохранить\"]")).click();
        $(byText("Объект успешно сохранен")).shouldBe(visible);
    }
}
