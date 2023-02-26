package referencebook;

import base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static referencebook.ReferenceBookPageLocator.*;

public class ReferenceBookPage extends BasePage {

    @Step("Открыть справочник")
    public ReferenceBookPage openReferenceBook(){
        $(REFERENCE_BOOKS_LIST).shouldBe(visible).click();
        $(REFERENCE_BOOK).shouldBe(visible).click();
        return this;
    }

    @Step("Создать новый справочник")
    public ReferenceBookPage createNewReferenceBook() {
        $(CREATE_BTN).shouldBe(visible).click();
        return this;
    }

    @Step("Зполнить полное имя справочника")
    public ReferenceBookPage fillReferenceBookName() {
        $(REFERENCE_BOOK_FULL_NAME).shouldBe(visible).setValue("Тестовое название");
        return this;
    }

    @Step("Нажать кнопку 'Сохранить'")
    public ReferenceBookPage pressSaveBtn() {
        $(SAVE_BTN).click();
        return this;
    }

    @Step("Проверить сообщение об успешном сохранении")
    public ReferenceBookPage checkSuccessSavingMessage() {
        $(byText("Объект успешно сохранен")).shouldBe(visible);
        return this;
    }
}