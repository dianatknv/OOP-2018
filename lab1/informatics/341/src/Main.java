import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int k = 0;
        for(int i = 1; i <= x; ++i){
            if(x % i == 0) {
                k++;
            }
        }
        System.out.print(k);
    }
}
