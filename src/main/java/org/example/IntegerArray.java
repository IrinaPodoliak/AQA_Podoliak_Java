package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntegerArray {
    public static void main(String[] args) {
        int[] integerArray = new int[]{3, 7, 8, 9, 12};
        for (int a:integerArray) {
            if (a % 3==0) {
                System.out.println(a);
            }
        }
    }
}
