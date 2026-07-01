package day8;

public class pblm15 {
    public static void main(String[] args) {
        //String compression
        String str="aabbbcc";
        String result="";
        int count=1;
        
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                result +=str.charAt(i);
                result +=count;
                count=1;
            }

        }
        System.out.println(result);
    }
    
}
