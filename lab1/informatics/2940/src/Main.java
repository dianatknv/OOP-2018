import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scn = new Scanner(System.in);

    int v = scn.nextInt();
    int t = scn.nextInt();
    int s = v * t;

    if(s < 0 && s % 109 != 0){
            System.out.println(109 -(-1 * (s % 109)));
        } else if(s % 109 == 0) {
            System.out.println(0);
        } else {
            System.out.println(s % 109);
        }
    }
}
