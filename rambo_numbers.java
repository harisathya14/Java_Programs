import java.util.*;
public class rambo_numbers {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int div = sc.nextInt();
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        for(int i = num1;i<=num2;i++){

            if(i<0){
                continue;
            }
            else{
                if(i%div == 0)
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
