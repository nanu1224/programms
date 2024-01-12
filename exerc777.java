import java.util.*;
public class exerc777 {
    public static double areaOfCircle(double a){
        double b = a*a*(3.14);
         System.out.print("area of circle : "+ b);
         return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius : ");
        double a = sc.nextInt();
        areaOfCircle(a);
    }
}