package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class TermsAndConditionsPage {

    public static final SelenideElement btnIAgree = $x("//button[contains(@class, 'zenoo-continue-button')]");
    public static final SelenideElement titlePage = $x("//h1[text() = 'Terms and Conditions']");

    private TermsAndConditionsPage() {
    }
}
