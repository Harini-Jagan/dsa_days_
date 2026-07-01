package day7;

public class pblm13 {
    //REmove duplicate characters from string
    public static void main(String[] args) {
        String str="programming";
        String result="";
        boolean[] seen=new boolean[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!seen[ch]){
                result+=ch;
                seen[ch]=true;

            }
        }
        System.out.println(result);
    }
    
}
