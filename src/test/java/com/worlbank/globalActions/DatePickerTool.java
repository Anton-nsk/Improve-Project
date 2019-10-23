package com.worlbank.globalActions;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.sleep;
import static com.worlbank.elementPages.DatePickerElements.selectValueDayLess;
import static com.worlbank.elementPages.DatePickerElements.selectValueDayMore;
import static com.worlbank.elementPages.DatePickerElements.selectValueMonthLess;
import static com.worlbank.elementPages.DatePickerElements.selectValueMonthMore;
import static com.worlbank.elementPages.DatePickerElements.selectValueYearLess;
import static com.worlbank.elementPages.DatePickerElements.selectValueYearMore;
import static com.worlbank.elementPages.DatePickerElements.valueCurrentDay;
import static com.worlbank.elementPages.DatePickerElements.valueCurrentMonth;
import static com.worlbank.elementPages.DatePickerElements.valueCurrentYear;

public final class DatePickerTool {

    private DatePickerTool() {
    }

    public static void chooseDay(String day, String month, String year) {

        getValue(day, valueCurrentDay, selectValueDayLess, selectValueDayMore);

        getValue(month, valueCurrentMonth, selectValueMonthLess, selectValueMonthMore);

        getValue(year, valueCurrentYear, selectValueYearLess, selectValueYearMore);
    }

    private static void getValue(String needValue, SelenideElement select, SelenideElement selectDown, SelenideElement selectUp) {
        Integer intValue = Integer.valueOf(needValue);
        Integer intInitialValue = Integer.valueOf(select.getText());

        String choiceValue;
        do {
            if (intValue < intInitialValue) {
                select.dragAndDropTo(selectDown);
            } else {
                select.dragAndDropTo(selectUp);
            }
            choiceValue = select.getText();
        } while (!needValue.equals(choiceValue));
        sleep(200);
    }
}