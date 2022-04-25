package algo;
import java.util.Scanner;
import java.util.Arrays;

class combinatins {
    static int count;
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            int a=ob.nextInt();
            arr[i]=a;
        }
        int target = ob.nextInt();
        Arrays.sort(arr);
        max(arr, target);
    }
    static void max(int[]arr, int target){

        while(target!=0){
            if(target>=arr[3]){
                count++;
                target=target-arr[3];
//                break;
            }else if(target>=arr[2]){
                count++;
                target=target-arr[2];
//                break;
            }else if(target>=arr[1]){
                count++;
                target=target-arr[1];
//                break;
            }else if(target>=arr[0]){
                count++;
                target=target-arr[0];
//                break;
            }
        }
//        max(arr,target);        
        System.out.println("Minimum Tickets Required"+count);
    }
}