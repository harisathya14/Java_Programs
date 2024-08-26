class Solution {
    public static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    public static int maxProduct(int[] arr) {
     int max=arr[0];
     int prod=1;
		for(int i=0;i<arr.length;i++)
		{prod=1;
		    for(int j=i;j<arr.length;j++)
		    {
		        prod*=arr[j];
		        max=max(max,prod);
		    }
		}
        return max;
        
    }

    public static void main(String[] args){
        int[] arr = {0,2};
        int maximum = maxProduct(arr);
        System.out.println(maximum);
    }
}