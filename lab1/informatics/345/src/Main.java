import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = 0;

        for(int i = 1; i <= x; ++i){
            int j = scn.nextInt();
            if(j==0) {
                ++n;
            }
        }
        System.out.print(n);
    }
}
