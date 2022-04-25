package DataStructureWithMosh.linkedLists.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class ReturnElementOfTheGivenIndex {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=0;
        for(int i =0 ; i< n ; i++){
            list.add(sc.nextInt());
            j++;
        }
        int index = sc.nextInt();
        j=0;
        while (!list.isEmpty()){
            if(j==index-1){
                list.remove();
            }
            System.out.print(list.remove()+" ");
            j++;
        }

    }
}
