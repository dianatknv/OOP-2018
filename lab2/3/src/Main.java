import java.util.Scanner;
class Data {
    Data() {}
    private double average;
    private double Max;
    private int cnt;

    public void setMax(double m) {
        if (m >= Max) {
            Max = m;
        }
    }
    public double maxData(){
        return Max;
    }
    public void counter(double m){
        cnt++;
        average+=m;
    }
    public double averageData(){
        average=average/cnt;
        return average;
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Enter number (Q to quit): ");
        Scanner scn = new Scanner(System.in);
        Data d = new Data();

        String s = scn.next();
        if(s.equals("Q")){
            System.out.println("Average = 0.0");
            System.out.println("Maximum = 0.0");
        }
        d.maxData();
        while(!s.equals("Q")){
            System.out.print("Enter number (Q to quit): ");
            d.setMax(Double.parseDouble(s));
            d.counter(Double.parseDouble(s));
            s = scn.next();
        }
        System.out.println("Average = "+d.averageData());
        System.out.println("Maximum = "+d.maxData());
    }
}