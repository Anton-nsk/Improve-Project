package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class BeforeWeStartPage {

    public static final SelenideElement headingPage = $x("//h1[contains(text(), 'Before we start')]");

    private BeforeWeStartPage() {
    }

    public static SelenideElement getCheckbox(String nameCheckbox) {
        return $x("//label[contains(text(), '" + nameCheckbox + "')]");
    }
}
