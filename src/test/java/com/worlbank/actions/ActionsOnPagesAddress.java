package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.AddressPages.ValueFourInDropdown;
import static com.worlbank.elementPages.AddressPages.checkboxPermAddress;
import static com.worlbank.elementPages.AddressPages.checkboxPermAddressStatus;
import static com.worlbank.elementPages.AddressPages.dropdownNumberPeople;
import static com.worlbank.elementPages.AddressPages.dropdownYearAddress;
import static com.worlbank.elementPages.AddressPages.fieldCity;
import static com.worlbank.elementPages.AddressPages.fieldHouseNumber;
import static com.worlbank.elementPages.AddressPages.fieldPostCode;
import static com.worlbank.elementPages.AddressPages.fieldRegion;
import static com.worlbank.elementPages.AddressPages.fieldStreet;
import static com.worlbank.elementPages.GlobalElementsPage.titleModalWindow;
import static com.worlbank.globalActions.GlobalBrowserActions.pausedAfterWorkInModalWindow;

public final class ActionsOnPagesAddress {

    private ActionsOnPagesAddress() {
    }

    @Step("Input the street")
    public static void inputStreet(String street) {
        fieldStreet
                .shouldBe(visible)
                .sendKeys(street);
    }

    @Step("Input the house number")
    public static void inputHouseNumber(String number) {
        fieldHouseNumber
                .shouldBe(visible)
                .sendKeys(number);
    }

    @Step("Input the post code")
    public static void inputPostCode(String postCode) {
        fieldPostCode
                .shouldBe(visible)
                .sendKeys(postCode);
    }

    @Step("Input the city")
    public static void inputCity(String city) {
        fieldCity.shouldBe(visible).sendKeys(city);
    }

    @Step("Input the region")
    public static void inputRegion(String region) {
        fieldRegion
                .shouldBe(visible)
                .sendKeys(region);
    }

    @Step("Check checkbox 'This is my permanent address'")
    public static void checkCheckboxPermAddress() {
        checkboxPermAddress
                .shouldBe(visible)
                .click();
        checkboxPermAddressStatus.shouldHave(cssClass("checked"));
    }

    @Step("Select value from dropdown 'Years at present address'")
    public static void selectNumberOfYearsAtPresentAddress() {
        dropdownYearAddress
                .shouldBe(visible)
                .click();
        titleModalWindow.shouldBe(visible);
        ValueFourInDropdown
                .shouldBe(visible)
                .click();
        pausedAfterWorkInModalWindow();
    }

    @Step("Select value from dropdown 'Number of people in the household'")
    public static void selectNumberOfPeopleInTheHousehold() {
        dropdownNumberPeople
                .shouldBe(visible)
                .click();
        titleModalWindow.shouldBe(visible);
        ValueFourInDropdown
                .shouldBe(visible)
                .click();
        pausedAfterWorkInModalWindow();
    }
}
