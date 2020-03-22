package acya.ki;

import acya.ki.bean.Human;
import acya.ki.service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {

        Human petya = new Human("Petya", 21);
        Human kolya = new Human("Kolya", 16);
        HumanService humanService = new HumanService();
        humanService.greet(petya);
    }

}
