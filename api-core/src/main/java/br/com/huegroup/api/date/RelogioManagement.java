package br.com.huegroup.api.date;

public interface RelogioManagement<Date, DateTime> {

    public DateRelogio<Date> date();

    public DateTimeRelogio<DateTime> dateTime();
}