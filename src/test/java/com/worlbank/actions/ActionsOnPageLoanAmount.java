package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.LoanAmountPage.checkboxMobileMoney;
import static com.worlbank.elementPages.LoanAmountPage.checkboxMobileMoneyStatus;
import static com.worlbank.elementPages.LoanAmountPage.fieldLoanAmount;

public final class ActionsOnPageLoanAmount {

    private ActionsOnPageLoanAmount() {
    }

    @Step("Input amount loan")
    public static void inputAmountLoans(String amount) {
        fieldLoanAmount
                .shouldBe(visible)
                .setValue(amount);
    }

    @Step("Check checkbox 'I would like to use Mobile Money'")
    public static void checkCheckboxMobileMoney() {
        checkboxMobileMoney
                .shouldBe(visible)
                .click();
        checkboxMobileMoneyStatus.shouldHave(cssClass("checked"));
    }
}
