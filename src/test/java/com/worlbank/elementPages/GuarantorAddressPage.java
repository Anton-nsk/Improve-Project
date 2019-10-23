package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class GuarantorAddressPage {

    public static final SelenideElement fieldStreet = $x("//div[contains(text(), 'Street')]/following-sibling::input");
    public static final SelenideElement fieldHouseNumber = $x("//div[contains(text(), 'House number')]/following-sibling::input");
    public static final SelenideElement fieldPostCode = $x("//div[contains(text(), 'Post Code')]/following-sibling::input");
    public static final SelenideElement fieldCity = $x("//div[contains(text(), 'City')]/following-sibling::input");
    public static final SelenideElement fieldRegion = $x("//div[contains(text(), 'Region')]/following-sibling::input");

    private GuarantorAddressPage() {
    }
}
