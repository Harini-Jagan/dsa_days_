package day2;

public class pblm5 {
    public static void main(String[] args) {
        //Reverse a number
        int num=242456;
        int rev=0;
        while(num>0){
           int rem=num%10;
            num/=10;
            rev=rev*10+rem;

        }
        System.out.println(rev);
    }
    
}
