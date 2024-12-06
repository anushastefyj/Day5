import java.util.*;
public class reverse{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        int n=sc.nextInt();
        int reverse=0;
        while(n>0)
        {
        int digit=n%10;
        n=n/10;
        reverse=reverse*10+digit;
        }
    System.out.println(reverse);
    }
    
    }
}