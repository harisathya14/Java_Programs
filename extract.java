
public class extract {
    public static void main(String[] args) {
        String s = "a10b11c213";
        String n = "";

        char d = ' ';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                d = s.charAt(i);
            } else {
                if ((s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9)) {
                    n += s.charAt(i);
                    if (i == s.length() - 1) {
                        decompress(d, n);
                        break;
                    }
                    if (s.charAt(i + 1) >= 'a') {
                        decompress(d, n);
                        n = "";
                        continue;
                    }

                }
            }
        }

    }

    static void decompress(char c, String n) {
        int a = Integer.parseInt(n);
        for (int i = 0; i < a; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
