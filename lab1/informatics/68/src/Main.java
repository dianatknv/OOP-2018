import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scn.nextInt();
        }

        int k = 0;
        for (int i = 1; i < n - 1; i++) {
            if(a[i] > a[i-1] && a[i] > a[i+1]){
                k++;
            }
        }
    System.out.print(k);
    }
}
