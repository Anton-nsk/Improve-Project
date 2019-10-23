package com.worlbank.actions;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.EnterPhoneNumberPage.FieldPassword;
import static com.worlbank.elementPages.EnterPhoneNumberPage.btnArrow;
import static com.worlbank.elementPages.EnterPhoneNumberPage.fieldPhoneNumber;

public final class ActionsOnPageEnterPhoneNumber {

    private ActionsOnPageEnterPhoneNumber() {
    }

    @Step("Input phone number Telenor")
    public static void inputTelephoneNumber(String phoneNumber) {
        fieldPhoneNumber
                .shouldBe(visible)
                .sendKeys(Keys.HOME, phoneNumber);
        btnArrow
                .shouldBe(visible)
                .click();
    }

    @Step("Input sms code")
    public static void inputSmsCode(int characterNumber, String value) {
        FieldPassword(characterNumber)
                .shouldBe(visible)
                .setValue(value);
    }
}
