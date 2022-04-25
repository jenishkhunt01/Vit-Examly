package DataStructureWithMosh.linkedLists.Examly;


import java.util.LinkedList;
import java.util.Scanner;

public class Trains {
    public static LinkedList list = new LinkedList();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while (i<n){
            list.add(sc.nextInt());
            i++;
        }
        int val = sc.nextInt();
        if(list.contains(val) == true){
            System.out.println(val+": Yes");
        }
        else
            System.out.println(val+": No");



    }
}
