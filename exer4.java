import java.util.*;
public class exer4 {
    public static int findCircumfrence(int a){
        int b =2*(22/7)*a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println("enter the radius");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k =findCircumfrence(a);
        System.out.print("the circumference of circle = "+ k);
    }
}