package day3;

public class pblm6 {
    public static void main(String[] args) {
        //move 0 to end using array
        int[] arr={1,4,0,3,2,0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for(int x:arr){
            System.out.println(x+"");
        }



    }
    
}
