package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.GlobalElementsPage.btnDone;
import static com.worlbank.elementPages.GlobalElementsPage.dataPicker;
import static com.worlbank.elementPages.GlobalElementsPage.titleModalWindow;
import static com.worlbank.elementPages.PersonalDetailsPage.dropdownTitleAndMaritalStatus;
import static com.worlbank.elementPages.PersonalDetailsPage.fieldDropdownNrcPrefix;
import static com.worlbank.elementPages.PersonalDetailsPage.fieldFirstName;
import static com.worlbank.elementPages.PersonalDetailsPage.fieldLastName;
import static com.worlbank.elementPages.PersonalDetailsPage.fieldMiddleName;
import static com.worlbank.elementPages.PersonalDetailsPage.fieldNrcNumber;
import static com.worlbank.elementPages.PersonalDetailsPage.valueGenderInDropdown;
import static com.worlbank.elementPages.PersonalDetailsPage.valueMaritalStatus;
import static com.worlbank.globalActions.CompareDateTool.compareDateInFieldAndNeededDate;
import static com.worlbank.globalActions.DatePickerTool.chooseDay;
import static com.worlbank.globalActions.GlobalBrowserActions.pausedAfterWorkInModalWindow;

public final class ActionsOnPersonalDetailsPage {

    private ActionsOnPersonalDetailsPage() {
    }

    @Step("Select 'Gender'")
    public static void selectGender() {
        dropdownTitleAndMaritalStatus
                .shouldBe(visible)
                .click();
        titleModalWindow.shouldBe(visible);
        valueGenderInDropdown
                .shouldBe(visible)
                .click();
        pausedAfterWorkInModalWindow();
    }

    @Step("Input First Name")
    public static void inputFirstName(String firstNameValue) {
        fieldFirstName
                .shouldBe(visible)
                .sendKeys(firstNameValue);
    }

    @Step("Input middle Name")
    public static void inputMiddleName(String middleNameValue) {
        fieldMiddleName
                .shouldBe(visible)
                .sendKeys(middleNameValue);
    }

    @Step("Input Last Name")
    public static void inputLastName(String lastNameValue) {
        fieldLastName
                .shouldBe(visible)
                .sendKeys(lastNameValue);
    }

    @Step("Input NRC prefix")
    public static void inputNrcPrefix(String nrcPrefix) {
        fieldDropdownNrcPrefix
                .shouldBe(visible)
                .setValue(nrcPrefix);
    }

    @Step("Input NRC Number")
    public static void inputNrc(String nrc) {
        fieldNrcNumber
                .shouldBe(visible)
                .sendKeys(nrc);
    }

    @Step("Marital status select")
    public static void selectMaritalStatus() {
        dropdownTitleAndMaritalStatus
                .shouldBe(visible)
                .click();
        titleModalWindow.shouldBe(visible);
        valueMaritalStatus
                .shouldBe(visible)
                .click();
        pausedAfterWorkInModalWindow();
    }

    @Step("Select date of birth")
    public static void selectBirthDate(String day, String month, String year) {
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
