package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class PersonalDetailsPage {

    public static final SelenideElement fieldFirstName = $x("//div[text() = 'First name']/following-sibling::input");
    public static final SelenideElement fieldMiddleName = $x("//div[text() = 'Middle name']/following-sibling::input");
    public static final SelenideElement fieldLastName = $x("//div[text() = 'Last name']/following-sibling::input");
    public static final SelenideElement valueGenderInDropdown = $x("//div[contains(@class, 'modal_window')]//div[2]");
    public static final SelenideElement dropdownTitleAndMaritalStatus = $x("//div[@class = 'zenoo-dropdown_select']");
    public static final SelenideElement fieldDropdownNrcPrefix = $x("//div[contains(text(), 'NRC Prefix')]/following-sibling::input");
    public static final SelenideElement fieldNrcNumber = $x("//div[text() = 'NRC Number']/following-sibling::input");
    public static final SelenideElement valueMaritalStatus = $x("//div[contains(@class, 'modal_window')]//div[6]");

    private PersonalDetailsPage() {
    }
}
