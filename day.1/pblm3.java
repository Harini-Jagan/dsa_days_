package day.1;

public class pblm3 {
    public static void main(String[] args) {
       int[] arr={17,98,99,53};
       int largest=arr[0];
       int secondlargest=arr[0];
       for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest && arr[i]!=largest){
            secondlargest=arr[i];
        }
        System.out.println("i = "+i+" ,largest="+largest+" ,secondlargest="+secondlargest);
       } 
       System.out.println("Secondlargest num is : "+secondlargest);
       System.out.println("largest num is : "+largest);
    }
    
}
