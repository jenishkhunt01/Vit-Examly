package DataStructureWithMosh.linkedLists.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveGiverElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i< n ; i++){
            list.addLast(sc.nextInt());
        }
        int k = sc.nextInt();
        int index = list.indexOf(k);
        int i = 0;
        while (!list.isEmpty()){
            list2.addFirst(list.remove());
            i++;
            if(i==index){
                list.remove();
            }
        }
        while (!list2.isEmpty()){
            System.out.print(list2.remove()+" ");
        }
    }
}
