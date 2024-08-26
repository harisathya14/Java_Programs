public class sum_of_digits {

    public static int sum(int n)
    {
        int temp=n;
        int sum=0;int dig=0;
        
        while(temp!=0)
        {
         dig=temp%10;
         sum+=dig;
         temp=temp/10;
        }

        int sum1=sum;
        int len=0;

        while(sum!=0)
        {
            len++;
            sum/=10;
        }

        if(len!=1)
        {
            sum1=sum(sum1);
        }
    
    return sum1;
    }


	public static void main(String[] args) {
	    int n=1234;
	    int ans=sum(n);
	    System.out.println(ans);
	}
}
    

