package com.worlbank;

import com.worlbank.actions.ActionsOnFinalPages;
import com.worlbank.actions.ActionsOnPageAboutLoan;
import com.worlbank.actions.ActionsOnPageBeforeWeStart;
import com.worlbank.actions.ActionsOnPageDealer;
import com.worlbank.actions.ActionsOnPageEnterPhoneNumber;
import com.worlbank.actions.ActionsOnPageFamily;
import com.worlbank.actions.ActionsOnPageFarmLocated;
import com.worlbank.actions.ActionsOnPageGuarantorAddress;
import com.worlbank.actions.ActionsOnPageInfAboutLoan;
import com.worlbank.actions.ActionsOnPageInformationGuarantor;
import com.worlbank.actions.ActionsOnPageLoanAmount;
import com.worlbank.actions.ActionsOnPageLoanPurpose;
import com.worlbank.actions.ActionsOnPageOtherLoans;
import com.worlbank.actions.ActionsOnPageStart;
import com.worlbank.actions.ActionsOnPageTermsAndConditions;
import com.worlbank.actions.ActionsOnPageUploadGuarantorFiles;
import com.worlbank.actions.ActionsOnPageUploadPersonalFiles;
import com.worlbank.actions.ActionsOnPagesAddress;
import com.worlbank.actions.ActionsOnPersonalDetailsPage;
import com.worlbank.actions.ActionsPageOnInformationFarm;
import com.worlbank.globalActions.GlobalBrowserActions;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.worlbank.configurationsTests.Configurations.LOCAL_TESTING_URL;
import static org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class WorkflowTests {

    private final GlobalBrowserActions actions = new GlobalBrowserActions();

    @BeforeAll
    public static void setUp() {
        browser = CHROME;
        browserSize = "1920x1080";
    }

    @AfterAll
    public static void stopTest() {
        getWebDriver().close();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Start Page")
    @Order(1)
    @DisplayName("Open start page")
    @Test
    public void openingAnInstanceAndTestingTextFidelity() {
        actions.open(LOCAL_TESTING_URL);
        ActionsOnPageStart.openAboutLoans();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("About loan page")
    @Order(2)
    @DisplayName("Compare text on page")
    @Test
    public void compareTextOnPage() throws IOException {
        ActionsOnPageAboutLoan.checkTextCorrectness();
        ActionsOnPageAboutLoan.clickStartApplication();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Before we start page")
    @Order(3)
    @DisplayName("Check required checkboxes")
    @Test
    public void startMainFlow() {
        ActionsOnPageBeforeWeStart.checkCheckBox("Are you older than 20 but younger than 65?");
        ActionsOnPageBeforeWeStart.checkBtnStatus();
        ActionsOnPageBeforeWeStart.checkCheckBox("Are you an existing Telenor customer for more than 6 months?");
        ActionsOnPageBeforeWeStart.checkBtnStatus();
        ActionsOnPageBeforeWeStart.checkCheckBox("Do you hold an NRC?");
        ActionsOnPageBeforeWeStart.checkBtnStatus();
        ActionsOnPageBeforeWeStart.checkCheckBox("Do you have the household list with you?");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Enter phone number page")
    @Order(4)
    @DisplayName("Enter phone number and sms code")
    @Test
    public void inputPhoneNum() {
        ActionsOnPageEnterPhoneNumber.inputTelephoneNumber("1111111111");
        ActionsOnPageEnterPhoneNumber.inputSmsCode(1, "0");
        ActionsOnPageEnterPhoneNumber.inputSmsCode(2, "0");
        ActionsOnPageEnterPhoneNumber.inputSmsCode(3, "0");
        ActionsOnPageEnterPhoneNumber.inputSmsCode(4, "0");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Agree Terms and Conditions")
    @Order(5)
    @DisplayName("Agree Terms and Conditions")
    @Test
    public void agreeTermsAndConditions() {
        ActionsOnPageTermsAndConditions.checkPageOpened();
        ActionsOnPageTermsAndConditions.clickBtnIAgree();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Personal details page first screen")
    @Order(6)
    @DisplayName("Enter personal details 1 display")
    @Test
    public void inputPersonalDetailsFirstDisplay() {
        ActionsOnPersonalDetailsPage.selectGender();
        ActionsOnPersonalDetailsPage.inputFirstName("Bam");
        ActionsOnPersonalDetailsPage.inputLastName("Bum");
        ActionsOnPersonalDetailsPage.inputMiddleName("Bem");
        ActionsOnPersonalDetailsPage.inputNrcPrefix("what");
        ActionsOnPersonalDetailsPage.inputNrc("231456");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Personal details page second screen")
    @Order(7)
    @DisplayName("Enter personal details 2 display")
    @Test
    public void inputPersonalDetailsSecondDisplay() {
        ActionsOnPersonalDetailsPage.selectMaritalStatus();
        ActionsOnPersonalDetailsPage.selectBirthDate("6", "6", "1998");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Residential address information page firs screen")
    @Order(8)
    @DisplayName("Enter residential address information first screen")
    @Test
    public void inputResidentialAddressInformationFirstLong() {
        ActionsOnPagesAddress.inputStreet("zorge");
        ActionsOnPagesAddress.inputHouseNumber("156");
        ActionsOnPagesAddress.inputPostCode("156132");
        ActionsOnPagesAddress.inputCity("Tomsk");
        ActionsOnPagesAddress.inputRegion("RF");
        //ActionsOnPagesAddress.checkCheckboxPermAddress();
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Residential address information page firs screen")
    @Order(9)
    @DisplayName("Enter residential address information second screen")
    @Test
    public void inputResidentialAddressInformationSecond() {
        ActionsOnPagesAddress.selectNumberOfYearsAtPresentAddress();
        ActionsOnPagesAddress.selectNumberOfPeopleInTheHousehold();
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Permanent residential address information page")
    @Order(10)
    @DisplayName("Enter permanent residential address information")
    @Test
    public void inputPermanentAddress() {
        ActionsOnPagesAddress.inputStreet("asdas");
        ActionsOnPagesAddress.inputHouseNumber("3156");
        ActionsOnPagesAddress.inputPostCode("156134442");
        ActionsOnPagesAddress.inputCity("Omsk");
        ActionsOnPagesAddress.inputRegion("FR");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Family information page")
    @Order(11)
    @DisplayName("Enter family information")
    @Test
    public void inputFamilyInformation() {
        ActionsOnPageFamily.inputFatherName("MyFather");
        ActionsOnPageFamily.inputMotherName("MyMother");
        ActionsOnPageFamily.selectNumberOfDependents();
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Amount loans page")
    @Order(12)
    @DisplayName("Enter amount loans")
    @Test
    public void inputAmountValue() {
        ActionsOnPageLoanAmount.inputAmountLoans("450000");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Loan purpose page")
    @Order(13)
    @DisplayName("Select loan purpose")
    @Test
    public void selectLoanPurpose() {
        ActionsOnPageLoanPurpose.selectLoanPurpose("Rice");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Planting date page")
    @Order(14)
    @DisplayName("Select planting date")
    @Test
    public void selectPlantingDate() {
        ActionsOnPageLoanPurpose.selectDatePlanting("6", "6", "2020");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Information about your farm page")
    @Order(15)
    @DisplayName("Input information on the farm")
    @Test
    public void inputInformationAboutFarm() {
        ActionsPageOnInformationFarm.inputLandSize("6546");
        ActionsPageOnInformationFarm.inputSizeLandUsedPurpose("2135");
        ActionsPageOnInformationFarm.inputCostProduction("44646");
        ActionsPageOnInformationFarm.inputAmount("65464");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Select located your farm")
    @Order(16)
    @DisplayName("Select located farm")
    @Test
    public void selectAreaFarmLocated() {
        ActionsOnPageFarmLocated.selectAreaLocated();
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Do you have other loans")
    @Order(17)
    @DisplayName("Select how many loans")
    @Test
    public void selectHowManyLoans() {
        GlobalBrowserActions.clickButtonYesOrNo("Yes");
        ActionsOnPageOtherLoans.selectHowManyLoans("3");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Information about loans")
    @Order(18)
    @DisplayName("Enter information about loans")
    @Test
    public void inputInfAboutLoans() {
        //*loanNumber = value "selectHowManyLoans - 1". Loan numbering starts from 0*//
        ActionsOnPageInfAboutLoan.inputInformation("0", "250000");
        ActionsOnPageInfAboutLoan.inputInformation("1", "350000");
        ActionsOnPageInfAboutLoan.inputInformation("2", "450000");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Do you have advance Dealer")
    @Order(19)
    @DisplayName("Do you have advance Dealer")
    @Test
    public void inputInfDealer() {
        GlobalBrowserActions.clickButtonYesOrNo("Yes");
        ActionsOnPageDealer.inputSizeAmount("654654");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Information about your Guarantor")
    @Order(20)
    @DisplayName("Enter information about your Guarantor")
    @Test
    public void inputInfGuarantorFirst() {
        ActionsOnPageInformationGuarantor.selectValueRelationship();
        ActionsOnPageInformationGuarantor.inputFirstName("Bethowen");
        ActionsOnPageInformationGuarantor.inputLastName("Bach");
        ActionsOnPageInformationGuarantor.inputMiddleName("Beyonce");
        ActionsOnPageInformationGuarantor.selectGender();
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Information about your Guarantor")
    @Order(21)
    @DisplayName("Enter information about your Guarantor")
    @Test
    public void inputInfGuarantorSecond() {
        ActionsOnPageInformationGuarantor.selectBirthDateGuarantor("9", "9", "1998");
        ActionsOnPageInformationGuarantor.inputNrcPrefix("asda");
        ActionsOnPageInformationGuarantor.inputNrc("13213654");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Guarantor address")
    @Order(22)
    @DisplayName("Enter Guarantor address")
    @Test
    public void inputGuarantorAddress() {
        ActionsOnPageGuarantorAddress.inputStreet("muha");
        ActionsOnPageGuarantorAddress.inputHouseNumber("123");
        ActionsOnPageGuarantorAddress.inputPostCode("123456");
        ActionsOnPageGuarantorAddress.inputCity("Novosibirsk");
        ActionsOnPageGuarantorAddress.inputRegion("RF");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Upload selfie and document")
    @Order(23)
    @DisplayName("Upload selfie and document")
    @Test
    public void uploadDocuments() {
        ActionsOnPageUploadPersonalFiles.uploadSelfie("src/test/resources/selfie.jpg");
        ActionsOnPageUploadPersonalFiles.uploadNrcFront("src/test/resources/nrc.png");
        ActionsOnPageUploadPersonalFiles.uploadNrcBack("src/test/resources/nrc.png");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Upload selfie and document guarantor")
    @Order(24)
    @DisplayName("Upload selfie and document guarantor")
    @Test
    public void uploadDocumentsGuarantor() {
        ActionsOnPageUploadGuarantorFiles.uploadSelfie("src/test/resources/guarantor.jpg");
        ActionsOnPageUploadGuarantorFiles.uploadNrcFront("src/test/resources/guarantorNrc.jpg");
        ActionsOnPageUploadGuarantorFiles.uploadNrcBack("src/test/resources/guarantorNrc.jpg");
        actions.clickBtnContinue();
    }

    @Tag("Positive_Test_Long_Flow")
    @Epic("Final Screens")
    @Order(25)
    @DisplayName("Final Screens")
    @Test
    public void finalScreens() {
        ActionsOnFinalPages.processingSpinerWait();
        ActionsOnFinalPages.finalScreenVisible();
    }
}