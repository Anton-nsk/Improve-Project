package com.worlbank.globalActions;

import com.codeborne.selenide.SelenideElement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.charset.Charset.defaultCharset;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CompareTextsTool {

    private CompareTextsTool() {
    }

    public static void compareTexts(SelenideElement selenideElement, String pathToFile) throws IOException {
        String textAboutLoans2 = selenideElement.getText();
        String textAboutLoansExample2 = String.join("\n", Files.readAllLines(Paths.get(pathToFile), defaultCharset()));
        assertEquals(textAboutLoansExample2, textAboutLoans2);
    }
}
