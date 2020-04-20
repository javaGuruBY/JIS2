package acya.ki.bean;

public class OperationExecutor {
    void execute(MathOperationI[] operationIS, double a, double b){
        for (MathOperationI mathOperationI : operationIS) {
            System.out.println(mathOperationI.compute(a, b));
        }
    }
}
