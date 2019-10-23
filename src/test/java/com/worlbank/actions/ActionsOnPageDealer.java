package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.DealerPage.fieldAdvanceAmount;

public final class ActionsOnPageDealer {

    private ActionsOnPageDealer() {
    }

    @Step("Input information size amount dealer")
    public static void inputSizeAmount(String sizeAmount) {
        fieldAdvanceAmount
                .shouldBe(visible)
                .sendKeys(sizeAmount);
    }
}
