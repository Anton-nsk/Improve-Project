package com.worlbank.globalActions;

import com.codeborne.selenide.SelenideElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CompareDateTool {

    private CompareDateTool() {
    }

    public static void compareDateInFieldAndNeededDate(SelenideElement dataPicker, String day, String month, String year) {
        day = day.length() < 2 ? "0" + day : day;
        month = month.length() < 2 ? "0" + month : month;
        String expectedDateString = String.join("/", day, month, year);
        String selectDate = dataPicker.getValue();
        assertEquals(expectedDateString, selectDate);
    }
}
