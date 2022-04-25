package exam;

import java.util.Scanner;

public class DarryAndGary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int cards=0;
        int findValue=0;

        if(n1<n2){
            for(int i = n1 ; i>0 ; i--){
                if(n1%i==0 && n2%i==0){
                    System.out.println(i);
                    break;
                }
            }
        }
        else{
            for(int i = n2 ; i>0 ; i--){
                if(n1%i==0 && n2%i==0){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
