import java.util.*;
public class exer10 {
    public static int eligibleForVote(int a){
        if(a>=18){
            System.out.print("eligible for vote");
        }
        else if (a<=0) {
            System.out.println("please ! enter correct age");
        }
        else{
            System.out.println("not eligible for vote");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age : ");
        int a = sc.nextInt();
        eligibleForVote(a);
    }
}