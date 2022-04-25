package exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class WordIntersection {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        Map<String , Integer> map2 = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        for(char ch:str1.toCharArray()){
            if(ch==32){
                int count = map.containsKey(stringBuffer.toString()) ? map.get(stringBuffer.toString()): 0;
                map.put(stringBuffer.toString() , count+1);
                stringBuffer.delete(0 , stringBuffer.length());
            }else{
                stringBuffer.append(ch);
            }
        }
        int count = map.containsKey(stringBuffer.toString()) ? map.get(stringBuffer.toString()): 0;
        map.put(stringBuffer.toString() , count+1);
        stringBuffer.delete(0 , stringBuffer.length());

        for(char ch:str2.toCharArray()){
            if(ch==32){
                count = map2.containsKey(stringBuffer.toString()) ? map2.get(stringBuffer.toString()): 0;
                map2.put(stringBuffer.toString() , count+1);
                stringBuffer.delete(0 , stringBuffer.length());
            }
            else {
                stringBuffer.append(ch);
            }
        }
        count = map2.containsKey(stringBuffer.toString()) ? map2.get(stringBuffer.toString()): 0;
        map2.put(stringBuffer.toString() , count+1);
        stringBuffer.delete(0 , stringBuffer.length());

        System.out.println(map);
        System.out.println(map2);

//        if(map.size()> map2.size()){
//            while (!map2.isEmpty()){
//                if(map.containsKey(map2.remove()))
//            }
//        }


    }
}
