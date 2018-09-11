import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int k = 1;
        while(k <= x){
            if(k == x){
                System.out.print("YES");
                break;
            }
            k = k * 2;
        }
        if(k != x){
            System.out.print("NO");
        }
    }
}