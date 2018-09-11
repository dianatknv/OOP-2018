import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scn = new Scanner(System.in);
    int y = scn.nextInt();
    if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
    }
}
