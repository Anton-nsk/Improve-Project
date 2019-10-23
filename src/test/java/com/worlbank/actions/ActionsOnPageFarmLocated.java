package com.worlbank.actions;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;
import static com.worlbank.elementPages.FarmLocatedPage.bodyGoogleMaps;

public final class ActionsOnPageFarmLocated {

    private ActionsOnPageFarmLocated() {
    }

    @Step("Select 'Area located' on the google maps")
    public static void selectAreaLocated() {
        sleep(500);
        Selenide.actions().moveToElement(bodyGoogleMaps, 0, 0).click().build().perform();
    }
}
