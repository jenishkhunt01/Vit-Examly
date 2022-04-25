package DataStructureWithMosh.Queues.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReversingFromElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int i =1;
        while (i<=n){
            queue.add(sc.nextInt());
            i++;
        }
        reverseFromElement(queue , x);
    }

    public static void reverseFromElement(Queue<Integer> queue , int x){
        Stack<Integer> stack = new Stack<>();
        int i =1;
        while(i<=x){
            stack.push(queue.remove());
            i++;
        }
        System.out.println("Reversed queue: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        while (!queue.isEmpty()){
            System.out.print(queue.remove());
        }
    }
}
