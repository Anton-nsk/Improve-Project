package com.worlbank.actions;

import io.qameta.allure.Step;

import java.io.IOException;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.AboutLoanPage.textInPage1;
import static com.worlbank.elementPages.AboutLoanPage.textInPage2;
import static com.worlbank.elementPages.GlobalElementsPage.btnContinue;
import static com.worlbank.globalActions.CompareTextsTool.compareTexts;
import static com.worlbank.globalActions.GlobalBrowserActions.goContinueOrNot;

public final class ActionsOnPageAboutLoan {

    private ActionsOnPageAboutLoan() {
    }

    @Step("Check text is correctly")
    public static void checkTextCorrectness() throws IOException {
        textInPage1.shouldBe(visible);
        textInPage2.shouldBe(visible);
        compareTexts(textInPage1, "src/test/resources/text.txt");
        compareTexts(textInPage2, "src/test/resources/text2.txt");
    }

    @Step("Click 'Start Application' in screen 'About Loan'")
    public static void clickStartApplication() {
        goContinueOrNot();
        btnContinue.click();
        goContinueOrNot();
    }
}
