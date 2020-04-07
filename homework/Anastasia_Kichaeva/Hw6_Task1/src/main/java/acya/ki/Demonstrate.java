package acya.ki;

public class Demonstrate {
    public static void main(String[] args) {
        Thread threadDoWhile = new Thread(new DoWhileOddChecker());
        threadDoWhile.start();
        Thread threadFor = new Thread(new ForOddChecker());
        threadFor.start();
        Thread threadWhile = new Thread(new WhileOddChecker());
        threadWhile.start();
    }
}
