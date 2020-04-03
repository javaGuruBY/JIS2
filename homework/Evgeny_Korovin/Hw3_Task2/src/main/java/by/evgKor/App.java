package by.evgKor;
import by.evgKor.service.HumanService;
import by.evgKor.bean.Human;

public class App {
    public static void main(String[] args) {
        Human humanNumOne=new Human("Evgeny",19);
        HumanService humanService=new HumanService();
        humanService.greet(humanNumOne);
        Human humanNumTwo=new Human("Victor",79);
        HumanService secondHumanService=new HumanService();
        secondHumanService.greet(humanNumTwo);



    }
}
