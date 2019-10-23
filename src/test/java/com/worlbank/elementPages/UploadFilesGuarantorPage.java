package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class UploadFilesGuarantorPage {

    public static final SelenideElement openedScreen = $x("//div['zenoo-upload-selfie_header'][contains(text(), 'Guarantor Selfie')]");
    public static final SelenideElement btnYourSelfie = $x("//*[@class = 'zenoo-upload-selfie_header']");
    public static final SelenideElement areaUploadSelfie = $x("//div[@class = 'zenoo-upload-selfie_upload-wraper']");
    public static final SelenideElement uploadYourSelfieField = $x("//div[@class = 'zenoo-upload-selfie_upload-wraper']/following-sibling::input");
    public static final SelenideElement btnYourNrcCard = $x("//*[@class = 'zenoo-pid-upload_header']");
    public static final SelenideElement areaUploadNrc = $x("//div[@class = 'zenoo-pid-upload_upload-wraper']");
    public static final SelenideElement uploadYourNrcFront = $x("//div[@class = 'zenoo-pid-upload_upload-wraper']/input");
    public static final SelenideElement progressBarUpload = $x("//div[@class = 'zenoo-upload-pb']");
    public static final SelenideElement uploadYourNrcBack = $x("//div[contains(@class, 'zenoo-pid-upload_delete-button')]/following-sibling::input");

    private UploadFilesGuarantorPage() {
    }
}
