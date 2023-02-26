package base;

import util.CommonAction;

import static base.BasePageLocator.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    public BasePage openPage() {
        CommonAction.configureWebDriver();
        open("http://orm13.labma.ru/orm/");
        return this;
    }

    public BasePage authorization() {
        $(LOGIN_FIELD).shouldBe(visible).setValue("deniss110");
        $(PASSWORD_FIELD).shouldBe(visible).setValue("deniss110");
        $(LOGIN_BTN).click();
        return this;
    }

    public BasePage checkAuthorizationSuccess(){
        $(REGISTRATION_RISK).shouldBe(visible);
        return this;
    }

}
