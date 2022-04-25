package exam;

import java.util.Scanner;

public class BestMoviePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int eve = sc.nextInt();
        int night = sc.nextInt();

        PlanA planA = new PlanA();
        double costA = planA.calculateCost(day , eve , night);
        System.out.println("Plan A costs "+costA);
        PlanB planB = new PlanB();
        double costB = planB.calculateCost(day , eve , night);
        System.out.println("Plan B costs "+costB);
        if(costA == costB){
            System.out.println("Plan A and Plan B are the same price");
        }
        if(costA>costB){
            System.out.println("Plan B is cheapest");
        }else{
            System.out.println("Plan A is cheapest");
        }

    }
}

class PlanA{
    double costDay = 0.25;
    double costeve = 0.15;
    double costNight = 0.20;
    int free = 100;

    public double calculateCost(double day , double eve , double night){
        double sum=0;

        if(day<free){
            sum=0;
        }else{
            sum+= ((day-free)*costDay);
        }
        sum += (eve*costeve);
        sum += (night*costNight);
        return sum;
    }
}

class PlanB{
    double costDay = 0.45;
    double costeve = 0.35;
    double costNight = 0.25;
    int free = 250;

    public double calculateCost(double day , double eve , double night){
        double sum=0;
        if(day<free){
            sum=0;
        }else{
            sum+= ((day-free)*costDay);
        }
        sum += (eve*costeve);
        sum += (night*costNight);
        return sum;
    }
}
