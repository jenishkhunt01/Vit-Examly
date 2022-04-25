package exam;


import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        boolean b = checkFormat(str1);
        if(!b){
            System.out.println("Input dates should be in the format dd-MM-yyyy-HH:mm:ss");
        }
        String str2 = sc.nextLine();

        boolean c = checkFormat(str2);
        if(b == false || c==false){
            System.out.println("Input dates should be in the format dd-MM-yyyy-HH:mm:ss");
        }else{
            System.out.println(str1);
            System.out.println(str2);
        }

    }

    public static boolean checkFormat(String str){
        if(str.length() == 0){

            return false;
        }else {
            StringBuffer stringBuffer = new StringBuffer();
            for (char ch : str.toCharArray()) {
                if (ch == '-' || ch == ':') {
                    stringBuffer.append(ch);
                }
            }
            if (stringBuffer.toString().equals("---::")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
