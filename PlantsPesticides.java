package DataStructureWithMosh.Queues.Examly;

import java.util.*;

public class PlantsPesticides {
    static Stack<Integer> stack = new Stack<>();
    static Queue<Integer> queue1 = new ArrayDeque<>();
    static int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while (i< n){
            queue1.add(sc.nextInt());
            i++;
        }
        int count=0;
        while (check()){
            count++;
        }
        System.out.println(count);

    }

    public static boolean check(){
        int n = queue1.size();
        int [] temp = new int[n];
        int i = n-1;
        while (!queue1.isEmpty()){
            temp[i--] = queue1.remove();
        }

        for(int j=0 ; j<n-1 ; j++){
            if(temp[j+1] > temp[j] ){
                stack.push(temp[j]);
            }
        }
        if(temp[n-1] > temp[n-2]){
            stack.push(temp[n-1]);
        }
        int count =0;
        while (!stack.isEmpty()){
            queue1.add(stack.pop());
            count++;
        }

        boolean b = count==size;
        size=count;
        return !b;
    }
}
