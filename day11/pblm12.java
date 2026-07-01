package day11;

import java.util.HashMap;

public class pblm12 {
    public static void main(String[] args) {
        //Two sum
        int[] arr={12,65,89,34};
        int target=101;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int needed=target-arr[i];
            if(map.containsKey(needed)){
                System.out.println("Indicies: "+map.get(needed)+ " , "+
            i);
            return;

            }
            map.put(arr[i], i);

        }
        System.out.println("no pair found");
    }
    
}
