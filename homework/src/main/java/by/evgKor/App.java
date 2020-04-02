package by.evgKor;

import by.evgKor.operation.*;

public class App {
    public static void main(String[] args) {
        OperationExecutor executor=new OperationExecutor();
        MathOperation[] ops={
                new Addition(),
                new Difference(),
                new Division(),
                new Multiplication()
        };
        executor.execute(ops,10,4);
    }
}
