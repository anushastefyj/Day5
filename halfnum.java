import java.util.*;
public class halfnum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<t;i++)
        {
        for(int j=i;j<t;j++)
        {
        System.out.print(j+" ");
        }
        System.out.println();
       }
    }
}
