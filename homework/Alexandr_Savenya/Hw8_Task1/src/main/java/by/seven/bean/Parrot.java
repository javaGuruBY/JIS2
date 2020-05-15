package by.seven.bean;

public class Parrot extends Bird {

    public Parrot() {
    }

    public Parrot(int weight, String name, int age, boolean fly) {
        super(weight, name, age, fly);
    }
    private boolean isFly() {
        return fly;
    }

    @Override
    public void eat() {
       if (isFly()) {
           System.out.println("Parrot eat: I'm not hungry");
       } else {
           System.out.println("Parrot eat: I'm eating berries and grains now");
       }
    }

    @Override
    public void voice() {
        if (isFly()) {
            System.out.println("voice: I believe I can fly\n" +
                    "I believe I can touch the sky");
        } else {
            System.out.println("voice: Where is my food?!");
        }
    }
}
