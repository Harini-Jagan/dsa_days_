package day6;

public class pblm12 {
    //Reverse each word
    public static void main(String[] args) {
        String str="Java is fun";
        String[] words=str.split("");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";
        for(int j=word.length()-1;j>=0;j--){
            rev=rev+word.charAt(i);

        }
        words[i]=rev;


        }
        for(int i=0;i<str.length();i++){
            System.out.println(words + "");
        }
        
    }
    
}
