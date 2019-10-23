package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class OtherLoansPage {

    private OtherLoansPage() {
    }

    public static SelenideElement btnHowManyLoans(String loans) {
        return $x("//div[contains(@class, 'slider_item')]/div[contains(text(), '" + loans + "')]/..");
    }
}
