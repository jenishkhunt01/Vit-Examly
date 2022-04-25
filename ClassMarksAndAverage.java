package DataStructureWithMosh.HashTable.examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassMarksAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] array = new String[n];
        int index=0;
        Map<String  , Integer> map = new HashMap<>();
        sc.next();
        for(int i=0 ; i< n ; i++){
            String name = sc.nextLine();
            int marks = Integer.parseInt(sc.nextLine());
            array[index++] = name;
            map.put(name , marks);
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        float average =0;
        int count=0;

        boolean b = false;
        index=0;
        while (index<n) {
            for (var entry : map.entrySet()) {
                if (entry.getKey().equals(array[index])) {
                    if (entry.getValue() <= y && entry.getValue() >= x) {
                        System.out.println(entry.getKey() + " # " + entry.getValue());
                        average += entry.getValue();
                        count++;
                        b = true;
                    }else if(entry.getValue()<= x && entry.getValue()>=y ) {
                        System.out.println(entry.getKey() + " # " + entry.getValue());
                        average+=entry.getValue();
                        count++;
                        b=true;
                    }
                }
            }
            index++;
        }


//        for(var entry :map.entrySet()){
//            if(entry.getValue()<= y && entry.getValue()>=x ) {
//                System.out.println(entry.getKey() + " # " + entry.getValue());
//                average+=entry.getValue();
//                count++;
//                b = true;
//            }
//            else if(entry.getValue()<= x && entry.getValue()>=y ) {
//                System.out.println(entry.getKey() + " # " + entry.getValue());
//                average+=entry.getValue();
//                count++;
//                b=true;
//            }
//        }

        if(!b){
            System.out.println("No results");
        }else{
            average /= count;
            System.out.println("Average: " + String.format(java.util.Locale.US, "%.2f", average));
        }
    }
}
