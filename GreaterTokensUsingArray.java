package DataStructureWithMosh.Stacks.Examly;

import java.util.Scanner;
import java.util.Stack;

public class GreaterTokensUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1  = new Stack<>();
        int n =sc.nextInt();


        int [] array = new int[n];
        for(int i=0;i<n ; i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i< n ; i++){
            int var = greater(array , i);
            if(var!= -1){
                System.out.println(array[i]+" "+var);
            }else {
                System.out.println(array[i]+" -1");
            }
        }

    }

//    public static boolean isgreater(int current , int next){
//        return current>next;
//    }

    public static int greater(int []array , int i){
        int j=i+1;
        while (j < array.length){
            if(array[i] < array[j]){
                return array[j];
            }
            if(j == array.length-1){
                break;
            }
            j++;
        }
        return -1;
    }
}
