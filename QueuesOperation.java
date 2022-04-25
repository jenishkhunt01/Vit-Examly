package DataStructureWithMosh.Queues.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueuesOperation {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while (i<=n){
            queue.add(sc.nextInt());
            i++;
        }
        n = sc.nextInt();
        i =1;
        while (i<=n){
            int top =queue.remove();
            System.out.println("Element deleted from queue is : "+top);
            i++;
        }
        System.out.println("Queue is");
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
}
