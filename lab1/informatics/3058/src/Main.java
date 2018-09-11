import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        for (int i = 2; i <= a; ++i) {
            if (a % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}
