package exam;

import java.util.Scanner;

public class SmallestRatio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i =0 ; i< n ; i++){
            array[i] = sc.nextInt();
        }

        boolean c = true;
        boolean b =true;
        for(int i=10000 ; i>=2 ; i--){
            for(int j=0 ; j<n ; j++){
                if(array[j]%i !=0)
                    break;
                else if(j == n-1 && array[j]%i == 0){
                    for(int k=0 ; k<n ; k++ ){
                        System.out.print(array[k]/i+" ");
                    }
                    c=false;
                    b=false;
                }
            }
            if(!c){
                break;
            }
        }
        if(b) {
            for (int k = 0; k < n; k++) {
                System.out.print(array[k]+ " ");
            }
        }


    }
}
