package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class FinalPages {

    public static final SelenideElement processingScreenSpiner = $x("//div[contains(@class, 'zenoo-wheel-loader')]");
    public static final SelenideElement textInFinalScreen = $x("//h1[contains(text(), 'Thank you for applying')]");

    private FinalPages() {
    }
}
