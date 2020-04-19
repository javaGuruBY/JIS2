package acya.ki;

import acya.ki.service.Copy;

import java.util.Arrays;

public class CopyDemo {
    public static void main(String[] args) {
        Copy copy = new Copy();
        int[] in = {40, 75, 23, 36, 87, 95, 54, 11, 62};
        int[]out = copy.copyInRange(in,30,75);
        System.out.println(Arrays.toString(out));
    }
}