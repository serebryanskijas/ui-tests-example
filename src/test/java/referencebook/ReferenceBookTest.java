package referencebook;

import base.BaseTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReferenceBookTest extends BaseTest {

    @Test
    @Disabled
    @DisplayName("Тест на успешную авторизацию")
    void authTest() {
        basePage.openPage()
                .authorization()
                .checkAuthorizationSuccess();
    }

    @Test
    @Disabled
    @DisplayName("Тест на успешное создание нового справочника")
    void createNewReferenceBookTest() {
        basePage.openPage()
                .authorization();
        referenceBookPage.openReferenceBook()
                .createNewReferenceBook()
                .fillReferenceBookName()
                .pressSaveBtn()
                .checkSuccessSavingMessage();
    }

    @Test
    @Disabled
    @DisplayName("Тест на неуспешное создание нового справочника")
    void createNewReferenceBookFailedTest() {
        basePage.openPage()
                .authorization();
        referenceBookPage.openReferenceBook()
                .createNewReferenceBook()
                .pressSaveBtn()
                .checkSuccessSavingMessage();
    }



}
