package by.serg;

import by.serg.bean.Human;
import by.serg.service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {
        Human pasha = new Human("Pavel", 21);
        HumanService humanService = new HumanService();
        humanService.greet(pasha);
    }
}
