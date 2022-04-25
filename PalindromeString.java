package DataStructureWithMosh.linkedLists.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(char ch: str.toCharArray()){
            list.add(ch);
        }
        boolean b= true;
        if(str.length()%2==0) {
            int i = 0;
            while (i < str.length() / 2) {
                if (list.removeFirst() != list.removeLast()) {
                    b = false;
                }
                i++;
            }
        }else{
            int i=1;
            while (i<str.length()/2){
                if (list.removeFirst() != list.removeLast()) {
                    b = false;
                }
                i++;
            }
        }
        if(b) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
