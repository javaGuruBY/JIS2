package acya.ki.creditCard.bean;

import java.io.Serializable;
import java.util.Scanner;

public class CreditCard implements Serializable, Runnable {
    private int cardNumber;
    private int cardPinCod;
    private double cardBalance;
    private double creditLimit;
    private double creditDebt;

    public CreditCard() {
    }

    public CreditCard(int cardNumber, int cardPinCod) {
        this.cardNumber = cardNumber;
        this.cardPinCod = cardPinCod;
        this.cardBalance = 0;
        this.creditDebt = 0;
        this.creditLimit = 0;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardPinCod() {
        return cardPinCod;
    }

    public void setCardPinCod(int cardPinCod) {
        this.cardPinCod = cardPinCod;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", cardPinCod=" + cardPinCod +
                ", cardBalance=" + cardBalance +
                ", creditLimit=" + creditLimit +
                ", creditDebt=" + creditDebt +
                '}';
    }

    public void deposit() {
        System.out.println("Input Pin cod: ");
        Scanner scanner = new Scanner(System.in);
        int pinCodForDeposit = scanner.nextInt();
        if (pinCodForDeposit == cardPinCod) {
            System.out.println("Input amount to be credited: ");
            double depositAmount = scanner.nextDouble();
            if (creditDebt == 0) {
                cardBalance = cardBalance + depositAmount;
            } else if (creditDebt < 0 && creditDebt + depositAmount <= 0) {
                creditDebt = creditDebt + depositAmount;
            } else if (creditDebt < 0 && creditDebt + depositAmount > 0) {
                depositAmount = creditDebt + depositAmount;
                creditDebt = creditDebt - creditDebt;
                cardBalance = cardBalance + depositAmount;

            }
            System.out.println("Credit debt = " + creditDebt);
            System.out.println("Credit limit = " + creditLimit);
            System.out.println("Card balance = " + cardBalance);

        } else {
            System.out.println("Wrong pin cod!!!");
        }

    }
    public void withDraw() {

        System.out.println("Input Pin cod: ");
        Scanner scan = new Scanner(System.in);
        int pinCod = scan.nextInt();
        if (pinCod == cardPinCod) {
            System.out.println("Input the desired amount: ");
            double desiredAmount = scan.nextDouble();
            if(creditLimit + (creditDebt - (desiredAmount - cardBalance)) < 0){
                System.out.println("Credit limit exceeded!");
            } else if (cardBalance - desiredAmount < 0){
                desiredAmount = desiredAmount - cardBalance;
                cardBalance = cardBalance - cardBalance;
                creditDebt = creditDebt - desiredAmount;
                System.out.println("Card Balance = " + cardBalance);
                System.out.println("Credit debt = " + creditDebt);
                System.out.println("Credit limit = " + creditLimit);
            } else if (cardBalance - desiredAmount >= 0){
                cardBalance = cardBalance - desiredAmount;
                System.out.println("Withdrawal of funds from the balance were successful. Card balance = " + cardBalance);
            }

        } else {
            System.out.println("Wrong pin cod!!!");
        }


    }

    @Override
    public void run() {

        CreditCard visa = new CreditCard(12345678, 1234);
        visa.setCreditLimit(400);
        visa.setCardBalance(100);
        System.out.println(visa);
        visa.withDraw();
        System.out.println(visa);
        visa.deposit();
        visa.withDraw();
        visa.withDraw();
    }
}
