package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class InformationGuarantorPage {

    public static final SelenideElement dropdownApplicant = $x("//div[text() = 'Relationship to Applicant']/following-sibling::div");
    public static final SelenideElement valueRelationshipInDropdown = $x("//div[contains(@class, 'modal_window')]//div[5]");
    public static final SelenideElement fieldFirstName = $x("//div[text() = 'First name']/following-sibling::input");
    public static final SelenideElement fieldMiddleName = $x("//div[text() = 'Middle name']/following-sibling::input");
    public static final SelenideElement fieldLastName = $x("//div[text() = 'Last name']/following-sibling::input");
    public static final SelenideElement dropdownGender = $x("//div[text() = 'Gender']/following-sibling::div");
    public static final SelenideElement valueGenderInDropdown = $x("//div[contains(@class, 'modal_window')]//div[2]");
    public static final SelenideElement fieldDropdownNrcPrefix = $x("//div[contains(text(), 'NRC Prefix')]/following-sibling::input");
    public static final SelenideElement fieldNrcNumber = $x("//div[text() = 'NRC Number']/following-sibling::input");

    private InformationGuarantorPage() {
    }
}
