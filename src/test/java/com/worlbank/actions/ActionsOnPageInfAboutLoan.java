package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.GlobalElementsPage.titleModalWindow;
import static com.worlbank.elementPages.InformationAboutLoanPage.dropdownBankName;
import static com.worlbank.elementPages.InformationAboutLoanPage.fieldLoanAmount;
import static com.worlbank.elementPages.InformationAboutLoanPage.valueBankInDropdown;
import static com.worlbank.globalActions.GlobalBrowserActions.pausedAfterWorkInModalWindow;

public final class ActionsOnPageInfAboutLoan {

    private ActionsOnPageInfAboutLoan() {
    }

    @Step("Input information about other loans")
    public static void inputInformation(String loanNumber, String loanAmount) {
        dropdownBankName(loanNumber)
                .shouldBe(visible)
                .click();
        titleModalWindow.shouldBe(visible);
        valueBankInDropdown
                .shouldBe(visible)
                .click();
        pausedAfterWorkInModalWindow();
        fieldLoanAmount(loanNumber).sendKeys(loanAmount);
    }
}
