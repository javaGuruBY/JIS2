package by.serg.bean;

public class WhileOddChecker implements Runnable {

    public void showAllOddNumbersFromZeroToFifty() {
        int i = 0;
        while (i <=50 ) {
            if (i%2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }

    }

    @Override
    public void run() {
        WhileOddChecker whileOddChecker = new WhileOddChecker();
        whileOddChecker.showAllOddNumbersFromZeroToFifty();
    }
}
