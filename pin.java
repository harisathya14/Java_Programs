import java.util.*;

class pin
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        int a[] = {input1,input2,input3};

        int b[] = new int[10];
        int i,max=0,x,y,z,res=0,temp;

        int u[] = new int[3];
        int h[] = new int[3];
        int t[] = new int[3];

        for(i=0;i<3;i++){
            u[i]=a[i]%10;
            temp=a[i]/10;
            t[i]=temp%10;
            h[i]=a[i]/100;
        }

        for(i=0;i<3;i++){
            while(a[i]>0){
                b[a[i]%10]=1;
                a[i]/=10;
            }
        }

        for(i=9;i>=0;i--){
            if(b[i]==1){
                max=i;
                break;
            }
        }
        x=min(u);
        y=min(t);
        z=min(h);
        res = max*1000+z*100+y*10+x;
        System.out.println(res);


    }

    static int min(int c[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<c.length;i++){
            if(min>c[i]){
                min=c[i];
            }
        }
        return min;
    }
}