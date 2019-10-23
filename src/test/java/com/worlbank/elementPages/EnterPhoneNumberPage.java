package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class EnterPhoneNumberPage {

    public static final SelenideElement fieldPhoneNumber = $x("//input[@type = 'tel']");
    public static final SelenideElement btnArrow = $x("//div[@class = 'zenoo-arrow-button_arrow']/..");

    private EnterPhoneNumberPage() {
    }

    public static SelenideElement FieldPassword(int characterNumber) {
        return $x("//input[@tabindex = '" + characterNumber + "']");
    }
}
