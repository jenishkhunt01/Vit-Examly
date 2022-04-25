package DataStructureWithMosh.HashTable.examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer , Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i =0 ; i< n ; i++){
            int val = sc.nextInt();
            int count = map.containsKey(val)?map.get(val):0;
            map.put(val , count+1);
        }
        int [] array = new int[n];
        int index=0;
        for (var item:map.entrySet()){
            if(item.getValue()==1)
                array[index++] = item.getKey();
        }

        if(index == 0){
            System.out.println(-1);
        }else {
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
