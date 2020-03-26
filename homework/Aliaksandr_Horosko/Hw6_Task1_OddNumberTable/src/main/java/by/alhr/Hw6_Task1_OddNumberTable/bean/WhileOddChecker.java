package by.alhr.Hw6_Task1_OddNumberTable.bean;

public class WhileOddChecker implements Runnable {

    public void showWhileOddChecker() {
        int i = 0;
        while (i <=50 ) {
            if (i%2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("WhileOddChecker AND");
    }


    @Override
    public void run() {
        WhileOddChecker whileOddChecker = new WhileOddChecker();
        whileOddChecker.showWhileOddChecker();
    }
}
