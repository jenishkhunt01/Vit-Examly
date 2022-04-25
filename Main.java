//package exam;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class Main{
//
//    static int turn=0;
//    static  int powerIron = 0;
//    static int powerCap = 0;
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] array = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            int value = sc.nextInt();
//            array[i] = value;
//        }
//        int li = 0;
//        int ri = n-1;
//
//        turnFunction(array , n , li , ri);
//
//    }
//
//    public static int turnFunction(int [] array  ,int n , int li , int ri){
//        if(turn == 0){
//            iron(array , n , li , ri);
//        }else{
//            capAme(array , n , li , ri);
//        }
//        return
//    }
//
//    public static int iron(int [] array , int n , int li , int ri){
//
//        if(array[li] > array[ri]){
//            powerIron+=left(array , n , li , ri);
//        }else{
//            powerIron += right(array , n , li , ri);
//        }
//        return powerIron;
//    }
//
//    public static int capAme(int [] array , int n , int li , int ri){
//        if(array[li] > array[ri]){
//            powerCap+=left(array , n , li , ri);
//        }else{
//            powerCap += right(array , n , li , ri);
//        }
//        return powerCap;
//    }
//
//    public static int left(int[] array, int n, int li, int ri){
//        int power=0;
//        while (array[li] > 0){
//            power+=array[li];
//            li+=1;
//        }
//        return power;
//    }
//
//    public static int right(int[] array, int n, int li, int ri){
//        int power=0;
//        while (array[ri] > 0){
//            power+=array[ri];
//            ri-=1;
//        }
//        return power;
//    }
//}