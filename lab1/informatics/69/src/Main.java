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

        for(int i = 0; i < a.length / 2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
    }
}
