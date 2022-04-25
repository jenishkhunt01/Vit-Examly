package exam;



import java.util.LinkedList;
import java.util.Scanner;

public class LineCount {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int count=0;
        list.add(sc.nextLine());
        count++;
        while (!list.remove().equals("q")){
            list.add(sc.nextLine());
            count++;
        }
        System.out.println(count-1);
    }
}
