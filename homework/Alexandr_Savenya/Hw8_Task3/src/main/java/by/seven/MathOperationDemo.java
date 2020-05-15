package by.seven;

import by.seven.interfaces.MathOperations;
import by.seven.service.*;

public class MathOperationDemo {
    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor();
        MathOperations[] ops ={
                new AdditionOperation(),
                new SubtractionOperation(),
                new DivisionOperation(),
                new MultiplicationOperation()
        };
        executor.execute(ops, 25, 4);
    }
}
