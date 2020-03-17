package by.lukash;
import by.lukash.bean.Dog;
import by.lukash.services.DogServices;

public class app {
    public static void main (String[] args){
        Dog firstDog = new Dog (5, "black", "Bobik");
        System.out.println("hello, my name is "+firstDog.getName()+" I'm "+firstDog.getAge()+" years old "+" I'm a "+firstDog.getColor()+" color");
        DogServices dogService=new DogServices();
        dogService.eat();
        dogService.sleep(firstDog);
        dogService.voice();


    }

}
