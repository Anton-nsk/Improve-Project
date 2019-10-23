package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class LoanPurposePage {

    private LoanPurposePage() {
    }

    public static SelenideElement getLoanPurposeByText(String purpose) {
        return $x("//span[text() = '" + purpose + "']/..");
    }
}
