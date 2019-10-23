package com.worlbank.actions;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.worlbank.elementPages.InformationFarmPage.checkboxIrrigate;
import static com.worlbank.elementPages.InformationFarmPage.checkboxIrrigateStatus;
import static com.worlbank.elementPages.InformationFarmPage.fieldCostOfProduction;
import static com.worlbank.elementPages.InformationFarmPage.fieldLandUsedForPurpose;
import static com.worlbank.elementPages.InformationFarmPage.fieldProbableAmount;
import static com.worlbank.elementPages.InformationFarmPage.fieldTotalLandSize;

public final class ActionsPageOnInformationFarm {

    private ActionsPageOnInformationFarm() {
    }

    @Step("Input 'Total land size'")
    public static void inputLandSize(String totalLandSize) {
        fieldTotalLandSize
                .shouldBe(visible)
                .sendKeys(totalLandSize);
    }

    @Step("Input 'Land size used for purpose'")
    public static void inputSizeLandUsedPurpose(String landSizePurpose) {
        fieldLandUsedForPurpose
                .shouldBe(visible)
                .sendKeys(landSizePurpose);
    }

    @Step("Input 'cost of production of this crop'")
    public static void inputCostProduction(String cost) {
        fieldCostOfProduction
                .shouldBe(visible)
                .sendKeys(cost);
    }

    @Step("Input 'Probable amount of sale value'")
    public static void inputAmount(String saleValue) {
        fieldProbableAmount
                .shouldBe(visible)
                .sendKeys(saleValue);
    }

    @Step("Check chckbox 'Please check this box if your farm is irrigated'")
    public static void checkCheckboxIrrigate() {
        checkboxIrrigate
                .shouldBe(visible)
                .click();
        checkboxIrrigateStatus.shouldHave(cssClass("checked"));
    }
}
