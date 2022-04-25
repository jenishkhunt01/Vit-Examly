package exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DFGHall {
    String name;
    String  contact;
    double perDay;
    String oName;

    public DFGHall(String name, String contact, double perDay, String oName) {
        this.name = name;
        this.contact = contact;
        this.perDay = perDay;
        this.oName = oName;
    }
    public DFGHall(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getPerDay() {
        return perDay;
    }

    public void setPerDay(double perDay) {
        this.perDay = perDay;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFGHall [] array = new DFGHall[n];
        double [] array2 = new double[n];
        sc.nextLine();
        for(int i =0 ; i< n ; i++){
            String name = sc.nextLine();
            String con = sc.nextLine();
            double cost= sc.nextDouble();
            sc.nextLine();
            String Oname = sc.nextLine();
            DFGHall dfgHall =  new DFGHall(name, con, cost, Oname);
            array[i] = dfgHall;
            array2[i] = cost;
        }
        Arrays.sort(array2);
        for(int i=0 ; i< n ; i++){
            for(int j = 0 ; j< n ; j++){
                if(array[j]!=null) {
                    if (array[j].getPerDay() == array2[i]) {
                        System.out.println(array[j].getName() + " " + array[j].getContact() + " " + array[j].getPerDay() + " " + array[j].getoName());
                        array[j] = null;
                    }
                }
            }
        }
    }
}
