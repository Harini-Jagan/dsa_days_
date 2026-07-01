package day8;

public class pblm14 {
    public static void main(String[] args) {
        //check is a string a anagram
        String str1="listen";
        String str2="silent";
        if(str1.length()!=str2.length()){
            System.out.println("Not a Anagram");
            return;
        }
        int[] freq=new int[256];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]++;

        }
        for(int i=0;i<256;i++){
        if(freq[i]!=0){
            System.out.println("Not an anagram");
            return;

        }}
        System.out.println("Anagram");
    }
    
}
