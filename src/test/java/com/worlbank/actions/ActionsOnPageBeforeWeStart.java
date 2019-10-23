package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.BeforeWeStartPage.getCheckbox;
import static com.worlbank.elementPages.GlobalElementsPage.btnContinue;

public final class ActionsOnPageBeforeWeStart {

    private ActionsOnPageBeforeWeStart() {
    }

    @Step("Checking checkbox")
    public static void checkCheckBox(String nameCheckbox) {
        getCheckbox(nameCheckbox)
                .shouldBe(visible)
                .click();
    }

    @Step("Check button visibility: button disable")
    public static void checkBtnStatus() {
        btnContinue.shouldHave(cssClass("disabled"));
    }
}
