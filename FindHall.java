package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class FindHall {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n ;i++){
            arrayList.add(sc.next());
        }
        String str = sc.next();
        boolean b = arrayList.contains(str);
        if(b){
            System.out.println(arrayList.indexOf(str));
        }else
            System.out.println(str+ " hall is not found");
    }
}
