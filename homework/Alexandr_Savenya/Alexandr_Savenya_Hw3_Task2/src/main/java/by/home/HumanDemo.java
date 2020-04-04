package by.home;

import by.home.bean.Human;
import by.home.service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {
        Human John = new Human("John" , 20 );
        HumanService humanService = new HumanService();
        humanService.greet(John);
    }
}
