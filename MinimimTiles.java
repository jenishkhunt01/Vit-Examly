package exam;

import java.util.Scanner;

public class MinimimTiles {
    static int total=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        minimimTiles(n , m);
        System.out.println(total);
    }

    public static void minimimTiles(int n, int m){
        if(n%2 == 1 && m%2 ==0){
            total+=m;
            n/=2 ;
            m/=2;
        }else if(n%2==0 && m%2==1){
            total+=n;
            n/=2;
            m/=2;
        }else if(n%2 ==1 && m%2==1){
            total+= n+m-1;
            n/=2;
            m/=2;
        }else{
            n/=2;
            m/=2;
        }
        if(n==0 || m==0){
            return;
        }
        minimimTiles(n , m);

    }
}


