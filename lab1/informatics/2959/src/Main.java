import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scn = new Scanner(System.in);

    int x = scn.nextInt();
    if(x > 0){
        System.out.println(1);
    }else if(x < 0){
        System.out.println(-1);
    }else if(x == 0){
        System.out.println(0);
    }
    }
}
