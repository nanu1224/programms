import java.util.*;
public class exer5 {

    public static int findPower(int x,int n){
        int c=1;
        for(int i=1;i<=n;i++)
        {
           c=c*x;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int x = sc.nextInt();
        System.out.println("enter the power :");
        int n = sc.nextInt();
        int h =findPower(x, n);
        System.out.print("the number :");
        System.out.println(h);
    }
}