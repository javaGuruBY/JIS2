package by.seven.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable, Runnable {
    private int cardNum;
    private int cardPinCod;
    private double cardBalance;
    private double creditLimit;
    private double creditDebt;



    public CreditCard() {
    }

    public CreditCard(int cardNum, int cardPinCod) {
        this.cardNum = cardNum;
        this.cardPinCod = cardPinCod;
        this.cardBalance = 0;
        this.creditLimit = 0;
        this.creditDebt = 0;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(that.cardBalance, cardBalance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.creditDebt, creditDebt) == 0 &&
                Objects.equals(cardNum, that.cardNum) &&
                Objects.equals(cardPinCod, that.cardPinCod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNum, cardPinCod, cardBalance, creditLimit, creditDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNum='" + cardNum + '\'' +
                ", cardPinCod='" + cardPinCod + '\'' +
                ", cardBalance=" + cardBalance +
                ", creditLimit=" + creditLimit +
                ", creditDebt=" + creditDebt +
                '}';
    }

    public void deposit() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int amount;
        int pin;
        System.out.println("Введите пин-код");

        pin = Integer.parseInt(bufferedReader.readLine());
        System.out.println(pin);
        if (pin == this.cardPinCod) {
            System.out.println("Введите желаймую сумму, которую хотите внести:");
            amount = Integer.parseInt(bufferedReader.readLine());
            if (0 < amount) {
                if (this.creditDebt == 0) {
                    cardBalance += amount;
                } else if (creditDebt < 0 && creditDebt + amount <= 0) {
                    creditDebt += amount;
                } else if (creditDebt < 0 && creditDebt + amount > 0) {
                    creditDebt += amount;
                    cardBalance += creditDebt;
                    creditDebt = 0;
                }
                System.out.println("Ваш баланс составляет:" + cardBalance );
                System.out.println("Ваша задолженность составляет:" + creditDebt );
            }
        } else {
            System.out.println("Неверный пин-код");
        }

    }
    public void withdraw() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int amount;
        int pin;
        System.out.println("Введите пин-код");
        pin = Integer.parseInt(bufferedReader.readLine());
        System.out.println(pin);
        if (pin == this.cardPinCod) {
            System.out.println("Введите желаймую сумму, которую хотите снять:");
            amount = Integer.parseInt(bufferedReader.readLine());
            if (amount <= creditLimit) {
                if (cardBalance >= amount) {
                    cardBalance -= amount;
                } else if (cardBalance < amount ) {
                    amount -= cardBalance;
                    cardBalance -= cardBalance;
                    creditDebt -= amount;
                    System.out.println("Ваш баланс :" + cardBalance);
                }
            } else {
                System.out.println("Превышен кредитный лемит");
            }

        } else {
            System.out.println("Неверный пин-код");
        }

    }

    @Override
    public void run() {
        CreditCard visa = new CreditCard(12121212,1234);
        visa.setCreditLimit(5000);
        visa.setCardBalance(0);
        visa.setCreditDebt(0);
        try {
            visa.deposit();
            visa.withdraw();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(visa);


    }
}
