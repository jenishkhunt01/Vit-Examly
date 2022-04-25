package DataStructureWithMosh.linkedLists.Examly;


import java.util.LinkedList;
import java.util.Scanner;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int val = sc.nextInt();
            list.addLast(val);
            list.addFirst(val);
        }
        while (!list.isEmpty()){
            System.out.print(list.remove()+" ");
        }

        while (!list.isEmpty()){
            System.out.print(list2.remove()+" ");
        }
    }
}
