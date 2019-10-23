package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.StartPage.btnAboutLoan;
import static com.worlbank.elementPages.StartPage.btnStartApplication;

public final class ActionsOnPageStart {

    private ActionsOnPageStart() {
    }

    @Step("Open about loans")
    public static void openAboutLoans() {
        btnAboutLoan
                .shouldBe(visible)
                .click();
    }

    @Step("Click button Start Application")
    public static void startApplication() {
        btnStartApplication
                .shouldBe(visible)
                .click();
    }
}
