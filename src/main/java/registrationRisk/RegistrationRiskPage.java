package registrationRisk;

import base.BasePage;
import base.BasePageLocator;
import io.qameta.allure.Step;

import java.util.Timer;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static registrationRisk.RegistrationRiskPageLocator.*;


public class RegistrationRiskPage extends BasePage {

    @Step("Переход к сеансу Регистрация операционного риска")
    public RegistrationRiskPage openRegistrationRiskPage() {
        $(BasePageLocator.REGISTRATION_RISK).shouldBe(visible).click();
        return this;
    }

    @Step("Заполнение поля Дата реализации события")
    public RegistrationRiskPage fieldDateRealization() throws InterruptedException {
        switchTo().frame($(FRAME1));
        switchTo().frame($(FRAME2));
        switchTo().frame($(FRAME3));
        $(DATE_REALIZATION).shouldBe(visible).setValue("23022023");

        switchTo().parentFrame();
        return this;
    }

}
