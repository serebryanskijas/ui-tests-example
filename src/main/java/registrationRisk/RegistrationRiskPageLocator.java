package registrationRisk;

import org.openqa.selenium.By;

public class RegistrationRiskPageLocator {
    public static final By FRAME1 = By.xpath("//iframe[@src='/orm/bpm-flowcore-workspace/CreateProcessObjectInit.xhtml?objectId=operationalRiskEvent&vars=type:REGISTRATION']");
    public static final By FRAME2 = By.xpath("//form[@action=\"/orm/bpm-flowcore-workspace/CreateProcessObject.xhtml\"]//iframe[@onload=\"workspaceJS.loadIframe(this)\"]");
    public static final By FRAME3 = By.xpath("//iframe[@id=\"bpmFlowcoreProcedureGenericTaskCenterLayoutPaneIframe\"]");
    public static final By DATE_REALIZATION = By.xpath(
            "//label[text()=\"Дата реализации события\"]/../..//input[@inputmode=\"numeric\"]");

    public static final By DATE_DETECTION = By.xpath(
            "//label[text()=\"Дата выявления события\"]/../..//input[@class=\"ui-inputfield ui-widget ui-state-default ui-corner-all\"]");

    public static final By GUILTY_PERSON_LIST = By.xpath(
            "//label[text()=\"Лицо, виновное в событии\"]/../..//ul[@class=\"ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all\"]");

    public static final By GUILTY_PERSON = By.xpath(
            "//label[text()=\"Виновное лицо отсутствует\"]/..//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"]");

    public static final By DEPARTMENT_LIST = By.xpath("//div[@class=\"p-p-2\"]");

    public static final By DEPARTMENT = By.xpath("//span[text()=\"Подразделение выявить невозможно\"]/..//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"]");

}
