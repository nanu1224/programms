import java.util.*;
public class twodarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int[][] ok = new int[a][b];
        for(int k =0;k<a;k++){
            for(int m=0;m<b;m++){
                ok[k][m]= sc.nextInt();
            }
        }
        for(int k =0;k<a;k++){
            for(int m=0;m<b;m++){
                System.out.print(ok[k][m] + " ");
            }
            System.out.println();
        }   
    }
}