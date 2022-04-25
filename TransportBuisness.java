package DataStructureWithMosh.Queues.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TransportBuisness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2= new ArrayDeque<>();
        int i=1;
        while (i<=n){
            queue1.add(sc.nextInt());
            i++;
        }
        i=1;
        while (i <= m-n){
            queue2.add(sc.nextInt());
            i++;
        }

        while (!queue2.isEmpty()){
            int top = queue2.peek();
            if(top%2==0){
                queue1.remove();
                queue1.add(top);
            }
            queue2.remove();
        }
        while (!queue1.isEmpty()){
            System.out.print(queue1.remove()+" ");
        }

    }
}
