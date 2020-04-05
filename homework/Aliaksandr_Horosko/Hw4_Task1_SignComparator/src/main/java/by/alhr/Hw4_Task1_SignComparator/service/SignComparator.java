package by.alhr.Hw4_Task1_SignComparator.service;

import by.alhr.Hw4_Task1_SignComparator.bean.Number;

public class SignComparator implements Runnable {

    public String compere(Number number) {
        if (number.getNumber() > 0) {
             System.out.println("Number is positive" + " ("+number.getNumber()+") ");
        } else if (number.getNumber() < 0) {
             System.out.println("Number is negative" + " ("+number.getNumber()+") ");
        } else if (number.getNumber() == 0) {
             System.out.println("Number is equal to zero" + " ("+number.getNumber()+") ");
        }
        return null;
    }
        @Override
        public void run () {
            Number number = new Number(-12);

            SignComparator signComparator = new SignComparator();
            signComparator.compere(number);
        }
    }

