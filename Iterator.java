package exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Iterator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Stall [] collection = new Stall[n];
        for(int i =0 ; i<n ; i++){
            Stall stall = new Stall(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            collection[i] = stall;
        }

        for(int i =0 ; i< n ; i++){
            Stall iterator = collection[i];
            System.out.println(iterator.getName()+" "+iterator.getDetail()+" "+iterator.getType()+" "+iterator.getOwnerName());
        }
        iterator();
        hasNext();
    }

    public static void iterator(){

    }
    public static void hasNext(){

    }

}
class Stall{
    public String name;
    public String detail;
    public String type;
    public String OwnerName;

    public Stall(String name, String detail, String type, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        OwnerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
