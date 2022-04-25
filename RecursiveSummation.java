package exam;

import java.util.Scanner;

public class RecursiveSummation {
    static int summation=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        SUM(n , m);
        System.out.println(summation);
    }


    public static void SUM(int n , int m){
        summation=0;
        for(int i = n ; i>0 ; i--){
            summation+=i;
        }
        if(m==1){
            return;
        }
        if(m>1) {
            SUM(summation, m - 1);
        }if(m==1){
            SUM(summation, m);
        }
    }
}
