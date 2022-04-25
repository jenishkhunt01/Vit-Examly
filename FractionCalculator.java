package exam;

import java.util.Scanner;

public class FractionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n%m==0){
            System.out.println(n/m);
        }else{
            int val = n/m;
            int mod = n%m;
            int i =2;
            while(i<=mod && m%i==0 && mod%i==0) {
                m = m / i;
                mod = mod/i;
                if(m%i==0&& mod%i==0);
                else i++;
            }

            System.out.println(val+" "+mod+"/"+m);
        }
    }
}
