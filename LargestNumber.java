package exam;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[10000];
        int value=0;
        for(int i =0 ; i< array.length ; i++){
            array[i] = value++;
        }

        int N = sc.nextInt();
        int L = sc.nextInt();
        int max=0;
        for(int i=0 ; i< array.length ; i++){
            int num =array[i];
            if(num <= N) {
                if (max <= num) {
                    while (num > 0) {
                        if (num %10 == L) {
                            break;
                        }
                        num /= 10;
                    }
                }
                if(num<=0){
                    max=array[i];
                }
            }
        }
        System.out.println(max);
    }
}
