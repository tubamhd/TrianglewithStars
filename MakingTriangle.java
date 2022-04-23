import java.util.Scanner;

public class MakingTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       /* System.out.println("Enter Number to Make Triangle:  ");
        int no = input.nextInt();*/

        /*int n = 5;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }*/

        int n = 5;
        for(int i = 0; i<n;i++){
            for(int c = 0; c<(n-i);c++){
                System.out.print(" ");
            }
            for(int x = 0; x<(1+i*2);x++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
