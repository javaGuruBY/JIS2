package acya.ki.bean;

public class Parrot extends Bird {
    public Parrot(String name, int age, boolean fly, boolean swim) {
        super(name, age, fly, swim);
    }

    public Parrot() {
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "fly=" + fly +
                ", swim=" + swim +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Kurlik-kurlik!");
    }
}
