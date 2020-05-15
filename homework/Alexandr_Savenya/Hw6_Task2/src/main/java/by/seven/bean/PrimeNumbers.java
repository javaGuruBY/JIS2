package by.seven.bean;

import java.io.Serializable;

public class PrimeNumbers implements Serializable {
    public static void main(String[] args) {
        boolean primeNum = true;
        int  count = 0;
        int sum = 0;
        for (int n = 2; n <= 500; n++){
            primeNum =true;
            if (count == 50 ){
                break;
            }
            for (int j = 2; j < n; j++) {
                if (n % j == 0|| n == 17 || n == 71) {
                    primeNum = false;
                    break;
                } else {
                    continue;
                }
            }
            if (primeNum == true) {
                count++;
                sum += n;


            }
            System.out.println(" sum =" + sum +"\n count =" + count);
        }

    }
}





