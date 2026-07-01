package day4;

public class pblm8 {
    public static void main(String[] args) {
        //array sorted or not
        int[] arr={1,3,2,5,6};
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted)
            System.out.println("sorted");
        
        else
            System.out.println("unsorted");
        

    }
    
}
