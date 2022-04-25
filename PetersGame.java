package exam;

import java.util.Scanner;

public class PetersGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char [] array = str.toCharArray();
        int wins =0;
        int loss = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == '1')
                wins++;
            else
                loss++;
            if(wins>=10 && loss>=10){
                if(wins-loss == 2){
                    System.out.println("wins");
                    break;
                }else if(loss-wins==2){
                    System.out.println("losses");
                    break;
                }
            }else if(wins == 11 || wins==loss){
                System.out.println("wins");
                break;
            }else if(loss == 11){
                System.out.println("wins");
                break;
            }
        }
    }
}
