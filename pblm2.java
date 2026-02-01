package day1;
public class pblm2 {
  public static void main(String[] args) {
    //Find the largest number using array
    int[] arr={13,98,334,78,999};
    int largest=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
       System.out.println("The largest num : "+largest);
    }

  }}