package com.worlbank.actions;

import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.areaUploadNrc;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.areaUploadSelfie;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.btnYourNrcCard;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.btnYourSelfie;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.openedScreen;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.progressBarUpload;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.uploadYourNrcBack;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.uploadYourNrcFront;
import static com.worlbank.elementPages.UploadFilesGuarantorPage.uploadYourSelfieField;

public final class ActionsOnPageUploadGuarantorFiles {

    private ActionsOnPageUploadGuarantorFiles() {
    }

    private static void uploadProgressBar() {
        boolean statusUpload;
        if (!progressBarUpload.isDisplayed()) {
            do {
                sleep(100);
                statusUpload = progressBarUpload.isDisplayed();
            } while (statusUpload == true);
        }
    }

    @Step("Upload selfies")
    public static void uploadSelfie(String pathToFile) {
        while (!openedScreen.isDisplayed()) {
            sleep(100);
        }
        btnYourSelfie
                .shouldBe(visible)
                .click();
        areaUploadSelfie.waitUntil(visible, 150);
        uploadYourSelfieField.uploadFile(new File(pathToFile));
        uploadProgressBar();
    }

    @Step("Upload front NRC card")
    public static void uploadNrcFront(String pathToFile) {
        btnYourNrcCard
                .shouldBe(visible)
                .click();
        areaUploadNrc.waitUntil(visible, 150);
        uploadYourNrcFront.uploadFile(new File(pathToFile));
        uploadProgressBar();
    }

    @Step("Upload back NRC card")
    public static void uploadNrcBack(String pathToFile) {
        uploadYourNrcBack.uploadFile(new File(pathToFile));
        uploadProgressBar();
    }
}
