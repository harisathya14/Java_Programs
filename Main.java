import java.util.*;

class Main {
    public static void compress(String ch, int num) {
        int c = 0;
        while (c <= num) {
            System.out.print(ch.charAt(0));
            c++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = "a4b11";
        int i;
        int num = 0;
        String ch1 = "";
        for (i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                ch1 += Character.toString(str.charAt(i));
            } else if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
                num = num * 10 + (int) str.charAt(i);
                if ((str.charAt(i + 1) >= 'a' && str.charAt(i + 1) <= 'z') || i + 1 == str.length()) {
                    compress(ch1, num);
                    ch1 = " ";
                    num = 0;
                    break;
                }
            }
            sc.close();
        }

    }
}