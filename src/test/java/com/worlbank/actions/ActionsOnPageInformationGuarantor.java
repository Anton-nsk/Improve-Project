package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.GlobalElementsPage.btnDone;
import static com.worlbank.elementPages.GlobalElementsPage.dataPicker;
import static com.worlbank.elementPages.GlobalElementsPage.titleModalWindow;
import static com.worlbank.elementPages.InformationGuarantorPage.dropdownApplicant;
import static com.worlbank.elementPages.InformationGuarantorPage.dropdownGender;
import static com.worlbank.elementPages.InformationGuarantorPage.fieldDropdownNrcPrefix;
import static com.worlbank.elementPages.InformationGuarantorPage.fieldFirstName;
import static com.worlbank.elementPages.InformationGuarantorPage.fieldLastName;
import static com.worlbank.elementPages.InformationGuarantorPage.fieldMiddleName;
import static com.worlbank.elementPages.InformationGuarantorPage.fieldNrcNumber;
import static com.worlbank.elementPages.InformationGuarantorPage.valueGenderInDropdown;
import static com.worlbank.elementPages.InformationGuarantorPage.valueRelationshipInDropdown;
import static com.worlbank.globalActions.CompareDateTool.compareDateInFieldAndNeededDate;
import static com.worlbank.globalActions.DatePickerTool.chooseDay;
import static com.worlbank.globalActions.GlobalBrowserActions.pausedAfterWorkInModalWindow;

public final class ActionsOnPageInformationGuarantor {

    private ActionsOnPageInformationGuarantor() {
    }

    @Step("Input information relationship")
    public static void selectValueRelationship() {
        dropdownApplicant
                .shouldBe(visible)
                .click();
        titleModalWindow.shouldBe(visible);
        valueRelationshipInDropdown
                .shouldBe(visible)
                .click();
        pausedAfterWorkInModalWindow();
    }

    @Step("Select 'Gender' guarantor")
    public static void selectGender() {
        dropdownGender
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
        pausedAfterWorkInModalWindow();
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

    @Step("Select date of birth")
    public static void selectBirthDateGuarantor(String day, String month, String year) {
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

    @Step("Input NRC prefix")
    public static void inputNrcPrefix(String nrcPrefix) {
        fieldDropdownNrcPrefix
                .shouldBe(visible)
                .sendKeys(nrcPrefix);
    }

    @Step("Input NRC Number")
    public static void inputNrc(String nrc) {
        fieldNrcNumber
                .shouldBe(visible)
                .sendKeys(nrc);
    }
}
