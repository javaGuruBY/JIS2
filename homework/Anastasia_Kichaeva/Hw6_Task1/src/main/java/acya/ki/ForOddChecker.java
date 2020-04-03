package acya.ki;

public class ForOddChecker implements Runnable{
    public void showFor() {

        for (int i = 0; i <= 50; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i = "+ i +";");
        }
    }

    public void run() {
        ForOddChecker cycleFor = new ForOddChecker();
        cycleFor.showFor();
    }
}
