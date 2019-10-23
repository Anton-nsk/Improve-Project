package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.OtherLoansPage.btnHowManyLoans;

public final class ActionsOnPageOtherLoans {

    private ActionsOnPageOtherLoans() {
    }

    @Step("Select numbers of loans")
    public static void selectHowManyLoans(String loans) {
        btnHowManyLoans(loans)
                .shouldBe(visible)
                .click();
    }
}
