package exam;

import java.util.Scanner;

public class BinaryXORDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer stringBuffer = new StringBuffer();

        while (n>0){
            stringBuffer.append(n%2);
            n=n/2;
        }

        stringBuffer.reverse();
        char [] array = stringBuffer.toString().toCharArray();
        int index=0;
        int current =0;
        int [] array2= new int[array.length];
        for(int i=1 ; i<array.length ; i++){
            if(array[current++] == array[i]){
                array2[index++] = 0;
            }else{
                array2[index++] = 1;
            }
        }

        int val=0;
        index = array2.length-1;
        for(int i = 0 ; i< array2.length ; i++){
            val+= array2[i]*Math.pow(2 , index--);
        }
        System.out.println(val);
    }
}
