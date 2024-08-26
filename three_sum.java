import java.util.*;


public class three_sum {

    public static void main(String[] args){


        int[] arr = {1,2,3,4,6,5};
        int X = 7;
        int n = arr.length;
        int l,r;
        Arrays.sort(arr);

        for(int i=0;i<n;i++){

            l = i+1;
            r=n-1;

            while(l<r){
                if(arr[i]+arr[l]+arr[r]==X){
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                    l++;
                    r--;
                }
                else if(arr[i]+arr[l]+arr[r]<X){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        
    }
    
}
