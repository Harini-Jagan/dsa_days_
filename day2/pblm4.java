package day2;

public class pblm4 {
    public static void main(String[] args) {
        //Reverse an array
        int[] arr={12,33,54,54,34};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        for(int x:arr){
            System.out.println(x+"" );
        }
    }
    
}
