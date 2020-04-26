package by.alhr.Hw8_Task3_MathOperation;

import by.alhr.Hw8_Task3_MathOperation.bean.AdditionOperation;
import by.alhr.Hw8_Task3_MathOperation.bean.DivisionOperation;
import by.alhr.Hw8_Task3_MathOperation.bean.MultiplicationOperation;
import by.alhr.Hw8_Task3_MathOperation.bean.SubtractionOperation;
import by.alhr.Hw8_Task3_MathOperation.interfaces.MathOperation;
import by.alhr.Hw8_Task3_MathOperation.service.OperationExecutor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Hw8Task3MathOperationDemo {
    public static void main(String[] args) {
       OperationExecutor executor = new OperationExecutor();
       MathOperation[] ops = {
         new AdditionOperation(),
         new DivisionOperation(),
         new MultiplicationOperation(),
         new SubtractionOperation()
       };
       executor.execute(ops, 8, 2);
    }
}

