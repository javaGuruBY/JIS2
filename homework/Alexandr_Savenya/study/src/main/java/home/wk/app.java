package home.wk;

import home.wk.bean.Dog;
import home.wk.service.DogService;

public class app {
    public static void main(String[] args) {
        Dog dog1 = new Dog(5 ,"Black" ,"Rex" );
        System.out.println(" Hi, my name is " + dog1.getName() + " I'm "+ dog1.getAge() +" years old "+ " My color is "+ dog1.getColor() );
        DogService dogService = new DogService();
        dogService.voice();
        dogService.eat();
        dogService.sleep();
    }
}
