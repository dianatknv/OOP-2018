import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        for(int i = 1; i <= b; ++i){
            if(i * i >= a && i * i <= b)
                System.out.print(i * i + " ");
        }

    }
}
