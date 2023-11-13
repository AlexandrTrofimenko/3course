package org.example;
import java.util.Scanner;
public class Problem1 {
    public static boolean containsDigitAInHexadecimalRepresentation(int number) {
        String numberInHex = Integer.toHexString(number);
        if (numberInHex.contains("a")) {
            System.out.printf("Число %d содержит символ A - %s",number,numberInHex=numberInHex.toUpperCase());
            return true;
        }
        else {
            System.out.printf("Число %d не содержит символа A - %s",number,numberInHex);
            return false;
        }
    }
}
