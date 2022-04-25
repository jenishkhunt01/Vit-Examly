package exam;

import java.util.Scanner;


public class SingleFileProgramming {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String fname = sc.next();
        String lname = sc.next();
        int id =sc.nextInt();
        int n = sc.nextInt();
        int [] scores = new int[n];
        for (int i=0 ; i< n;i++){
            scores[i] = sc.nextInt();
        }
        Student student = new Student(fname , lname , id , scores);
        System.out.println("Name: "+lname+" "+fname);
        System.out.println("ID: "+id);
        System.out.println("Grade: "+student.cal());
    }

}

class Person{

}

class Student extends Person{

    String fname,lname;
    int id;
    int [] scores;

    public Student(String fname , String lname , int id , int[] scores){
        this.fname = fname;
        this.lname=lname;
        this.id = id;
        this.scores = scores;
    }

    public char cal(){
        int sum =0;
        int len = scores.length;
        for(int i=0 ; i< len ;i++){
            sum+=scores[i];
        }
        int average = sum/len;
        char g;
        if(average >= 90 && average <=100)
            g= 'O';
        else if(average >= 80 && average <90)
            g='E';
        else if(average >= 70 && average <80)
            g='A';
        else if(average >= 55 && average <70)
            g='P';
        else if(average >= 40 && average <55)
            g='D';
        else
            g='T';
        return g;
    }

}
