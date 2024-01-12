public class pattern8 {

    public static void main(String[] args) {
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num+1; //add 1 in num variable
            }
            System.out.println();
        }
    }
}