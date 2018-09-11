import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int k = 1;
        while (k <= a){
            System.out.print(k + " ");
            k = k * 2;
        }
    }
}