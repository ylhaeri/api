package br.com.huegroup.api.date;

public interface DateRelogio<T> extends Relogio<T> {
    
    public T of(int year, int month, int day);
}