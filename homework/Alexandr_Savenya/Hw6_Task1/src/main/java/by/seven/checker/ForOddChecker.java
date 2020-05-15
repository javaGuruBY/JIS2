package by.seven.checker;

public class ForOddChecker {
    public static void Checker() {
        System.out.println("Начало цикла for:");
        for (int i = 0; i <= 50; i++ ){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
