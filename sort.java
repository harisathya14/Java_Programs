import java.util.*;

public class sort {

    public static void main(String[] args) {
        int[][] arr = { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } };

        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }

        System.out.println(Arrays.deepToString(arr));
    }

}
