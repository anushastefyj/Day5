import java.util.*;
public class nested{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<t;i++)
        {
        for(int j=1;j<t;j++)
        {
        System.out.print(j+" ");
        }
        System.out.println();
       }
    }
}