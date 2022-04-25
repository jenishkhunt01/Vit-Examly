package DataStructureWithMosh.HashTable.examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Map<String  , String > map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i < n ; i++){
            String nam1 = sc.next();
            String nam2 = sc.next();
            map.put(nam1 , nam2);
        }
        String friends = sc.next();
        int count=0;
        for( String str:map.values()){
            if(friends.equals(str))
                count++;
        }
        System.out.println(count+" Friends");
    }
}
