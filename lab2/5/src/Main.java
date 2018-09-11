import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] doubleArray(int[] a){
        int[] n = new int[a.length * 2];
        for(int i = 0; i < a.length; ++i){
            n[2 * i] = a[i];
            n[2 * i + 1] = a[i];
        }
        return n;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(doubleArray(a)));
    }
}
