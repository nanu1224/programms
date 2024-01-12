import java.util.*;
public class function3 {
    public static void findFactorial(int fac){
        System.out.println(fac);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int fac =1;
        for(int i=a;i>=1;i--)
        {
           fac=fac*i;
        }
        findFactorial(fac);

    }
}