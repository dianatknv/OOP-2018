import java.util.Scanner;

public class sixth {
        static String inWords(int a){
        String[] s={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] s1={"","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String res="";
        if(a==0) {
         return "zero";
        }
        if(a<20)
            res=s1[a];
        else if(a<100){
            res=s[a/10]+" "+s1[a%10];
        }
        else if(a<1000) {
            if(a%100<20) {
                if(a%100==0)
                    res = s1[a / 100] + " hundred";
                else
                res = s1[a / 100] + " hundred [and] " + s1[a % 100];
            }
            else
            res = s1[a / 100] + " hundred [and] " + s[(a / 10) % 10] + " " + s1[a % 10];
        }
        else if(a<10000) {
            if(a%100<20) {
                if(a%100==0)
                    res = s1[a / 1000] + " thousand " + s1[(a / 100) % 10] + " hundred";
                else
                res = s1[a / 1000] + " thousand " + s1[(a / 100) % 10] + " hundred [and] " + s1[a % 100];
            }
            else
            res = s1[a / 1000] + " thousand " + s1[(a / 100) % 10] + " hundred [and] " + s[(a / 10) % 10] + " " + s1[a % 10];
        }
        else if(a<100000) {
            if(a%100<20) {
                if(a%100==0)
                    res = s[a / 10000] + " " + s1[(a / 1000) % 10] + " thousand " + s1[(a / 100) % 10] + " hundred";
                else
                res = s[a / 10000] + " " + s1[(a / 1000) % 10] + " thousand " + s1[(a / 100) % 10] + " hundred [and] " + s1[a % 100];
            }
            else
            res = s[a / 10000] + " " + s1[(a / 1000) % 10] + " thousand " + s1[(a / 100) % 10] + " hundred [and] " + s[(a / 10) % 10] + " " + s1[a % 10];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println(inWords(input.nextInt()));
    }
}
