package by.serg.bean;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable, Runnable {
    private String number;
    private String pinCode;
    private double balance = 0;
    private double creditLimit = 1000;
    private double creditDebt = 0;

    public void deposit(String pinCode, double summ) {
        if (pinCode.equals(this.pinCode)) {
            if (summ > creditDebt) {
                summ -= creditDebt;
                creditDebt = 0;
                balance += summ;
            } else {
                creditDebt -= summ;
            }
        } else {
            System.out.println("Incorrect pin-code");
        }
    }

    public void withdraw(String pinCode, double summ) {
        if (pinCode.equals(this.pinCode)) {
            if ((summ-balance) > (creditLimit-creditDebt)) {
                System.out.println("Not enough money");
            } else if (summ > balance){
                summ -= balance;
                balance = 0;
                creditDebt += summ;
            } else {
                balance -= summ;
            }
        } else {
            System.out.println("Incorrect pin-code");
        }
    }

    public CreditCard(String number, String    pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    public CreditCard() {
    }

    public String getNumber() {
        return number;
    }

    public String getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return number == that.number &&
                pinCode == that.pinCode &&
                Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.creditDebt, creditDebt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, pinCode, balance, creditLimit, creditDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditDebt=" + creditDebt +
                '}';
    }


    @Override
    public void run() {
        CreditCard creditCard = new CreditCard("1234567890123456", "1234");
        creditCard.setCreditLimit(500);
        creditCard.deposit("1264", 500);
        creditCard.deposit("1234", 500);
        System.out.println(creditCard);
        creditCard.withdraw("124", 23432);
        creditCard.withdraw("1234", 2000);
        System.out.println(creditCard);
        creditCard.setCreditLimit(2000);
        creditCard.withdraw("1234", 1500);
        System.out.println(creditCard);
        creditCard.deposit("1234", 700);
        System.out.println(creditCard);
    }
}
