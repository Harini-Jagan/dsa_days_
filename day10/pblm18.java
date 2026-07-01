package day10;
import java.util.Scanner;
public class pblm18 {
    public static void main(String[] args) {
        //subarray with given sum(positive numbers)
        Scanner sc=new Scanner(System.in);
        int[] arr={12,8,9,60};
        int left=0;
        int sum=0;
        System.out.print("Enter a number: ");
        int target=sc.nextInt();
        for (int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                System.out.println("Subarray found " + left + " at " + right);
            }
        }
        System.out.println("No subarray found");
        sc.close(); 
    }
    
}
