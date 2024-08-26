import java.util.Arrays;

import java.util.*;
class strtt
{
public static void main(String[] args) {

    int[] inputArray = new int[] {1, 2, 3, 4, 5};
    int siblingsToFindOf = 1;
    int[] results = findSiblings(inputArray.length, inputArray, siblingsToFindOf);

    System.out.println(Arrays.toString(results));

}

public static int[] findSiblings(int input1, int[] input2, int input3) {
    int[] result = new int[] {-1};
    if (input2[0] == input3) {
        return result;
    }

    int siblingFindIndex = -1;
    for(int i=0;i<input2.length;i++){
        if(input2[i]==input3) { 
        siblingFindIndex = i;
        break;
        }
    }
    if(siblingFindIndex>-1){ 
        result = new int[]{input2[siblingFindIndex-1],input2[siblingFindIndex+1]}; 
         
    }

    return result;

}
}