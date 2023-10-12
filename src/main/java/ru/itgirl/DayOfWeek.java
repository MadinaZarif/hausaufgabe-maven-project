package ru.itgirl;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String translate;

    DayOfWeek(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}

