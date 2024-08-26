
// input - a123b345c
// output 123 + 345 = 468
import java.util.*;

public class extract_numbers_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String n = "";
        int[] arr = new int[20];
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                n += s.charAt(i);

            } else {
                if (n.length() > 0) {
                    arr[j] = Integer.parseInt(n);
                    n = "";
                    j++;

                }
            }
        }
        if (n.length() > 0) {
            arr[j] = Integer.parseInt(n);
        }
        sc.close();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                break;
            else
                sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}