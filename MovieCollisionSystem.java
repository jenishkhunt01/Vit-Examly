package exam;

import java.util.Scanner;

public class MovieCollisionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] array = new int[n][m];
        for(int i = 0 ; i< n ; i++){
            for(int j =0 ; j< m ; j++){
                array[i][j]  = sc.nextInt();
            }
        }
        int collision=0;
        for(int j=0 ; j< m ; j++){
            int count =0;
            for(int i =0 ; i< n ; i ++){
                if(array[i][j] ==1)
                    count++;
            }
//            System.out.println(count);
            collision+= factorial(count)/(factorial(2)*factorial(count-2));
        }
        System.out.println(collision);

    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact=n;
        for(int i = n-1 ; i>0 ; i--){
            fact*=i;
        }
        return fact;
    }
}
