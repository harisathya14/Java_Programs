import java.util.ArrayList;

public class subarray_sum {

    public static void main(String[] args){
        int arr[] ={10,2,1,4,5,7,11};
        int sum = 12;
        ArrayList<Integer> l = subarray(arr, arr.length, sum);
        System.out.println(l);

    }

    static ArrayList<Integer> subarray(int[] arr,int n,int sum){
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        int curr=0;
        int left = 0,right = 0;
        for(i=0;i<n;i++){
            if(curr==sum){
                break;
            }
            else if(curr<sum){
                curr+=arr[left];
                left++;
            }
            else if(curr>sum){
                curr-=arr[right];
                right++;
            }
        }

        for(i=right;i<left;i++){
            list.add(i,arr[i]);
        }
        return list;
    }
    
}
