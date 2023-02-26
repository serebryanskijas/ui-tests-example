package registrationrisk;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegistrationRiskTest extends BaseTest {

    @Test
    @DisplayName("Successful authorization test")
    void authTest() {
        basePage.openPage()
                .authorization()
                .checkAuthorizationSuccess();

    }

    @Test
    @DisplayName("Successful save risk with required fields test")
    void saveRequiredFieldRiskTest() throws InterruptedException {
        basePage.openPage().authorization();
        registrationRiskPage.openRegistrationRiskPage().
                fieldDateRealization();
    }

}