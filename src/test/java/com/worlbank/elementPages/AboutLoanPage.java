package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class AboutLoanPage {

    public static final SelenideElement textInPage1 = $x("//div/p[1]");
    public static final SelenideElement textInPage2 = $x("//div/p[2]");

    private AboutLoanPage() {
    }
}
