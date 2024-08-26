public class program1 {

    public static void main(String[] args) {
        int[] arr = { 10, 41, 18, 50, 43, 31, 29, 59, 96, 67 };
        int[] list = new int[arr.length];
        int a = findRepArray(arr, list);
        System.out.print(a);
    }

    static int findRepArray(int[] arr, int[] list) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 2; j < arr.length / 2; j++) {
                if (arr[i] % j == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                list[i] = arr[i];
            }
        }

        int max = list[0], sum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] != max) {
                sum += list[i];
            }
        }

        // System.out.println(sum);
        return sum;
    }
}
