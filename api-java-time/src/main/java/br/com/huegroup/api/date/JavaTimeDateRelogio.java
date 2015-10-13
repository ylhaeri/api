package br.com.huegroup.api.date;

import java.time.LocalDate;

public class JavaTimeDateRelogio implements DateRelogio<LocalDate> {

    @Override
    public LocalDate now() {
        return LocalDate.now();
    }

    @Override
    public LocalDate of(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}