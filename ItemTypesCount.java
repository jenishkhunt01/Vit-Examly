package exam;

import java.util.LinkedList;
import java.util.Scanner;

public class ItemTypesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fur = 0;
        int el =0;
        LinkedList<String> list = new LinkedList<>();
        for(int i =0 ; i< n ; i++){
            String str = sc.next();
            StringBuffer stringBuffer = new StringBuffer();
            for(int j = str.length()-1 ;j >= str.length()-3 ;j-- ){
                stringBuffer.append(str.charAt(j));
                if(stringBuffer.toString().equals("RUF")) {
                    fur++;
                    break;
                }
                else if(stringBuffer.toString().equals("LE")) {
                    el++;
                    break;
                }
            }
        }

        String  string ="";
        string.compareTo("FUR");
        System.out.println(fur+" "+el);

    }
}
