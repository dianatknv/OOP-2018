import java.util.Scanner;

public class Main {

    static int func(int a, int b, int c, int d){
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        if(d < min)
            min = d;

        return min;
    }


    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();

        System.out.print(func(a,b,c,d));

        }
    }
