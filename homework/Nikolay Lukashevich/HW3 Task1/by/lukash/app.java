package by.lukash;
import by.lukash.bean.Dog;
import by.lukash.services.DogServices;

public class app {
    public static void main (String[] args){
        Dog Dog = new Dog (5, "black", "Bobik");
        System.out.println("hello, my name is "+Dog.getName()+" I'm "+Dog.getAge()+" years old "+" I'm a "+Dog.getColor()+" color");
        DogServices dogService=new DogServices();
        dogService.eat();
        dogService.sleep(firstDog);
        dogService.voice();


    }

}
