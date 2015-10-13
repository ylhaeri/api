package br.com.huegroup.api.date;

public interface DateTimeRelogio<T> extends Relogio<T> {
    
    public T of(int year, int month, int day, int hour, int minute);

    public T of(int year, int month, int day, int hour, int minute, int second);

    public T of(int year, int month, int day, int hour, int minute, int second, int precision);
}