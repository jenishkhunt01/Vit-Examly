package exam;

import java.util.Scanner;

public class EmployeeLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        float sal = sc.nextFloat();
        if(sal>100){
            System.out.println(id);
            System.out.println(sal);
            System.out.println('1');
        }
        else {
            System.out.println(id);
            System.out.println(sal);
            System.out.println('2');
        }
    }
}
