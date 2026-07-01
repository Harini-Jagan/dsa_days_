package day6;

public class pblm11 {
    //first non repeating char in  String
    
    public static void main(String[] args) {
        String str="swiss";
        int[] freq=new int[256];
         for(int i=0;i<str.length();i++)
{
     freq[str.charAt(i)]++;

}
    for(int j=0;j<str.length();j++){
        if(freq[str.charAt(j)]==1){
             System.out.println(str.charAt(j));
             break;
        }
    }

}
    
}
