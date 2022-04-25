package DataStructureWithMosh.Stacks.Examly;

import java.util.Scanner;
import java.util.Stack;

public class DeleteTopElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while(n>0){
            stack.push(sc.nextInt());
            n--;
        }
        int top = stack.pop();
        System.out.println("Deleted element is "+top);
        System.out.println("The elements in stack");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
