package DataStructureWithMosh.linkedLists.Examly;

import DataStructureWithMosh.linkedLists.LinkedList;

import java.util.Scanner;

public class ReversingNElements {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();

        Scanner sc = new Scanner(System.in);

        while (true){
            int value = sc.nextInt();
            if(value == 0){
                break;
            }
            list.addLast(value);
        }
        int n = sc.nextInt();
        int i =0;
        while (i<n){
            list2.addFirst(list.deleteFirst());
            i++;
        }
        int [] array = list.toArray();
        int [] array2 = list2.toArray();
        for(int j =0 ; j< array2.length ; j++ ){
            System.out.print(array2[j]+" ");
        }
        for(int j =0 ; j< array.length ; j++ ){
            System.out.print(array[j]+" ");
        }

    }
}
