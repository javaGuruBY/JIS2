package by.evgKor;

import by.evgKor.bean.MathOperationDemo;

public class MathOperation {
    public static void main(String[] args) {
        MathOperationDemo mathOperationDemo=new MathOperationDemo();
        mathOperationDemo.a=60;
        mathOperationDemo.b=40;
        System.out.println("result of amount = "+mathOperationDemo.a+mathOperationDemo.b);
        System.out.println("result of difference = "+(mathOperationDemo.a-mathOperationDemo.b));
        System.out.println("result of multiplication = "+mathOperationDemo.a*mathOperationDemo.b);
        System.out.println("result of division = "+mathOperationDemo.a/mathOperationDemo.b);
    }

}
