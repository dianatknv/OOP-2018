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

        int k = 0;
        for(int i = 0; i < n; ++i){
            if(a[i] > 0){
                k++;
            }
        }
        System.out.print(k);
    }
}