class pattern_rep {
    public static void main(String[] args) {
        // String input = "aaaaaaa";
        // String pattern = "aa";
        // String input = "aaabbbXXaaccdfd";
        // String pattern = "aa";

        // String input = "abcdeffdfegabcabc";
        // String pattern = "abc";
        /*
         * String input = "aaaabbbaa";
         * String pattern = "aa";
         * int i = 0;
         * boolean check = false;
         * while (i < input.length() && i + pattern.length() <= input.length()) {
         * if (input.substring(i, i + pattern.length()).equals(pattern)) {
         * if (check) {
         * input = input.substring(0, i) + input.substring(i + pattern.length(),
         * input.length());
         * // System.out.println(input);
         * } else {
         * input = input.substring(0, i) + 'X' + input.substring(i + pattern.length(),
         * input.length());
         * // System.out.println(input);
         * check = true;
         * }
         * 
         * } else if (check) {
         * check = false;
         * }
         * i++;
         * }
         * System.out.println(input);
         */

        String str = "abcdeffdfegabcabc";
        String pattern = "abc";
        int count = str.length() / pattern.length();
        while (str.contains(pattern)) {
            String rep = pattern.repeat(count);
            str = str.replace(rep, "X");
            //System.out.println(str);
            //count -=pattern.length();
            count -=1;
        }
        System.out.println(str);

        
        


    }
}