package by.seven.checker;

public class DoWhileOddChecker {
    public static void Checker() {
        int i = 0;
        System.out.println("Начало цикла do While:");

        do {
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;


        } while (i <= 50);

    }
}
