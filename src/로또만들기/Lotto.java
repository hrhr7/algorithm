package 로또만들기;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<=45 ; i++){
            list.add(i);
        }
        int[] lotto = new int [6];
        for(int i =0; i< lotto.length; i++){
            int num = (int)(Math.random()*list.size());
            lotto[i] = list.get(num);
            list.remove(num);
        }
    }
}
