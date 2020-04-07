package acya.ki;

public class DoWhileOddChecker implements Runnable{

        public void showDoWhile(){
        int i = 0;
        do {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("i = " + i + ";");
            i++;
        } while (i <= 50);
    }

    public void run() {
        DoWhileOddChecker doWhile = new DoWhileOddChecker();
        doWhile.showDoWhile();
    }
}
