public class snake {
    public static void main(String[] args) {
        int n = 4;
        int start = 1, end = n;
        for (int i = 1; i <= n / 2; i++) {
            while (start <= end) {
                System.out.print(start++ + " ");
            }
            System.out.println();
            end += n;
            while (end >= start) {
                System.out.print(end-- + " ");
            }
            end += n * 2;
            start += n;
            System.out.println();
        }
    }

}
