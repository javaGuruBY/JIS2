package com.kachenya.bean;

import java.util.Objects;

public class CreditCard {
    private String numberOfCard;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard() {
    }

    public CreditCard(String numberOfCard, String pinCode) {
        this.numberOfCard = numberOfCard;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }

    public String getNumberOfCard() {
        return numberOfCard;
    }

    public void setNumberOfCard(String numberOfCard) throws Exception {
        for (int i=0;i<numberOfCard.length();i++) {
            if (numberOfCard.charAt(i) == '0' || numberOfCard.charAt(i) == '1' || numberOfCard.charAt(i) == '2' ||
                    numberOfCard.charAt(i) == '3' || numberOfCard.charAt(i) == '4' || numberOfCard.charAt(i) == '5' ||
                    numberOfCard.charAt(i) == '6' || numberOfCard.charAt(i) == '7' || numberOfCard.charAt(i) == '8' ||
                    numberOfCard.charAt(i) == '9') {
            }else{
                throw new Exception("Incorate Date in NumberOfCard");
            }
        }
        this.numberOfCard=numberOfCard;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) throws Exception {
        for (int i=0;i<pinCode.length();i++) {
            if (pinCode.charAt(i) == '0' || pinCode.charAt(i) == '1' || pinCode.charAt(i) == '2' ||
                    pinCode.charAt(i) == '3' || pinCode.charAt(i) == '4' || pinCode.charAt(i) == '5' ||
                    pinCode.charAt(i) == '6' || pinCode.charAt(i) == '7' || pinCode.charAt(i) == '8' ||
                    pinCode.charAt(i) == '9') {
            }else{
                throw new Exception("Incorate Date in PinCode");
            }
        }
        this.pinCode = pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws Exception {
        if(balance>=0) {
            this.balance = balance;
        }else {
            throw new Exception("Incorate Date");
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) throws Exception {
        if(creditLimit>=0) {
            this.creditLimit = creditLimit;
        }else{
            throw new Exception("Incorate Date");
        }
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(double loanDebt) throws Exception {
        if(loanDebt>=0) {
            this.loanDebt = loanDebt;
        }else {
            throw new Exception("Incorate Date in loanDebt");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.loanDebt, loanDebt) == 0 &&
                Objects.equals(numberOfCard, that.numberOfCard) &&
                Objects.equals(pinCode, that.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfCard, pinCode, balance, creditLimit, loanDebt);
    }

    @Override
    public String toString() {
        return  "numberOfCard=" + numberOfCard + "'\n" +
                ", pinCode='" + pinCode + "'\n" +
                ", balance=" + balance+" $\n" +
                ", creditLimit=" + creditLimit+" $\n" +
                ", loanDebt=" + loanDebt+" $\n"
                ;
    }
}

