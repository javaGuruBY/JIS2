package by.alhr.Hw6_Task1_OddNumberTable.bean;

public class ForOddChecker implements Runnable {

    public void showForOddChecker(){
        System.out.println("Start For");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }
        System.out.println("ForOddChecker AND");
    }

    @Override
    public void run() {
        ForOddChecker forOddChecker = new ForOddChecker();
        forOddChecker.showForOddChecker();
    }
}
