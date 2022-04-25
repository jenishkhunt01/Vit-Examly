package exam;

import java.util.Scanner;
import java.util.Stack;

public class ReversingASting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<String > stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        for(char ch:str.toCharArray()){
            if(ch==32){
                stack.push(stringBuffer.toString());
                stringBuffer.delete(0 , stringBuffer.length());
            }else {
                stringBuffer.append(ch);
            }
        }
        stack.push(stringBuffer.toString());
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
