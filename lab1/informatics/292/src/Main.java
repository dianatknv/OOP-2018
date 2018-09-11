import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
