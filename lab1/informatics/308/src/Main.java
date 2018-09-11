import java.util.Scanner;

public class Main {

    static int Xxor(int x, int y){
        return x^y;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();


        System.out.print(Xxor(a, b));

    }
}
 