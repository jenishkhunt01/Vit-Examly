package exam;

import java.util.Scanner;

public class AngleBetweenHourAndMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time=sc.next();
        int hour = 0;
        int min;
        StringBuffer stringBuffer=new StringBuffer();
        for (char ch: time.toCharArray()){
            if(ch==':'){
                hour=Integer.parseInt(stringBuffer.toString());
                stringBuffer.delete(0, stringBuffer.length());
            }else
                stringBuffer.append(ch);
        }
        min=Integer.parseInt(stringBuffer.toString());
        hour=hour*5;
        if(min==60){
            min=0;
        }
        int temp=hour;
        float mindegree=0;
        if(min!=0){
            for(int i=hour+1;i<=60;i++){
                mindegree++;
                if(i==60){
                    i=0;
                }
                if(i==min){
                    break;
                }
            }
        }else{
            for(int i=hour+1;i<=60;i++){
                mindegree++;
            }
        }
        mindegree=mindegree*6;
        if(min%2!=0){
            mindegree-=0.5;
        }
        mindegree-=min/2;
        if(mindegree>180){
            mindegree=360-mindegree;
        }
        System.out.println(mindegree);


    }
}