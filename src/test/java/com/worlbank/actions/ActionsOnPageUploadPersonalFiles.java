package com.worlbank.actions;

import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.worlbank.elementPages.UploadFilesPersonalPage.areaUploadNrc;
import static com.worlbank.elementPages.UploadFilesPersonalPage.areaUploadSelfie;
import static com.worlbank.elementPages.UploadFilesPersonalPage.btnYourNrcCard;
import static com.worlbank.elementPages.UploadFilesPersonalPage.btnYourSelfie;
import static com.worlbank.elementPages.UploadFilesPersonalPage.progressBarUpload;
import static com.worlbank.elementPages.UploadFilesPersonalPage.uploadYourNrcBack;
import static com.worlbank.elementPages.UploadFilesPersonalPage.uploadYourNrcFront;
import static com.worlbank.elementPages.UploadFilesPersonalPage.uploadYourSelfieField;

public final class ActionsOnPageUploadPersonalFiles {

    private ActionsOnPageUploadPersonalFiles() {
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
        btnYourSelfie
                .shouldBe(visible)
                .click();
        areaUploadSelfie.waitUntil(visible, 100);
        uploadYourSelfieField.uploadFile(new File(pathToFile));
        uploadProgressBar();
    }

    @Step("Upload front NRC card")
    public static void uploadNrcFront(String pathToFile) {
        btnYourNrcCard
                .shouldBe(visible)
                .click();
        areaUploadNrc.waitUntil(visible, 100);
        uploadYourNrcFront.uploadFile(new File(pathToFile));
        uploadProgressBar();
    }

    @Step("Upload back NRC card")
    public static void uploadNrcBack(String pathToFile) {
        uploadYourNrcBack.uploadFile(new File(pathToFile));
        uploadProgressBar();
    }
}
