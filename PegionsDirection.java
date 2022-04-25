package exam;

import java.util.Scanner;

public class PegionsDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int [] arr = new int[128];
        for(char ch: str.toCharArray()){
            arr[ch]++;
        }
        int [] min  = new int[2];
        int index=0;
        for(int i =0 ; i< 128 ; i++){
            if(arr[i]!=0){
                min[index++] = arr[i];
            }
        }
        if(min[1]>min[0]){
            System.out.println(min[0]);
        }else{
            System.out.println(min[1]);
        }
    }
}
