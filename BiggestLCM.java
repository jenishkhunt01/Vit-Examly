package exam;

import java.util.Scanner;

public class BiggestLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];

        for(int i =0 ; i< n ; i++){
            array[i] = sc.nextInt();
        }
        int max=0;
        int current=0;
        for(int i =1 ; i< n ; i++){
            int val= LCM(array[current++] , array[i]);
            if(val>max)
                max =val;
        }
        System.out.println(max);

    }

    public static int LCM(int n, int m) {
        if (m > n) {
            for (int i = 1; i <= n; i++) {
                int val = m;
                val = val * i;
                if (val % n == 0) {
                    return val;
                }
            }
        } else {
            for (int i = 1; i <= m; i++) {
                int val = n;
                val = val * i;
                if (val % m == 0)
                    return val;
            }
        }
        return -1;
    }
}
