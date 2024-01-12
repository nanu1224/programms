import java.util.*;
public class pattern1 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
     for(int i =1;i<=n;i++)
      {
        for (int a=1;a<=m;a++)
        {
           System.out.print("*"+"  ");
        }
        System.out.println();
      }
    }
}