public class count_digits {
    public static void main(String[] args){
        int n = 13; // output  = 17;
        int ans = 0;

        for(int i=1;i<=n;i++){
            String a = String.valueOf(i);
            int b = a.length();
            ans = ans + b;
        }
        System.out.println(ans);
    }
    
}
