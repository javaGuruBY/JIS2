package com.kachenya;

import com.kachenya.service.ServiceForCreditCard;

public class Main {
    public static void main(String[] args) throws Exception {
        ServiceForCreditCard myCard=new ServiceForCreditCard("6467041946153399", "1234");

        myCard.getCreditCard().setCreditLimit(500.0);

        myCard.deposit(150.0, "1234");
        myCard.withdraw(50.0, "1234");

        myCard.deposit(500.0, "4321");
        myCard.withdraw(5000, "1234");

        myCard.getCreditCard().setCreditLimit(7500.0);

        myCard.withdraw(5000, "1234");


    }
}
