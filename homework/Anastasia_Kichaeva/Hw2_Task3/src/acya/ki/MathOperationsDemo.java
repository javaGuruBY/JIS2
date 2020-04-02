package acya.ki;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations Demo'!");
        long theFirstNum = 8;
        long theSecondNum = 6;
        System.out.println("The first number = " + theFirstNum + "; The second number = " + theSecondNum);
        long sum = theFirstNum + theSecondNum;
        long diff = theFirstNum - theSecondNum;
        long div = theFirstNum * theSecondNum;
        long mult = theFirstNum / theSecondNum;

        System.out.println("The first number + the second number = " + sum);
        System.out.println("The first number - the second number = " + diff);
        System.out.println("The first number * the second number = " + div);
        System.out.println("The first number / the second number = " + mult);
    }
}
