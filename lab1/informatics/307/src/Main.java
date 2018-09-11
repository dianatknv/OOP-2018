import java.util.Scanner;

public class Main {

    static double f(double a, int n){
        return Math.pow(a, n);
    }


    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        double a = scn.nextDouble();
        int n = scn.nextInt();


        System.out.print(f(a, n));

    }
}
 