import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       Scanner scn = new Scanner(System.in);
       Solver slvr = new Solver();
       int num = scn.nextInt();
       System.out.println(slvr.inWords(num));
    }
}
