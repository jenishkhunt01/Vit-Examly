package exam;

import java.util.Scanner;

import java.io.*;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.io.*;


class webPages {

    static int count=1;
    static int result=0;
    static void combinationUtil(String arr[], int n, int r, int index, String data[], int i){
        if (index == r){
            String local[] = new String[r];
            for (int j = 0; j < r; j++){
                local[j] = data[j];
            }
            count++;
            if(count == result){
                System.out.println(printArray(local));
            }
            return;
        }
        if (i >= n)
            return;
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1,
                data, i + 1);
        combinationUtil(arr, n, r, index, data, i + 1);
    }

    public static String printArray(String [] local){
        int iMax = local.length-1;
        StringBuilder sb = new StringBuilder();
//        sb.append('[');
        for (int b = 0; ; b++) {
            sb.append(String.valueOf(local[b]));
            if (b == iMax)
                return sb.toString();
            sb.append(",");
        }
    }

    static void printCombination(String arr[], int n, int r){
        String data[] = new String[r];
        combinationUtil(arr, n, r, 0, data, 0);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        int var = sc.nextInt();
        result=sc.nextInt();
        String str = sc.next();
        String [] arr = str.split(",", 0);
        int r = 1;
        for(r=1;r<=arr.length;r++){
            int n = arr.length;
            printCombination(arr, n, r);
        }
    }


}