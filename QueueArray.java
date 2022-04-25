package exam;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        int n = sc.nextInt();
        int find=0;
        while (sc.hasNextInt()){
            queue.add(sc.nextInt());
        }
        find = queue.remove();

        int i=1;
        int index=0;
        while (!queue.isEmpty()){
            if(find == queue.peek()){
                index=i;
            }
            System.out.print(queue.remove()+" ");
            i++;
        }

        if(index!=0){
            System.out.println("Element found at position "+index);
        }
    }
}
