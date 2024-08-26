import java.util.*;

public class next_larger{
    public static void main(String[] args){
        int[] arr = {8,4,1,9,6,2,10};
        Arrays.sort(arr);
        int size = arr.length;
        for(int i=0;i<arr.length;i++){
            if(i==size-1){
                System.out.print(arr[i]+"--->");
            }
            else{
                System.out.print(arr[i]+"--->"+arr[i+1]+",");
            }
        }
    }
}