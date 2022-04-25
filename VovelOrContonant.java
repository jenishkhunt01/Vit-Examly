package exam;

import java.util.Scanner;

public class VovelOrContonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        if(ch.equals("a")||ch.equals("A")||ch.equals("E")||ch.equals("e")||ch.equals("I")||ch.equals("i")||ch.equals("O")||ch.equals("o")||ch.equals("U")||ch.equals("u")){
            System.out.println(ch+" :vowel");
        }else{
            System.out.println(ch+" :consonant");
        }
    }
}
