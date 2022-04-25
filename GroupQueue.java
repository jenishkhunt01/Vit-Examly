package exam;

import java.util.Scanner;

public class GroupQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int [] array = new int[128];
        for(char ch:str.toCharArray()){
            array[ch]++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(char ch:str.toCharArray()){
            if(array[ch]!=0){
                while (array[ch]!=0){
                    stringBuffer.append(ch);
                    array[ch]--;
                }
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
