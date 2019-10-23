package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class DealerPage {

    public static final SelenideElement fieldAdvanceAmount = $x("//div[contains(text(), 'Advance amount')]/following-sibling::input");

    private DealerPage() {
    }
}
