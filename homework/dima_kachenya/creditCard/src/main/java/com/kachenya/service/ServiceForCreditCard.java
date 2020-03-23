package com.kachenya.service;

import com.kachenya.bean.CreditCard;


public class ServiceForCreditCard {
    private CreditCard creditCard;

    public ServiceForCreditCard() {
        creditCard = new CreditCard();
    }

    public ServiceForCreditCard(String numberOfCard, String pinCode) {
        creditCard = new CreditCard(numberOfCard, pinCode);
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void deposit(double money, String pinCode) throws Exception {
        if (equalOfPinCode(pinCode)) {
            double rest = whatchCreditLimitForDeposit(money);
            creditCard.setBalance(creditCard.getBalance()+rest);
        } else {
            System.out.println("Отказано в доступею.Пароли не совпадают");
        }
    }

    private double whatchCreditLimitForDeposit(double money) throws Exception {
        double defference = money - creditCard.getLoanDebt();
        if (defference == 0) {
            creditCard.setLoanDebt(0);
            return 0;
        } else if(defference>0){
            creditCard.setLoanDebt(0);
            return defference;
        }else if(defference<0){
            creditCard.setLoanDebt(creditCard.getLoanDebt()-money);
            return 0;
        }else{
            throw new Exception("Я ваще не знаю что произошло");
        }
    }

    public void withdraw(double money, String pinCode) throws Exception {
        if (equalOfPinCode(pinCode)) {
            takeMoney(money);
        } else {
            System.out.println("Отказано в доступе.Пароли не совпадают");
        }
    }

    private void takeMoney(double money) throws Exception {
        if (money > creditCard.getBalance()) {
            whatchCreditLimit(money);
        } else {
            creditCard.setBalance(creditCard.getBalance() - money);
        }
    }

    private void whatchCreditLimit(double money) throws Exception {
        double difference = money - creditCard.getBalance();
        if (difference < creditCard.getCreditLimit()) {
            equalCreditLimitAndLoanDebtAndWithdrawMoney(difference);
        } else {
            System.out.println("Отказано в доступе.Увеличте кредитный лимит.");
        }
    }

    private void equalCreditLimitAndLoanDebtAndWithdrawMoney(double defference) throws Exception {
        double summDefferenceWhithLoanDebt = defference + creditCard.getLoanDebt();
        if (summDefferenceWhithLoanDebt > creditCard.getCreditLimit()) {
            System.out.println("Ваш крдетный лимит недостаточно большой. Отказ в доступе");
        } else {
            creditCard.setBalance(0);
            creditCard.setLoanDebt(summDefferenceWhithLoanDebt);
        }
    }

    private boolean equalOfPinCode(String pinCode) {
        if (pinCode.equals(creditCard.getPinCode())) {
            return true;
        } else {
            return false;
        }
    }
}
