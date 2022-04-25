package DataStructureWithMosh.Stacks.Examly;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class QuadripleSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        int n = sc.nextInt();
        int sum = sc.nextInt();
        int [] array = new int[n];
        for(int i=0 ; i< n ; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=0 ; i< n ; i++){
            for(int j =i+1 ; j< n ; j++) {
                int front = j+1;
                if(front>n-1){
                    break;
                }
                int back = n-1;
                int target = sum-array[i]-array[j];
                while (front< back){
                    if(array[front]+array[back]< target)
                        while(front<back && array[front]+array[back]< target)
                            front++;
                    else if(array[front]+array[back]> target)
                        while(front<back&&array[front]+array[back]> target)
                            back--;
                    if(front< back && array[front]+array[back]== target){
                        stack.push(array[i]);
                        stack.push(array[j]);
                        stack.push(array[front]);
                        stack.push(array[back]);
                    }

                    while (front<back && array[front]== array[front+1]) {
                        front++;
                    }
                    front++;

                }
                while (j< n-1 && array[j]== array[j+1]){
                    j++;
                }
            }
            while (i< n-1 && array[i]== array[i+1]){
                i++;
            }
        }
        while (!stack.isEmpty()){
            stack2.push(stack.pop());
        }

        while (!stack2.isEmpty()){
            int i=1;
            while (i<=4){
                System.out.print(stack2.pop()+" ");
                i++;
            }
            System.out.print("$");
        }

    }

}
