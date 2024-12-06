import java.util.*;
public class star{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<5;i++)
        {
        for(int j=i;j<5;j++)
        {
        System.out.print("*");
        }
        System.out.println();
       }
    }
}