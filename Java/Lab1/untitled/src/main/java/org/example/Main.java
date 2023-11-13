package org.example;

import org.apache.commons.math3.*;
import org.apache.commons.math3.util.CombinatoricsUtils;

public class Main {
    public static void main(String[] args) {
        long a = CombinatoricsUtils.factorial(10);
        System.out.println(a);
    }
}