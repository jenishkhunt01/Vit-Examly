package exam;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int four=1;
        int upper =0;
        int special =0;
        int numeric = 0;
        for(char ch:str.toCharArray()){
            if(ch >= 65 && ch<= 90)
                upper=1;

            if(ch>=48 && ch<=57)
                numeric=1;

            if(ch== 47)
                special=1;
        }
        if(str.length()>4)
            four=1;
        if(upper==1 && four==1 && numeric==1 && special==0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
