package acya.ki.bean;

public class OperationExecutorDemo {
    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor();
        MathOperationI[] ops = {
                new AdditionOperation(),
                new SubtractionOperation(),
                new DivisionOperation(),
                new MultiplicationOperation(),
        };
        executor.execute(ops, 5, 3);
    }
}
