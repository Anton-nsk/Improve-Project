package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.worlbank.elementPages.FinalPages.processingScreenSpiner;
import static com.worlbank.elementPages.FinalPages.textInFinalScreen;
import static com.worlbank.globalActions.GlobalBrowserActions.goContinueOrNot;

public final class ActionsOnFinalPages {

    private ActionsOnFinalPages() {
    }

    @Step("Wait if spiner visible")
    public static void processingSpinerWait() {
        processingScreenSpiner.shouldBe(visible);
        while (processingScreenSpiner.isDisplayed()) {
            sleep(100);
        }
    }

    @Step("Check visible final screen with compliments")
    public static void finalScreenVisible() {
        goContinueOrNot();
        textInFinalScreen.shouldBe(visible);
    }
}
