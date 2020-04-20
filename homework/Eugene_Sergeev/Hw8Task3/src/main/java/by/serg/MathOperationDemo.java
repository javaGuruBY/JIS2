package by.serg;

import by.serg.bean.Addition;
import by.serg.bean.Division;
import by.serg.bean.Multiplication;
import by.serg.bean.Subtraction;
import by.serg.interfaces.MathOperation;
import by.serg.service.OperationExecutor;

public class MathOperationDemo {
    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor();
        MathOperation[] operations = {new Addition(), new Division(), new Multiplication(), new Subtraction()};
        executor.execute(operations, 10, 5);
    }
}
