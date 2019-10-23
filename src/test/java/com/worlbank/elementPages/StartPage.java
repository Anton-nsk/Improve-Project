package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class StartPage {

    //Стартовая страница
    public static final SelenideElement btnStartApplication = $x("//button[@class = 'zenoo-continue-button']");
    public static final SelenideElement btnAboutLoan = $x("//button[contains(@class, 'zenoo-landing_about')]");

    private StartPage() {
    }
}
