package exam;

import java.util.Scanner;

public class newFile {
    static int turn = 0;
    static int povcap = 0;
    static int poviron = 0;
    static int li=0;
    static int ri=0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        li=0;
        ri=n-1;
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            array[i] = value;
        }
        turnfunction(array);
        int result;
        if(povcap>poviron){
            result = povcap-poviron;
        }else{
            result = poviron-povcap;
        }
        System.out.print(result);
    }

    public static void turnfunction(int [] array){
        if(turn == 0){
            powercaptain(array);
        }else{
            poweriron(array);
        }
    }

    public static void powercaptain(int [] array){
        int power = 0;
        int captain = callfunction(array, power);
        povcap += captain;
        turn = 1;
        if(li<ri){
            turnfunction(array);
        }else if(ri>=0){
            poviron += array[ri];
        }
    }

    public static void poweriron(int [] array){
        int power = 0;
        int iron = callfunction(array, power);
        poviron += iron;
        turn = 0;
        if(li<ri){
            turnfunction(array);
        }else if(li<=array.length-1){
            povcap += array[li];
        }
    }

    public static int callfunction(int [] array, int power){
        int upd;
        if(array[li]>array[ri]){
            upd = left(array, power);
        }else{
            upd = right(array, power);
        }
        return upd;
    }

    public static int left(int [] array, int power){
        // int count = 0;
        // if(count == 0){
        power += array[li];
        li++;
        // }
        if(power>0){
            while(array[li]>0){
                power+=array[li];
                li++;
                if(li>array.length-1){
                    break;
                }
            }
        }
        return power;
    }
    public static int right(int [] array, int power){
        // int count = array.length-1;
        // if(count == array.length-1){
        power += array[ri];
        ri--;
        // }
        if(power>0){
            while(array[ri]>0){
                power+=array[ri];
                ri--;
                if(ri<0){
                    break;
                }
            }
        }

        return power;
    }
}
