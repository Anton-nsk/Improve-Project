package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class InformationAboutLoanPage {

    public static final SelenideElement valueBankInDropdown = $x("//div[contains(@class, 'modal_window')]//div[4]");

    private InformationAboutLoanPage() {
    }

    public static SelenideElement dropdownBankName(String loansNumber) {
        return $x("//div[contains(@class, 'index-" + loansNumber + "')]//div[contains(@class, 'dropdown_select')]");
    }

    public static SelenideElement fieldLoanAmount(String loansNumber) {
        return $x("//div[contains(@class, 'index-" + loansNumber + "')]//input");
    }
}
