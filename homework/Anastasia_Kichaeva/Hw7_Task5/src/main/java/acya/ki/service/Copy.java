package acya.ki.service;

import java.util.ArrayList;
import java.util.List;

public class Copy {
    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] out;
        List<Integer> outTemp = new ArrayList();
        for (int i = 0; i < in.length; i++){
            if(in[i] >= leftBound&&in[i] <= rightBound){
                outTemp.add(in[i]);
            }
        }
        out = new int[outTemp.size()];
        for(int i = 0; i < outTemp.size(); i++){
            out[i] = outTemp.get(i);
        }
        return out;
    }
}


