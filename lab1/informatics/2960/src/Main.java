import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

        if( a == 1 && b == 1){
            System.out.println("YES");
        } else if(a != 1 && b != 1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
