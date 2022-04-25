package exam;

import java.util.Scanner;

public class PrintEvenValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i < n ; i++){
            int val = sc.nextInt();
            if(val%2 ==0)
                System.out.print(val+" ");
        }
    }
}
