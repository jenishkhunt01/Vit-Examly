package exam;

import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2 = sc.next();
        int i=0;
        float pair=0;
        for(char ch:str1.toCharArray()){
            if(ch != str2.charAt(i)){
                pair++;
            }
            i++;
        }
        float res = (pair/8)*100;
        System.out.println((int)res);
    }
}
