public class pattern {
    public static void main(String[] args) {
        int n = 8;
        for(int i=1;i<=n;i++){

            
            for(int j=1;j<=i;j++){
                if(i==2 && j==1)
                System.out.print(j+" "+" "+" ");
                else{
                    System.out.print(j+" ");
                } }
             int k = i-1;
            for(int j=k;j>0;j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        
        
    }
    
}
