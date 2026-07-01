package day7;
//https://www.canva.com/design/DAHBBoCRPi8/nzDMF1EGFgGH8tvGRYlb9g/edit?utm_content=DAHBBoCRPi8&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton

public class pblm12 {
    public static void main(String[] args) {
        //count vowels & consonants
        String str="Hello World";
        int vowels=0;
        int consonants=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<+'z'){
            if(ch=='a' || ch=='e'|| ch=='e'|| ch=='e'|| ch=='e'){
                vowels++;
            }
            else{
                consonants++;
            }
            }
        }
        System.out.println("Vowels :" +vowels);
        System.out.println("Consonants :" +consonants);
    }
    
}
