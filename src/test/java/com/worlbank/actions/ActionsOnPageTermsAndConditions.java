package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.TermsAndConditionsPage.btnIAgree;
import static com.worlbank.elementPages.TermsAndConditionsPage.titlePage;
import static com.worlbank.globalActions.GlobalBrowserActions.goContinueOrNot;

public final class ActionsOnPageTermsAndConditions {

    private ActionsOnPageTermsAndConditions() {
    }

    @Step("The 'Terms and conditions' screens are open")
    public static void checkPageOpened() {
        titlePage.shouldBe(visible);
    }

    @Step("Click button 'I Agree'")
    public static void clickBtnIAgree() {
        goContinueOrNot();
        btnIAgree.click();
        goContinueOrNot();
    }
}
