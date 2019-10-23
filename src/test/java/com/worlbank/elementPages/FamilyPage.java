package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class FamilyPage {

    public static final SelenideElement fieldFatherName = $x("//div[contains(text(), 'Father`s Name')]/following-sibling::input");
    public static final SelenideElement fieldMotherName = $x("//div[contains(text(), 'Mother`s Name')]/following-sibling::input");
    public static final SelenideElement dropdownNumberOfDependents = $x("//*[contains(text(), 'Number of dependents')]/following-sibling::div");
    public static final SelenideElement valueThreeInDropdown = $x("//div[contains(@class, 'modal_window')]//div[6]");

    private FamilyPage() {
    }
}
