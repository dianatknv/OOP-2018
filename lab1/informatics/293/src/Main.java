import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a > b){
            System.out.println(1);
        }if(a < b){
            System.out.println(2);
        }else if(a == b){
            System.out.println(0);
        }
    }
}
