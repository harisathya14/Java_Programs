import java.util.Scanner;
public class reverse {
    //public static int palindrom(String str)
   // {

    //}
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        n=sc.nextInt();
        sc.close();
        String[] str=new String[n];
        int i;
        for(i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        for(i=0;i<n;i++)
        {String rev=" ";
        
         char[] ch=str[i].toCharArray();
           for(int j=ch.length-1;j>=0;j--)
           {
            rev+=ch[j];
            System.out.print(rev+" ");
           }
           if(rev.equals(str[i]))
           {
               System.out.println("palindrome"+rev);
           }
           
        }
        
    }
}