package by.serg.bean;

public class DoWhileOddChecker implements Runnable{

    public void showAllOddNumbersFromZeroToFifty() {
        int i = 0;
        do {
            if (i%2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        } while (i <=50);
    }

    @Override
    public void run() {
        DoWhileOddChecker doWhileOddChecker = new DoWhileOddChecker();
        doWhileOddChecker.showAllOddNumbersFromZeroToFifty();
    }
}
