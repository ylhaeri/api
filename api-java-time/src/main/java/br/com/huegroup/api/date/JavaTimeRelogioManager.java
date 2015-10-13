package br.com.huegroup.api.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class JavaTimeRelogioManager implements RelogioManager {

    private final DateRelogio<LocalDate> date;
    private final DateTimeRelogio<LocalDateTime> dateTime;

    public JavaTimeRelogioManager() {
        date = new JavaTimeDateRelogio();
        dateTime = new JavaTimeDateTimeRelogio();
    }

    public JavaTimeRelogioManager(DateRelogio<LocalDate> date, DateTimeRelogio<LocalDateTime> dateTime) {
        this.date = date;
        this.dateTime = dateTime;
    }

    @Override
    public DateRelogio<LocalDate> date() {
        return date;
    }

    @Override
    public DateTimeRelogio<LocalDateTime> dateTime() {
        return dateTime;
    }
}