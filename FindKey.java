package exam;

import java.util.Scanner;

public class FindKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int num=0;
        int temp =1000;
        int i=0;
        while(n1>0){
            if(i%2==0) {
                int r1 = n1 % temp;
                int r2 = n2 % temp;
                int r3 = n3 % temp;

                int val1 = n1 / temp;
                int val2 = n2 / temp;
                int val3 = n3 / temp;
                if(val1 <= val2 && val1<=val3){
                    num+= val1*temp;
                }else if(val2<=val1 && val2<=val3){
                    num+=val2*temp;
                }else{
                    num+=val3*temp;
                }
                n1 = r1;
                n2=r2;
                n3=r3;
                temp/=10;

            }else{
                int val1 = n1 / temp;
                int val2 = n2 / temp;
                int val3 = n3 / temp;
                if(val1 >= val2 && val1>=val3){
                    num+= val1*temp;
                }else if(val2>=val1 && val2>=val3){
                    num+=val2*temp;
                }else{
                    num+=val3*temp;
                }
                n1%=temp;
                n2%=temp;
                n3%=temp;
                temp/=10;
            }
            i++;
        }
        System.out.println(num);
    }
}
