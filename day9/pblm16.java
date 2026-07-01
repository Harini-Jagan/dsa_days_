package day9;
public class pblm16 {
    public static void main(String[] args) {
        //longest substring without repeating characters
        String str="abcabac";
        int[] freq=new int[256];
        int i=0;
        int maxlength=0;
        for(int j=0;j<str.length();j++){
            freq[str.charAt(j)]++;

            while(freq[str.charAt(i)]>1){
                
            freq[str.charAt(i)]--;
            i++; }
            maxlength=Math.max(maxlength, j-i+1);}
        
System.out.println(maxlength);

    }
    
}
