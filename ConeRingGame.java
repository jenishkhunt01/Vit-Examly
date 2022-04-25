package DataStructureWithMosh.Stacks.Examly;
import java.util.Arrays;
import java.util.Scanner;

public class ConeRingGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int size = (int) Math.pow(2, n);
        int arr[] = new int[size+1];
        String arrcolor[] = new String [size+1];
        int cone=1;
        int si=0;
        int a=1;
        int newc=1;
        while (a<=n){
            for(int i=1;i<arr.length;i++){
                if(arr[i]==0){
                    si=i;
                    break;
                }
            }
            int power = (int) Math.pow(2, a);
            for(int i=si;i<arr.length;i+=power){
                if(newc == 1){
                    if(a%2!=0){
                        arr[i]=a;
                        if(n%2==0){
                            if(cone==1){
                                arrcolor[i]=" from Red to Pink";
                                cone=2;
                            }else if(cone==2){
                                arrcolor[i]=" from Pink to Blue";
                                cone=3;
                            }else{
                                arrcolor[i]=" from Blue to Red";
                                cone=1;
                            }
                        }else{
                            if(cone==1){
                                arrcolor[i]=" from Red to Blue";
                                cone=2;
                            }else if(cone==2){
                                arrcolor[i]=" from Blue to Pink";
                                cone=3;
                            }else{
                                arrcolor[i]=" from Pink to Red";
                                cone=1;
                            }
                        }
                        newc=2;
                    }else{
                        arr[i]=a;
                        if(n%2==0){
                            if(cone==1){
                                arrcolor[i]=" from Red to Blue";
                                cone=2;
                            }else if(cone==2){
                                arrcolor[i]=" from Blue to Pink";
                                cone=3;
                            }else{
                                arrcolor[i]=" from Pink to Red";
                                cone=1;
                            }
                        }else{
                            if(cone==1){
                                arrcolor[i]=" from Red to Pink";
                                cone=2;
                            }else if(cone==2){
                                arrcolor[i]=" from Pink to Blue";
                                cone=3;
                            }else{
                                arrcolor[i]=" from Blue to Red";
                                cone=1;
                            }
                        }

                    }
                }else{
                    arr[i]=a;
                    if(n%2==0){
                        if(cone==1){
                            arrcolor[i]=" from Red to Pink";
                            cone=2;
                        }else if(cone==2){
                            arrcolor[i]=" from Pink to Blue";
                            cone=3;
                        }else{
                            arrcolor[i]=" from Blue to Red";
                            cone=1;
                        }
                    }else{
                        if(cone==1){
                            arrcolor[i]=" from Red to Blue";
                            cone=2;
                        }else if(cone==2){
                            arrcolor[i]=" from Blue to Pink";
                            cone=3;
                        }else{
                            arrcolor[i]=" from Pink to Red";
                            cone=1;
                        }
                    }
                }
            }
            a++;
            newc=1;
            cone=1;
        }

        for(int i=1;i<arr.length-1;i++){
            System.out.println("Shift "+ arr[i]+arrcolor[i]);
        }
    }
}