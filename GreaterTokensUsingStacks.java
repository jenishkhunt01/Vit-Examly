package DataStructureWithMosh.Stacks.Examly;

import java.util.Scanner;
import java.util.Stack;

public class GreaterTokensUsingStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> garbageStack = new Stack<>();
        int n = sc.nextInt();
        while (n>0){
            stack.push(sc.nextInt());
            n--;
        }
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        int pop = stack1.pop();
        int peek = stack1.peek();
        while (!stack1.isEmpty()){
            if(peek>pop){
                System.out.println(pop+" "+peek);
                while (!garbageStack.isEmpty()){
                    stack1.push(garbageStack.pop());
                }
                if(!stack1.isEmpty()){
                    pop = stack1.pop();
                    if(!stack1.isEmpty()) {
                        peek = stack1.peek();
                    }else {
                        System.out.println(pop+" -1");
                    }
                }else{
                    System.out.println(peek+" -1");
                }
            }else{
                if(!stack1.isEmpty()) {
                    garbageStack.push(stack1.pop());
                    if(!stack1.isEmpty()){
                        peek = stack1.peek();
                    }
                    else{
                        System.out.println(pop+" -1");
                        pop = stack1.push(garbageStack.pop());
                        if(stack1.size() == 1){
                            System.out.println(pop+" -1");
                            stack1.pop();
                        }
                    }
                }
            }
        }

    }
}
