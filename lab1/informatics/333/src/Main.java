import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        for(int i = a; i <= b; ++i){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

    }
}