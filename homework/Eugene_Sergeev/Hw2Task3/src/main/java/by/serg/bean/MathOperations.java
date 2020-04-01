package by.serg.bean;

public class MathOperations {

    public double summOfNumbers(double... enteredNumbers) {
        double result = 0;
        for (double number : enteredNumbers) {
            result += number;
        }
        return result;
    }

    public double differenceOfNumbers(double... enteredNumber) {
        double result = enteredNumber[0];
        for (int i = 1; i < enteredNumber.length; i++) {
            result -= enteredNumber[i];
        }
        return result;
    }

    public double multiplicationOfNumbers(double... enteredNumber) {
        double result = 1;
        for (double number : enteredNumber) {
            result *= number;
        }
        return result;
    }

    public double divisionOfNumbers(double... enteredNumbers) {
        double result = enteredNumbers[0];
        for (int i = 1; i < enteredNumbers.length; i++) {
            result /= enteredNumbers[i];
        }
        return result;
    }
}
