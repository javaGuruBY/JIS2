package by.seven.service;

import by.seven.interfaces.MathOperations;

public class OperationExecutor  {
    public void execute(MathOperations[] operations, double a, double b){
        for (MathOperations mathOperations: operations) {
            System.out.println(mathOperations.compute(a, b));
        }

    }
}
