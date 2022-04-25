package algo;

import java.math.BigInteger;
import java.util.Scanner;
public class group1 {
    static BigInteger fact(int n){
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++){
            f=f.multiply(BigInteger.valueOf(i));
        }

//        String ten="10";
        BigInteger div;
//        String zero="0";
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("0");
        div=f.mod(a);
        while(div.equals(b)){
            div=f.mod(a);
            if(div.equals(b)){
                f = f.divide(a);
            }else{
                break;
            }

        }
        return div;
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.print(fact(n));
    }
}