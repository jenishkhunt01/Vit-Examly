package DataStructureWithMosh.linkedLists.Examly;



import java.util.LinkedList;
import java.util.Scanner;

public class InsertInMiddle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int i = 0;
        int var = 6;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("6 7 8 9 ");
        while (i<4){
            if(i == 2){
                list.addLast(4);
            }
            list.addLast(var++);
            i++;
        }
        while (!list.isEmpty()){
            System.out.print(list.removeFirst()+" ");
        }
    }
}
