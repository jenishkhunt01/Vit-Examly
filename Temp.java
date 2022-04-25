package exam;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum =0;
        while (num>0){
            int val = num%10;
            num/=10;
            int temp = num;
            while (num>0){
                int val2 = num%10;
                num/=10;
                sum+=val+(val2);
            }
            num = temp;
        }
        System.out.println(sum);
    }
}

