package DataStructureWithMosh.HashTable.examly;

import java.util.Scanner;

public class LinearProbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        int i =1;
        while (i<=n){
            int val = sc.nextInt();
            int index = val%n;
            while (array[index] !=0){
                index++;
                if(index>= n)
                    index= index%n;
            }
            array[index] = val;
            i++;
        }
        for(i=0 ; i< n ; i++){
            System.out.print(array[i]+" ");
        }
    }
}
