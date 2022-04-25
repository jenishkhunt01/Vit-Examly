package exam;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteAnIndexFromTheLinkedList{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                LinkedList<String> list = new LinkedList<>();
                int n = sc.nextInt();
                sc.nextLine();
                for(int i=0 ; i< n ; i++){
                        list.add(sc.nextLine());
                }
                int k = sc.nextInt();
                list.remove(k-1);
                while (!list.isEmpty()){
                        System.out.println(list.removeFirst());
                }
        }
}
