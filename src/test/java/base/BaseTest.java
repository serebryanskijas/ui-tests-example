package base;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import referencebook.ReferenceBookPage;
import registrationRisk.RegistrationRiskPage;

public class BaseTest {

    protected BasePage basePage = new BasePage();

    public ReferenceBookPage referenceBookPage = new ReferenceBookPage();

    public RegistrationRiskPage registrationRiskPage = new RegistrationRiskPage();

    @AfterEach
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

}
