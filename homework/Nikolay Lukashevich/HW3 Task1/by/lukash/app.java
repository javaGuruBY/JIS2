package by.lukash;
import by.lukash.bean.Dog;
import by.lukash.services.DogServices;

public class app {
    public static void main (String[] args){
        Dog dog = new Dog (5, "black", "Bobik");
        System.out.println("hello, my name is "+dog.getName()+" I'm "+dog.getAge()+" years old "+" I'm a "+dog.getColor()+" color");
        DogServices dogService=new DogServices();
        dogService.eat();
        dogService.sleep(dog);
        dogService.voice();


    }

}
