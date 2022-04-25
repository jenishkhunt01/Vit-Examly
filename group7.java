package algo;
import java.sql.SQLOutput;
import java.util.Scanner;

class group7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int N = sc.nextInt();
        long [] arr = new long[N];
        for(int i = 0 ; i <N ; i++){
            arr[i] = sc.nextLong();
        }

        int k = 1;
        int i=0;
        long max=0;
        long [] B = new long[N];
        int c=0;
        for(k = 1; k<=N ; k++){
            int sum=0;
            if(k==1){
                for( i = 0 ; i < N ;i++){
                    sum += arr[i];
                }
                if(sum>max){
                    max=sum;
                }
                B[c] = sum;
            }else{
                for( i=k-1 ; i<N ; i++ ){
                    sum+= arr[i];
                }
                if(sum>max){
                    max=sum;
                }
                B[c] = sum;
            }
            c++;
        }

        for( c = 0 ; c < N ; c++){
            if(B[c] == max){
                System.out.println(i);
            }
        }
    }
}

