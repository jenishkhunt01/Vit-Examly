package DataStructureWithMosh.Stacks.Examly;

import java.util.Scanner;
import java.util.Stack;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ispalindrome = isPalindrome(str);
        if(ispalindrome){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }

    }

    public static boolean isPalindrome(String str){
        Stack<Character> stack = new Stack();

        if(str.length()%2==0) {
            for (int i = 0; i < str.length() / 2; i++)
                stack.push(str.charAt(i));

            for (int i = str.length() / 2; i < str.length(); i++) {
                if (str.charAt(i) == stack.peek())
                    stack.pop();
                else
                    break;
            }
        }else{
            for (int i = 0; i < str.length() / 2; i++)
                stack.push(str.charAt(i));

            for (int i = str.length()/ 2+1; i < str.length(); i++) {
                if (str.charAt(i) == stack.peek())
                    stack.pop();
                else
                    break;
            }

        }

        return stack.isEmpty();
    }
}