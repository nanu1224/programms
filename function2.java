import java.util.*;
public class function2 {
    public static void printSum(int sum){
        System.out.println(sum);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int sum = a+b;
        printSum(sum);

    }
}