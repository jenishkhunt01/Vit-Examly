package DataStructureWithMosh.linkedLists.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i< n ; i++){
            list.addFirst(sc.nextInt());
        }

        int i =0;
        int sum =0;
        while (i< n ){
            sum+= list.remove()*Math.pow(2, i++);
        }
        System.out.println(sum);
    }
}
