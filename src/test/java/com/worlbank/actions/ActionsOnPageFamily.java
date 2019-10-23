package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.FamilyPage.dropdownNumberOfDependents;
import static com.worlbank.elementPages.FamilyPage.fieldFatherName;
import static com.worlbank.elementPages.FamilyPage.fieldMotherName;
import static com.worlbank.elementPages.FamilyPage.valueThreeInDropdown;
import static com.worlbank.globalActions.GlobalBrowserActions.pausedAfterWorkInModalWindow;

public final class ActionsOnPageFamily {

    private ActionsOnPageFamily() {
    }

    @Step("Input Father Name")
    public static void inputFatherName(String fatherName) {
        fieldFatherName
                .shouldBe(visible)
                .sendKeys(fatherName);
    }

    @Step("Input Mother Name")
    public static void inputMotherName(String motherName) {
        fieldMotherName
                .shouldBe(visible)
                .sendKeys(motherName);
    }

    @Step("Select number of dependents")
    public static void selectNumberOfDependents() {
        dropdownNumberOfDependents
                .shouldBe(visible)
                .click();
        valueThreeInDropdown
                .shouldBe(visible)
                .click();
        pausedAfterWorkInModalWindow();
    }
}
