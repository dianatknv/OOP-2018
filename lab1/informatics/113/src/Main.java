import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
        for(int i = 1; i <= a; i++){
            if(i * i <= a)
                System.out.print(i * i + " ");
        }

    }
}
