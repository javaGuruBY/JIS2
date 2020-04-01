package by.serg.service;

import by.serg.interfaces.MathOperation;

public class OperationExecutor {
    public void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation operation: operations) {
            System.out.println(operation.compute(a, b));
        }
    }
}
