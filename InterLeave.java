package DataStructureWithMosh.Queues.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class InterLeave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        Queue<Integer> queue3 = new ArrayDeque<>();

        int count = 1;
        while (count<=n){
            queue1.add(count);
            count++;
        }
        System.out.println(queue1);

        int size = queue1.size();
        count=1;
        if(n%2 == 0) {
            while (!queue1.isEmpty()) {
                if (count >= 1 && count <= (size/ 2) ) {
                    queue2.add(queue1.remove());
                } else {
                    queue3.add(queue1.remove());
                }
                count++;
            }
        }
        else{
            System.out.print(n+" ");
            while (!queue1.isEmpty()) {
                if (count >= 1 && count <= (size-1 )/ 2) {
                    queue2.add(queue1.remove());
                } else {
                    queue3.add(queue1.remove());
                }
                count++;
            }
        }
        while (!queue2.isEmpty() && !queue3.isEmpty()) {
            System.out.print(queue2.remove() + " " + queue3.remove()+" ");
        }
    }
}
