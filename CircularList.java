package DataStructureWithMosh.linkedLists.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class CircularList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        int index = sc.nextInt();
        System.out.println("10 20 30 40 50 60 ");
        int i =0, j=10;
        while (i<index){
            list.addLast(list.removeFirst());
            i++;
        }
        while (!list.isEmpty()){
            System.out.print(list.remove()+" ");
        }
    }
}
