package exam;

import java.util.Scanner;

public class ReversePositionChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        int i =0;
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch == stringBuffer.toString().charAt(i)){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
