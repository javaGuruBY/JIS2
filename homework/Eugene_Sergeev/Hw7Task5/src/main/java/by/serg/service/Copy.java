package by.serg.service;

public class Copy {
    public static int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int counter = 0;
        for (int number: in) {
            if(number >= leftBound && number <= rightBound) {
                counter++;
            }
        }
        Integer[] buffer = new Integer[in.length];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = in[i];
        }
        int[] result = new int[counter];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < buffer.length; j++) {
                if(buffer[j] == null) {
                    continue;
                }
                if(buffer[j] >= leftBound && buffer[j] <= rightBound) {
                    result[i] = buffer[j];
                    buffer[j] = null;
                    break;
                }
            }
        }
        return result;
    }
}
