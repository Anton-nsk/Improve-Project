package com.worlbank.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public final class DatePickerElements {

    //работа с днями датапикера
    public static final SelenideElement selectValueDayMore = $x("//div[@class = 'datepicker-content']/div[1]//li[5]");
    public static final SelenideElement valueCurrentDay = $x("//div[@class = 'datepicker-content']/div[1]//li[6]");
    public static final SelenideElement selectValueDayLess = $x("//div[@class = 'datepicker-content']/div[1]//li[7]");
    //работа с месяцами датапикера
    public static final SelenideElement selectValueMonthMore = $x("//div[@class = 'datepicker-content']/div[2]//li[5]");
    public static final SelenideElement valueCurrentMonth = $x("//div[@class = 'datepicker-content']/div[2]//li[6]");
    public static final SelenideElement selectValueMonthLess = $x("//div[@class = 'datepicker-content']/div[2]//li[7]");
    //работа с годами датапикера
    public static final SelenideElement selectValueYearMore = $x("//div[@class = 'datepicker-content']/div[3]//li[5]");
    public static final SelenideElement valueCurrentYear = $x("//div[@class = 'datepicker-content']/div[3]//li[6]");
    public static final SelenideElement selectValueYearLess = $x("//div[@class = 'datepicker-content']/div[3]//li[7]");

    private DatePickerElements() {
    }
}
