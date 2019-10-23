package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class LoanAmountPage {

    public static final SelenideElement fieldLoanAmount = $x("//*[@class = 'zenoo-slider-input_input']");
    public static final SelenideElement checkboxMobileMoney = $x("//div[@class = 'zenoo-checkbox_avatar-inner']");
    public static final SelenideElement checkboxMobileMoneyStatus = $x("//div[@class = 'zenoo-checkbox_avatar-inner']/..");

    private LoanAmountPage() {
    }
}
