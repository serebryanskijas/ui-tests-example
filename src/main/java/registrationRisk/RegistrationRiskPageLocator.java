package registrationRisk;

import org.openqa.selenium.By;

public class RegistrationRiskPageLocator {

    public static final By FRAME1 = By.xpath(
            "//iframe[@src='/orm/bpm-flowcore-workspace/CreateProcessObjectInit.xhtml?objectId=operationalRiskEvent&vars=type:REGISTRATION']");

    public static final By FRAME2 = By.xpath(
            "//form[@action=\"/orm/bpm-flowcore-workspace/CreateProcessObject.xhtml\"]//iframe[@onload=\"workspaceJS.loadIframe(this)\"]");

    public static final By FRAME3 = By.xpath("//iframe[@id=\"bpmFlowcoreProcedureGenericTaskCenterLayoutPaneIframe\"]");

    public static final By DATE_REALIZATION = By.xpath(
            "//label[text()=\"Дата реализации события\"]/../..//input[@inputmode=\"numeric\"]");

    public static final By DATE_DETECTION = By.xpath(
            "//label[text()=\"Дата выявления события\"]/../..//input[@inputmode=\"numeric\"]");

    public static final By GUILTY_PERSON_LIST = By.xpath(
            "//label[text()=\"Лицо, виновное в событии\"]/../..//span[@class=\"ui-icon ui-icon-triangle-1-s\"]");

    public static final By GUILTY_PERSON = By.xpath(
            "//label[text()=\"Виновное лицо отсутствует\"]/..//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"]");

    public static final By DEPARTMENT_LIST = By.xpath("//div[@class=\"p-p-2\"]");

    public static final By DEPARTMENT = By.xpath(
            "//span[text()=\"Подразделение выявить невозможно\"]/..//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"]");

    public static final By TYPE_EVENT_LIST = By.xpath(
            "//label[text()=\"Тип события\"]/../..//label[@class=\"ui-selectonemenu-label ui-inputfield ui-corner-all\"]");

    public static final By TYPE_EVENT = By.xpath("//li[text()=\"Нарушение трудового законодательства\"]");

    public static final By DESCRIBE_EVENT = By.xpath(
            "//label[text()=\"Описание события\"]/../..//textarea[@role=\"textbox\"]");

    public static final By MEASURE_EVENT = By.xpath(
            "//label[text()=\"Меры, направленные на уменьшение негативного влияния\"]/../..//textarea[@role=\"textbox\"]");

    public static final By BUSINESS_PROCESS_EVENT_LIST = By.xpath(
            "//label[text()=\"Бизнес-процесс\"]/../..//span[@class=\"ui-icon ui-icon-triangle-1-s\"]");

    public static final By BUSINESS_PROCESS_EVENT = By.xpath(
            "//label[text()=\"Кадровое обеспечение\"]/..//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"]");

    public static final By BUTTON_SAVE = By.xpath("//span[text()=\"Сохранить\"]");

}
