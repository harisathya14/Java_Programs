import java.util.*;
import java.util.Map.Entry;

public class max {


    public static void main(String[] args){

        int[] arr = {10,10,20,30,30,30,40,40,40,40};
        int maxx = maximum(arr);
        System.out.println(maxx);


    }

    public static int maximum(int[] arr){

        int max_count = 0 ;
        Map<Integer,Integer> hp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hp.containsKey(arr[i])){
                int freq = hp.get(arr[i]);
                freq++;
                hp.put(arr[i],freq);
            }
            else{
                hp.put(arr[i],1);
            }

        }
        /*int res = 0;
        for(Entry<Integer, Integer> val : hp.entrySet()){
            if(max_count< val.getValue()){
                res = val.getKey();
                max_count = val.getValue();
            }

            
        }*/
        
        return 0;

    }
    
}
