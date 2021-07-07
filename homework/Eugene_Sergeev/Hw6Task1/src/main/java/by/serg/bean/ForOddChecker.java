package by.serg.bean;

public class ForOddChecker implements Runnable{

    public void showAllOddNumbersFromZeroToFifty() {
        for (int i = 0; i <=50; i++) {
            if (i%2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

    }

    @Override
    public void run() {
        ForOddChecker forOddChecker = new ForOddChecker();
        forOddChecker.showAllOddNumbersFromZeroToFifty();
    }
}
