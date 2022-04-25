package exam;

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            String str1= sc.next();
            String str2= sc.next();
            if(str1.equals(str2)){
                System.out.println("Strings are equal");
            }else{
                System.out.println("Strings are not equal");
            }
        }
    }
}
