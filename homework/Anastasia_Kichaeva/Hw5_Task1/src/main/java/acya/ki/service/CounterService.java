package acya.ki.service;

import acya.ki.bean.CounterBean;

public class CounterService {
    private CounterBean counterBean;

    public CounterService() {
        counterBean = new CounterBean();
    }

    public CounterService(int value, int step) {
        counterBean = new CounterBean(step, value);
    }

    public CounterService(CounterBean counterBean) {
        this.counterBean = counterBean;
    }

    public CounterBean getCounterBean() {
        return counterBean;
    }

    public void setCounterBean(CounterBean counterBean) {
        this.counterBean = counterBean;
    }

    public void increment() {
        if(counterBean.getValue() + counterBean.getStep() <= 100){
            counterBean.setValue(counterBean.getValue() + counterBean.getStep());
        } else {
            System.out.println("Значение счетчика превысило 100");
        }
    }

    public void decrement() {
        if(counterBean.getValue() - counterBean.getStep() >=0){
            counterBean.setValue(counterBean.getValue() - counterBean.getStep());
        } else{
            System.out.println("Значение счетчика меньше нуля");
        }

    }

    public void clear() {
        counterBean.setValue(0);
        counterBean.setStep(1);
        System.out.println("Значение счетчика = 0 \nЗначение шага = 1");
    }
}
