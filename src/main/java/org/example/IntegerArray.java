package org.example;

import java.util.Scanner;

public class IntegerArray {
    public static void main(String[] args) {
        System.out.println("Введите 6 чисел через пробел, затем нажмите Enter:");
        Scanner console = new Scanner(System.in);
        int[] integerArray = new int[6];
        for (int i=0;i<integerArray.length;i++){
            integerArray[i] = console.nextInt();
        }
        System.out.println("Числа, кратные трём:");
        for (int j : integerArray) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}
