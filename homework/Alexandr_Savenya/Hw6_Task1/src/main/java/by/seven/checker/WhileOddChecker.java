package by.seven.checker;

public class WhileOddChecker {
    public static void Checker() {
        int i = 0;
        System.out.println("Начало цикла while:");
        while (i<=50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
