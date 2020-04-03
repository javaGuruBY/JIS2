package acya.ki.service;

import acya.ki.bean.SignComporatorBean;

public class SignComporator {
    private SignComporatorBean signComporatorBean; //объявляю объект бин в поле класса сервис

    public SignComporator() { // пустой конструктор сервиса
    }


    public SignComporator(SignComporatorBean signComporatorBean) { //конструктор со значением сервиса
        this.signComporatorBean = signComporatorBean;
    }

    public String compare(SignComporatorBean signComporatorBean) {  //не кладу в скобки ничего, потому что создала конструктор
        if (signComporatorBean.getNumber() > 0) {
            return ("Number is positive");
        } else if (signComporatorBean.getNumber() < 0) {
            return ("Number is negative");
        } else {
            return ("Number = 0");
        }
    }
    public void result(SignComporatorBean signComporatorBean) {

        if (signComporatorBean.getNumber() > 0) {
            System.out.println("Number " + signComporatorBean.getNumber() + " is positive");
        } else if (signComporatorBean.getNumber() < 0) {
            System.out.println("Number " + signComporatorBean.getNumber() + " is negative");
        } else {
            System.out.println("Number " + signComporatorBean.getNumber() + " is equal to zero");
        }
    }

}

