public class sorted_array_recursion{
    public static void main(String[] args){
        int[] arr = {1,23,67,71,6};
        boolean a = sort(arr, 0);
        System.out.println(a);

    }

    static boolean sort(int[] arr ,int i){
        if(i==arr.length-1){
            return true;
        }
        else if(arr[i]>arr[i+1]){
            return false;
        }
        else{
            return sort(arr, i+1);
        }
    }
}