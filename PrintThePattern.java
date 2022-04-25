package exam;

import java.util.Scanner;

public class PrintThePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initial = 1;
        for(int i=n ; i>0 ; i--){
            int temp=initial;
            for(int j = i ; j>0 ; j--){
                System.out.print(initial+" ");
                initial+=2;
            }
            System.out.println();
            initial = temp+2;
        }
    }
}
