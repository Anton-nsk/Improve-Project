package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.GlobalElementsPage.btnDone;
import static com.worlbank.elementPages.GlobalElementsPage.dataPicker;
import static com.worlbank.elementPages.LoanPurposePage.getLoanPurposeByText;
import static com.worlbank.globalActions.CompareDateTool.compareDateInFieldAndNeededDate;
import static com.worlbank.globalActions.DatePickerTool.chooseDay;
import static com.worlbank.globalActions.GlobalBrowserActions.pausedAfterWorkInModalWindow;

public final class ActionsOnPageLoanPurpose {

    private ActionsOnPageLoanPurpose() {
    }

    @Step("Select loan purpose")
    public static void selectLoanPurpose(String selectPurpose) {
        getLoanPurposeByText(selectPurpose)
                .shouldBe(visible)
                .click();
    }

    @Step("Select date planting")
    public static void selectDatePlanting(String day, String month, String year) {
        dataPicker
                .shouldBe(visible)
                .click();
        chooseDay(day, month, year);
        btnDone
                .shouldBe(visible)
                .click();
        compareDateInFieldAndNeededDate(dataPicker, day, month, year);
        pausedAfterWorkInModalWindow();
    }
}
