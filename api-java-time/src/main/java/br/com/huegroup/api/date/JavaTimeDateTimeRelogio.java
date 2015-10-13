package br.com.huegroup.api.date;

import java.time.LocalDateTime;

public class JavaTimeDateTimeRelogio implements DateTimeRelogio<LocalDateTime> {

    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }

    @Override
    public LocalDateTime of(int year, int month, int day, int hour, int minute) {
        return LocalDateTime.of(year, month, day, hour, minute);
    }

    @Override
    public LocalDateTime of(int year, int month, int day, int hour, int minute, int second) {
        return LocalDateTime.of(year, month, day, hour, minute, second);
    }

    @Override
    public LocalDateTime of(int year, int month, int day, int hour, int minute, int second, int nano) {
        return LocalDateTime.of(year, month, day, hour, minute, second, nano);
    }
}