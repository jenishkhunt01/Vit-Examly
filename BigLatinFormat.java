package exam;

import java.util.LinkedList;
import java.util.Scanner;

public class BigLatinFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        String str = sc.nextLine();
        String string ="";
        for(char ch: str.toCharArray()){
            if(ch == 32){
                list.add(string);
                string="";
            }else {
                string+=ch;
            }
        }
        list.add(string);
        while (!list.isEmpty()){
            String temp = list.remove();
            LinkedList list1 = new LinkedList<>();
            for(char ch:temp.toCharArray()){
                list1.add( ch);
            }
            char val= (char) list1.removeFirst();
            list1.addLast(val);
            if(val=='a' || val=='e' || val=='i' || val=='o' || val=='u'||val=='A' || val=='E' || val=='I' || val=='O' || val=='U'){
                list1.addLast("ay");
            }else{
                list1.addLast("ed");
            }
            StringBuffer strh = new StringBuffer();
            while (!list1.isEmpty()){
                strh.append(list1.remove());
            }
            System.out.print(strh+" ");
        }
    }
}
