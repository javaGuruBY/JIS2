package by.seven;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
     int a = 0; //нижнее значение диапазона
     int b = 100; // верхнее значение диапазона
        int firstRandomNum = a + (int) (Math.random() * b);
        int secondRandomNum = a + (int) (Math.random() * b);
        int thirdRandomNum = a + (int) (Math.random() * b);
        System.out.println("First generaited number: " + firstRandomNum);
        System.out.println("Second generaited number: " + secondRandomNum);
        System.out.println("Third generaited number: " + thirdRandomNum);
        long sum = firstRandomNum + secondRandomNum + thirdRandomNum;
        System.out.println("Sum: " + sum);
    }
}
