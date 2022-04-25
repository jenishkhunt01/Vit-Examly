package exam;


import java.util.LinkedList;
import java.util.Scanner;

public class DeleteOddBlocks {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int [] array  = new int[n];
    public static void main(String[] args) {
        int val =1;
        int i;
        for(i =0 ; i< n ; i++){
            array[i] =val++;
        }
        int index = n;

        while (index>1) {
            for (i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    array[i] = 0;
                    index--;
                    if(array[i+1]==0)
                        break;
                    if (index==1)
                        break;
                }
                if(i%2==1&& array[i]==0)
                    break;
            }
            leftShift();
        }
        System.out.println(array[0]);

    }

    public static void leftShift(){
        for (int i=0 ; i< n ; i++){
            int temp=i;
            while ( temp<n-1&&array[temp]==0){
                array[temp] = array[temp+1];
                if(array[temp+1]!=0){
                    array[temp+1]=0;
                }
                temp++;
            }
        }

    }
}
