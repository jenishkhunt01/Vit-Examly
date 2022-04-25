package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueAuthors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] asc = new int[128];
        Map<Character , Integer> map= new HashMap<>();
        int count=0;
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch));
                count-= map.get(ch);
            }else{
                map.put(ch , 1);
                count++;
            }
        }
        System.out.println(count);
    }
}
