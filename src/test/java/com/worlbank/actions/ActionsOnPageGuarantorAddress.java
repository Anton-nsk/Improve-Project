package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.GuarantorAddressPage.fieldCity;
import static com.worlbank.elementPages.GuarantorAddressPage.fieldHouseNumber;
import static com.worlbank.elementPages.GuarantorAddressPage.fieldPostCode;
import static com.worlbank.elementPages.GuarantorAddressPage.fieldRegion;
import static com.worlbank.elementPages.GuarantorAddressPage.fieldStreet;

public final class ActionsOnPageGuarantorAddress {

    private ActionsOnPageGuarantorAddress() {
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
        fieldCity
                .shouldBe(visible)
                .sendKeys(city);
    }

    @Step("Input the region")
    public static void inputRegion(String region) {
        fieldRegion
                .shouldBe(visible)
                .sendKeys(region);
    }
}
