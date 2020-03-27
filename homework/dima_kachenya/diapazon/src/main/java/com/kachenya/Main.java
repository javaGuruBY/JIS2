package com.kachenya;

import com.kachenya.copy.Copy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1={40,75,23,36,87,95,54,11,62};
        int[]out=Copy.copyInRange(a1,30,75);
        System.out.println(Arrays.toString(out));
    }

}
