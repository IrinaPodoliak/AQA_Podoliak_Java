package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextInt()) {
            int inputInt = console.nextInt();
            if (inputInt > 7) {
                System.out.println("Привет!");
            } else {
                System.out.println("Введенное число меньше семи");
            }
        } else {
            System.out.println("Введен неверный тип данных");
        }
    }
}