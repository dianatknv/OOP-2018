import java.util.Scanner;
public class task4_6{
    public static void main(String[] args){
 
        Scanner n = new Scanner(System.in);
 
        int k = n.nextInt();
 
        int [] a = new int[k];
 
        int cnt = 0;
 
        for(int i = 0; i < k; ++i){
            a[i] = n.nextInt();
        }
 
        for(int i = 1; i < k; ++i){
            if((a[i] > 0 && a[i-1] > 0) || (a[i] < 0 && a[i-1] < 0)){
                cnt++;
            }
        }
 
        if(cnt > 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
 
    }
}