package day9;

public class pblm17 {
    //check if a string is rotation
    public static void main(String[] args) {
        String str1="abcd";
        String str2="cdab";
        if(str1.length()!=str2.length()){
            System.out.println("Not a Rotation");
        }
        else{
            String temp=str1+str2;
            if(temp.contains(str2)){
                System.out.println("Rotation");
            }
            else{
                System.out.println("Not a rotation");
            }
         }
    }
    
}
