public class RandomGenerator {
    public static void main(String[] args) {
        double a=20+Math.random()*100;
        System.out.println("result of generation a= "+a);
        double b=30+Math.random()*100;
        System.out.println("result of generation b= "+b);
        System.out.println("result of amount "+(a+b));
    }
}
