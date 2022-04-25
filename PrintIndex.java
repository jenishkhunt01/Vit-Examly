package DataStructureWithMosh.HashTable.examly;

import DataStructureWithMosh.HashTable.HashTable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashTable map = new HashTable();
        int n = sc.nextInt();
        int count=0;

        int [] array = new int[n];
        for(int i=0 ; i< n ; i++){
            int val = sc.nextInt();
            map.put(val, count++);
            array[i] = val;
        }

        for(int i=n-1 ; i>=0 ; i--){
            System.out.print(map.get(array[i]));
        }
    }
}
