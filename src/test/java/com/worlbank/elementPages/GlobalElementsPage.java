package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public final class GlobalElementsPage {

    public static final SelenideElement btnContinue = $x("//button[contains(@class, 'zenoo-continue-button')]");
    public static final SelenideElement reloadScreen = $("body");
    public static final SelenideElement screenChanger = $x("//div[@class = 'zenoo-screen-changer_former']");
    public static final SelenideElement titleModalWindow = $x("//div[contains(@class, 'modal_window')]");
    public static final SelenideElement dataPicker = $x("//div[contains(@class, 'zenoo-date-picker')]/input");
    public static final SelenideElement btnDone = $x("//a[text() = 'done']");

    private GlobalElementsPage() {
    }

    public static SelenideElement btnYesOrNot(String value) {
        return $x("//div[@class = 'zenoo-tabs_tab'][text()= '" + value + "']");
    }
}
