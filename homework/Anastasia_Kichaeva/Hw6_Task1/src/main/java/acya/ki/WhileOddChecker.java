package acya.ki;

public class WhileOddChecker implements Runnable{
    public void showWhile() {
        int i = 0;
        while (i <= 50){
            if (i % 2 == 0){
                i++;
                continue;
            }
            System.out.println("i = " + i + ";");
            i++;
        }
    }

    public void run() {
        WhileOddChecker cycleWhile = new WhileOddChecker();
        cycleWhile.showWhile();
    }
}

