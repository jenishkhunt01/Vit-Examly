package DataStructureWithMosh.Stacks.Examly;

import java.util.Scanner;
import java.util.Stack;

public class CylindriclePipe {
    static int min =1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int stack1Sum=0;
        int stack2Sum=0;
        int stack3Sum=0;
        Stack<Integer> tempStack = new Stack<>();

        while (N1 >0){
            stack1Sum+=tempStack.push(sc.nextInt());
            N1--;
        }
        while (!tempStack.isEmpty()){
            stack1.push(tempStack.pop());
        }
        while (N2 >0){
            stack2Sum+=tempStack.push(sc.nextInt());
            N2--;
        }while (!tempStack.isEmpty()){
            stack2.push(tempStack.pop());
        }

        while (N3 >0){
            stack3Sum+=tempStack.push(sc.nextInt());
            N3--;
        }
        while (!tempStack.isEmpty()){
            stack3.push(tempStack.pop());
        }

        int [] array = {stack1Sum , stack2Sum , stack3Sum};
        while(true){
            if(stack1Sum==stack2Sum&& stack2Sum==stack3Sum)
                break;
            for(int j=0; j< 3 ; j++) {
                if(stack1Sum==stack2Sum&& stack2Sum==stack3Sum)
                    break;
                if (array[j] > minimum(array)) {
                    if (j == 0) {
                        int top = stack1.pop();
                        array[j] -= top;
                        stack1Sum -= top;
                    }
                    if (j == 1) {
                        int top = stack2.pop();
                        array[j] -= top;
                        stack2Sum -= top;
                    }
                    if (j == 2) {
                        int top = stack3.pop();
                        array[j] -= top;
                        stack3Sum -= top;
                    }
                }
            }
        }
        System.out.println(stack1Sum);
    }

    public static int minimum(int [] arr){
        for(int i=0 ; i< 3 ; i++){
            if(arr[i]< min){
                min= arr[i];
            }
        }
        return min;
    }

}
