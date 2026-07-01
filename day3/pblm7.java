package day3;

public class pblm7 {
    public static void main(String[] args) {
        //find missing number
        int[] arr={1,2,4,5,6,20};
        int n=20;
        int arraysum=0;
        int totalsum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            arraysum+=i;
        }
        int missing=totalsum-arraysum;
        System.out.println(missing);
    }
    
}
