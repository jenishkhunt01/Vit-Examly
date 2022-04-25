package exam;

import java.util.Arrays;
import java.util.Scanner;

public class CupCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int miles=0;
        int c=n-1;
        for(int i=0 ; i< n  ; i++){
            miles+=Math.pow(2 , i)*arr[c--];
        }
        System.out.println(miles);
    }
}
