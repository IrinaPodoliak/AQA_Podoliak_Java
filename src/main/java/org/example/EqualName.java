package org.example;

import java.util.Scanner;

public class EqualName{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextLine()) {
            String inputString = console.nextLine();
            if (inputString.equalsIgnoreCase("Вячеслав")) {
                System.out.println("Привет, Вячеслав!");
            } else {
                System.out.println("Нет такого имени");
            }
        } else {
            System.out.println("Введен неверный тип данных");
        }
    }
}