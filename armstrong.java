public class armstrong {

    public static void main(String[] args){
        int num = 153;
        if(isArm(num)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }


    }
    static boolean isArm(int n){
        int temp,digits=0,last=0,sum=0;
        temp = n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }

        temp = n;

        while(temp>0){
            last = temp % 10;
            sum+= (Math.pow(last,digits));
            temp/=10;
        }

        if(n==sum){
            return true;
        }
        else{
        return false;}

    }
}
