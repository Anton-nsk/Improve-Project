package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class AddressPages {

    public static final SelenideElement fieldStreet = $x("//div[contains(text(), 'Street')]/following-sibling::input");
    public static final SelenideElement fieldHouseNumber = $x("//div[contains(text(), 'House number')]/following-sibling::input");
    public static final SelenideElement fieldPostCode = $x("//div[contains(text(), 'Post Code')]/following-sibling::input");
    public static final SelenideElement fieldCity = $x("//div[contains(text(), 'City')]/following-sibling::input");
    public static final SelenideElement fieldRegion = $x("//div[contains(text(), 'Region')]/following-sibling::input");
    public static final SelenideElement checkboxPermAddress = $x("//div[@class = 'zenoo-checkbox_avatar-inner']");
    public static final SelenideElement checkboxPermAddressStatus = $x("//div[@class = 'zenoo-checkbox_avatar-inner']/..");
    public static final SelenideElement dropdownYearAddress = $x("//*[contains(text(), 'Years at present address')]/following-sibling::div");
    public static final SelenideElement dropdownNumberPeople = $x("//*[contains(text(), 'Number of people in the household')]/following-sibling::div");
    public static final SelenideElement ValueFourInDropdown = $x("//div[contains(@class, 'modal_window')]//div[6]");

    private AddressPages() {
    }
}
