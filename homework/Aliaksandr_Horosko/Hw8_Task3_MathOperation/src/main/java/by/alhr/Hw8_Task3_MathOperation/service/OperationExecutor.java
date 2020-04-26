package by.alhr.Hw8_Task3_MathOperation.service;

import by.alhr.Hw8_Task3_MathOperation.interfaces.MathOperation;

public class OperationExecutor {
    public void execute(MathOperation[] operations, double a, double b){
        for (MathOperation posledovatelno : operations) {
            System.out.println(posledovatelno.compute(a, b));
        }
    }
}
