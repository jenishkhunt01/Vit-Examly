package exam;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum=0;
        if(str.length()!=9){
            System.out.println("InvalidInputException: ISBN must be exactly 9 digits");
        }else{
            int i=1;
            for(char ch:str.toCharArray()){
                int val = Integer.parseInt(String.valueOf(ch));
                sum+= val*i;
                i++;
            }
            int mod = sum%11;
            if(mod == 10){
                str+="X";
            }else{
                str+=mod;
            }
            System.out.println("ISBN : "+str);
        }

    }
}
