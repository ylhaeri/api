package br.com.huegroup.api.date;

public class Teste {
    public static void main(String[] args) {
        RelogioManager manager = new JavaTimeRelogioManager();
        System.out.println(manager.dateTime().now());
    }
}