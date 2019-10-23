package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class InformationFarmPage {

    public static final SelenideElement fieldTotalLandSize = $x("//div[contains(text(), 'Total Land size')]/following-sibling::input");
    public static final SelenideElement fieldLandUsedForPurpose = $x("//div[contains(text(), 'Land size used for purpose')]/following-sibling::input");
    public static final SelenideElement fieldCostOfProduction = $x("//div[contains(text(), 'Cost of production')]/following-sibling::input");
    public static final SelenideElement fieldProbableAmount = $x("//div[contains(text(), 'Probable amount')]/following-sibling::input");
    public static final SelenideElement checkboxIrrigate = $x("//div[@class = 'zenoo-checkbox_avatar-inner']");
    public static final SelenideElement checkboxIrrigateStatus = $x("//div[@class = 'zenoo-checkbox_avatar-inner']/..");

    private InformationFarmPage() {
    }
}
