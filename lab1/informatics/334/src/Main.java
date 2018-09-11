import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();

        for(int i = a; i <= b; ++i){
            if(i % d == c){
                System.out.print(i + " ");
            }
        }

    }
}