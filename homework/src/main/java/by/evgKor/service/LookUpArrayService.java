package by.evgKor.service;

public class LookUpArrayService implements Runnable {
    @Override
    public void run() {
        int[] number = {12, 58, 45, 32, 10, 8};
        LookUpArrayService lookUpArrayService = new LookUpArrayService();
        lookUpArrayService.findMax(number);
        lookUpArrayService.findMin(number);
        lookUpArrayService.indexOfMax(number);
        lookUpArrayService.indexOfMin(number);
        lookUpArrayService.indexOf(number, 45);

    }

    public int findMax(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Max number= " + max);
        return max;
    }

    public int findMin(int[] number) {
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("Min number = " + min);
        return min;
    }

    public int indexOfMax(int[] number) {
        int idx = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[idx] < number[i]) {
                idx = i;
            }
        }
        System.out.println("Idx of max number = " + idx);
        return idx;
    }
    public int indexOfMin(int[] number){
        int idx=0;
        for(int i=0;i< number.length;i++){
            if(number[idx]>number[i]){
                idx=i;
            }
        }
        System.out.println("Idx of min = "+idx);
        return idx;
    }
    public int indexOf(int[] number, int value){
        int idx=0;
        for(int i=0; i<number.length; i++){
            if(number[i]==value){
                idx=i;
            }
        }
        System.out.println("Idx of value numb = "+idx);
        return idx;
    }

}
