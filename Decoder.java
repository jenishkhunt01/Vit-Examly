package exam;

import java.util.Scanner;

public class Decoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        int i=0;
        while (i<str.length()){
            int val = Character.getNumericValue(str.charAt(i));

            if(str.charAt(i)=='#'){
                i++;
                while (str.charAt(i)==32){
                    i++;
                }
                while (i<str.length() &&str.charAt(i)!=32) {
                    stringBuffer.append(Character.getNumericValue(str.charAt(i)));
                    i++;
                }

            }
            if(i==str.length())
                break;
            else if(val>=1 && val<=26){
                int sum= val;
                i++;
                while (i<str.length() &&sum<=26 &&Character.getNumericValue(str.charAt(i)) >= 0 &&
                        Character.getNumericValue(str.charAt(i))<=26){
                    sum*=10;
                    sum+= Character.getNumericValue(str.charAt(i));
                    if(sum>26){
                        break;
                    }
                    i++;
                    val=sum;
                }
                stringBuffer.append((char)(val+64));
                if(val>=10){
                    stringBuffer.append(" ");
                }
                i--;
            }else if(str.charAt(i)=='_'){
                stringBuffer.append(" ");
            }else if(str.charAt(i)!=32){
                stringBuffer.append(str.charAt(i));
            }
            i++;
        }
        System.out.println(stringBuffer);

    }
}
