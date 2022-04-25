package DataStructureWithMosh.Stacks.Examly;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
//        System.out.println(stringBuffer);
        Stack<Character>stack = new Stack<>();
        StringBuffer prefix = new StringBuffer();
        for(char ch: stringBuffer.reverse().toString().toCharArray()){
            if(ch >='A' && ch<='z' && ch!='^' || ch>=48 && ch<= 56 ){
                prefix.append(ch);
            }
            else if(ch=='+' || ch=='-'|| ch=='*' || ch=='/' ||ch==94){

                if (ch == '+' || ch == '-') {
                    while (!stack.empty()) {
                        int top = stack.peek();
                        if(top==')'){
                            break;
                        }
                        if( top!=43&&top!= 45)
                            prefix.append(stack.pop());
                        else
                            break;
                    }
                    stack.push(ch);
                }else {
                    stack.push(ch);
                }
            }
            else if(ch==')'){
                stack.push(ch);
            }else if(ch=='('){
                while (stack.peek()!=')')
                {
                    prefix.append(stack.pop());
                }
                stack.pop();

            }

        }
        while (!stack.isEmpty()){
            prefix.append(stack.pop());
        }
        System.out.println(prefix.reverse().toString());
    }
}

