import java.util.*;
public class four_sum {

    public static void main(String[] args){
        int[] arr = {2,2,2,2,2};
        int n = arr.length;
        int X = 8;
        int l,r;

        Arrays.sort(arr);


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                l = j+1;
                r=n-1;


                while (l<r){
                    if(arr[i]+arr[j]+arr[l]+arr[r] == X){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[l]+" "+arr[r]);
                        l++;
                        r--;
                    }
                    else if(arr[i]+arr[j]+arr[l]+arr[r] < X){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
    }
    
}
