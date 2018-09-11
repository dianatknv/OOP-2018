import java.util.Scanner;

class StarTriangle{
     int width;

    StarTriangle(int width){
        this.width = width;
    }

    public void toString(int width)
    {
        int i, j;

        // outer loop
        for(i = 0; i < width; i++)
        {
            //  inner loop
            for(j = 0; j <= i; j++)
            {
                System.out.print("[*] ");
            }
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        StarTriangle small = new StarTriangle(20);
        small.toString(small.width);

    }
}
