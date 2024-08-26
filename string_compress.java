public class string_compress {
    public static void main(String[] args) {

        String a = "aabbcc";
        String ans = "";
        char[] chars = a.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char b = chars[i];
            int count = 0;
            if (chars[i] == b) {
                count++;
                if (i == chars.length) {
                    ans = ans + count + chars[i];
                }
                if (chars[i + 1] != b) {
                    ans = ans + count + chars[i];
                }
            } else {
                continue;
            }

        }
        System.out.println(ans);
    }

}