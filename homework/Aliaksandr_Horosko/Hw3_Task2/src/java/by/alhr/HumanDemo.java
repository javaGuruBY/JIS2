package by.alhr;

import by.alhr.bean.Human;
import by.alhr.service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {
        Human Alex = new Human("Alex", 45);
        HumanService humanService = new HumanService();
        humanService.greet(Alex);
    }
}
