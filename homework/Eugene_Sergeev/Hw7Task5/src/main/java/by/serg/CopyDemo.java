package by.serg;

import by.serg.service.Copy;

public class CopyDemo {
    public static void main(String[] args) {
        int[] array = {0,3,5,7,13,15,17,20,-6,-1000,500,-70,10000};
        for (int number: Copy.copyInRange(array, -6,8)) {
            System.out.print(number + " ");
        }
    }
}
