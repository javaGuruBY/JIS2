package by.alhr.Hw6_Task1_OddNumberTable.bean;

public class DoWhileOddChecker implements Runnable {

    int i = 0;

    public void showDoWhileOdd(){
        System.out.println("Start DoWhile");
        do {
            if (i%2 != 0) {
                System.out.println("i = " + i);
            }
            i++;

        } while (i <=50);
        System.out.println("DoWhileOddChecker AND");
    }

    @Override
    public void run() {
        DoWhileOddChecker doWhileOddChecker = new DoWhileOddChecker();
        doWhileOddChecker.showDoWhileOdd();
    }
}
