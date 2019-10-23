package com.worlbank.globalActions;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.worlbank.elementPages.GlobalElementsPage.btnContinue;
import static com.worlbank.elementPages.GlobalElementsPage.btnYesOrNot;
import static com.worlbank.elementPages.GlobalElementsPage.reloadScreen;
import static com.worlbank.elementPages.GlobalElementsPage.screenChanger;

public class GlobalBrowserActions {

    @Step("Paused after worked in modal window")
    public static void pausedAfterWorkInModalWindow() {
        while (reloadScreen.has(cssClass("no scroll"))) {
            sleep(100);
        }
    }

    @Step("Checking ready to continue")
    public static void goContinueOrNot() {
        pausedAfterWorkInModalWindow();
        int hasCorrectSize;
        do {
            sleep(100);
            hasCorrectSize = screenChanger.$$x("*").size();
        } while (hasCorrectSize != 0);
    }

    @Step("Click button 'Yes' or 'No")
    public static void clickButtonYesOrNo(String nameButton) {
        btnYesOrNot(nameButton)
                .shouldBe(visible)
                .click();
    }

    @Step("Open URL with project")
    public void open(String url) {
        Selenide.open(url);
    }

    @Step("Click button 'Continue'")
    public void clickBtnContinue() {
        boolean isDisabled = btnContinue.has(cssClass("disabled"));
        if (isDisabled == true) {
            goContinueOrNot();
            btnContinue.click();
        }
        btnContinue.click();
        goContinueOrNot();
    }
}
