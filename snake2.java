public class snake2 {
    public static void main(String[] args){
        int n = 4,a=1,b=n*2;
        int i,j;
        for(i=1;i<n;i++){
            for(j=n;j>0;j--){
                System.out.print(" "+" ");
            }
        }
        while(i%2!=0){
            for(j=n;j>0;j--){
                System.out.print(a+" ");
                a++;
            }
            a=b;
        }
        while(i%2==0){
            for(j=n;j>0;j--){
                    System.out.print(b+" ");
                    b--;
            }
            b = b+(a*2);
        }
        System.out.println();
    }
    
}
