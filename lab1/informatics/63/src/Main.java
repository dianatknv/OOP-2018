import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = scn.nextInt();
        }

        for(int i = 0; i < n; ++i){
            if(i % 2 == 0){
               System.out.print(a[i] + " ");
            }
        }
    }
}