import java.util.*;
public class exercisefun2 {

    public static int sumOfOddNum(int n){
        int a=0;
        for(int i=1;i<=n;i=i+2){
            a=a+i;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sumOfOddNum(n);
        System.out.print(k);
    }
}