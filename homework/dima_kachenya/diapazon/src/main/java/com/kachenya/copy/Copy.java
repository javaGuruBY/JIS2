package com.kachenya.copy;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class Copy {
    public static int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[]out;
        List<Integer> myOut=new ArrayList();
        for (int i=0;i<in.length;i++){
         if(in[i]>=leftBound&&in[i]<=rightBound){
             myOut.add(in[i]);
         }
        }
        out=new int[myOut.size()];
        for(int i=0; i<myOut.size();i++){
            out[i]=myOut.get(i);
        }
        return out;


    }
}
