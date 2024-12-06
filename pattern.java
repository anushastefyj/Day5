import java.util.*;
public class pattern{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        for(int j=i;j<t;j++)
        {
        System.out.print(j+" ");
        }
        System.out.println();
       }
    }
}