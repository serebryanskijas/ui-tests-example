package registrationRisk;

import base.BasePage;
import base.BasePageLocator;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static registrationRisk.RegistrationRiskPageLocator.*;

public class RegistrationRiskPage extends BasePage {

    public RegistrationRiskPage toFrame() {
        switchTo().frame($(FRAME1));
        switchTo().frame($(FRAME2));
        switchTo().frame($(FRAME3));
        return this;
    }

    public RegistrationRiskPage backFromFrame() {
        switchTo().parentFrame();
        switchTo().parentFrame();
        switchTo().parentFrame();
        return this;
    }

    @Step("Переход к сеансу Регистрация операционного риска")
    public RegistrationRiskPage openRegistrationRiskPage() {
        $(BasePageLocator.REGISTRATION_RISK).shouldBe(visible).click();
        return this;
    }

    @Step("Заполнение поля Дата реализации события")
    public RegistrationRiskPage fieldDateRealization() throws InterruptedException {
        toFrame();
        $(DATE_REALIZATION).shouldBe(visible).setValue("23022023");
        backFromFrame();
        return this;
    }

    @Step("Заполнение поля Дата выявления события")
    public RegistrationRiskPage fieldDateDetection() throws InterruptedException {
        toFrame();
        $(DATE_DETECTION).shouldBe(visible).setValue("23022023");
        backFromFrame();
        return this;
    }

    @Step("Заполнение поля Лицо, виновное в событии")
    public RegistrationRiskPage fieldGuiltyPerson() throws InterruptedException {
        toFrame();
        $(GUILTY_PERSON_LIST).shouldBe(visible).click();
        $(GUILTY_PERSON).shouldBe(visible).click();
        backFromFrame();
        return this;
    }

    @Step("Заполнение поля Подразделения, в которых произошло событие")
    public RegistrationRiskPage fieldDepartment() throws InterruptedException {
        toFrame();
        $(DEPARTMENT_LIST).shouldBe(visible).click();
        $(DEPARTMENT).shouldBe(visible).click();
        backFromFrame();
        return this;
    }

    @Step("Заполнение поля Тип события")
    public RegistrationRiskPage fieldTypeEvent() throws InterruptedException {
        toFrame();
        $(TYPE_EVENT_LIST).shouldBe(visible).click();
        $(TYPE_EVENT).shouldBe(visible).click();
        backFromFrame();
        return this;
    }

    @Step("Заполнение поля Описание события")
    public RegistrationRiskPage fieldDescrIbeEvent() throws InterruptedException {
        toFrame();
        $(DESCRIBE_EVENT).setValue("Пример описания события Автотест");
        backFromFrame();
        return this;
    }

    @Step("Заполнение поля Меры, направленные на уменьшение негативного влияния")
    public RegistrationRiskPage fieldMeasureEvent() throws InterruptedException {
        toFrame();
        $(MEASURE_EVENT).setValue("Пример описания мер события Автотест");
        backFromFrame();
        return this;
    }

    @Step("Заполнение поля Бизнес-процесс")
    public RegistrationRiskPage fieldBusinessProcessEvent() throws InterruptedException {
        toFrame();
        $(BUSINESS_PROCESS_EVENT_LIST).shouldBe(visible).click();
        $(BUSINESS_PROCESS_EVENT).shouldBe(visible).click();
        backFromFrame();
        return this;
    }

    @Step("Сохранение события риска")
    public RegistrationRiskPage saveEventRisk() throws InterruptedException {
        toFrame();
        $(BUTTON_SAVE).shouldBe(visible).click();
        backFromFrame();
        return this;
    }

    @Step("Успешное схранение события риска")
    public RegistrationRiskPage succeedSaveEventRisk() throws InterruptedException {
        toFrame();
        $(byText("Событие риска успешно сохранено")).shouldBe(visible);
        backFromFrame();
        return this;
    }

    @Step("Негативное сохранение события риска без заполненных обязательных полей")
    public RegistrationRiskPage failSaveEventRisk() throws InterruptedException {
        toFrame();
        $(byText("Не указано описание события")).shouldBe(visible);
        $(byText("Не указана дата реализации события")).shouldBe(visible);
        $(byText("Не указана дата выявления события")).shouldBe(visible);
        $(byText("Не указан бизнес-процесс")).shouldBe(visible);
        $(byText("Не указаны меры, направленные на уменьшение негативного влияния")).shouldBe(visible);
        $(byText("Не указано лицо, виновное в событии")).shouldBe(visible);
        $(byText("Не указаны подразделения, в которых произошло событие")).shouldBe(visible);
        backFromFrame();
        return this;
    }

}
