package by.evgKor.operation;

import by.evgKor.MathOperation;

public class OperationExecutor {

    public void execute(MathOperation[] operations, double a, double b){
        for (MathOperation temp:operations
             ) {
            System.out.println(temp.compute(a, b));
        }
    }

}
