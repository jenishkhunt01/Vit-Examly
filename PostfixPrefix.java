package DataStructureWithMosh.Stacks.Examly;

import java.util.Scanner;
import java.util.Stack;

public class PostfixPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convert(str));
    }

    public static String convert(String str){

        char [] operationArray = new char[5];


        Stack<Character> stack = new Stack<>();
        StringBuffer string = new StringBuffer();
        Stack<Character> inner = new Stack<>();
        Stack<Character> outer = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }else if(ch >= 'A' && ch<='z'){
                string.append(ch);
            }else if(ch == '*' || ch=='/' || ch=='+' || ch=='-' || ch=='^'){
                if(!stack.isEmpty() && !inner.isEmpty()){
                    if(inner.peek() > ch){
                        char temp = inner.pop();
                        inner.push(ch);
                        string.append(temp);
                    } else {
                        inner.push(ch);
                    }
                }else{
                    outer.push(ch);
                }
            }else if(ch==')'){
                while (!inner.isEmpty()){
                    string.append(inner.pop());
                }
            }
        }
        while(!outer.isEmpty()){
            string.append(outer.pop());
        }
        return string.toString();


    }
}
