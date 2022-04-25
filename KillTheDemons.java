package exam;

import java.util.LinkedList;
import java.util.Scanner;

public class KillTheDemons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0 ; i<n ;i++){
            list.addLast(i+1);
        }
        int nos=1;
        while (list.size()!=1){
            if(nos%2==1){
                list.removeLast();
            }else{
                list.addFirst(list.removeLast());
            }
            nos++;
        }
        System.out.println(list.remove());
    }
}
