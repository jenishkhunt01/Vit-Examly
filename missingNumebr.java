package algo;

public class missingNumebr {
    public static void main(String[] args) {
        int [] array1 = {1,3,5,7,6,8,2};
        int n = array1.length +1;
        var missing = new missingNumebr();
        System.out.println(missing.find(n , array1));

    }

    public int find(int n , int [] array){
        int sum = (n*(n+1))/2;

        for(int i =0 ; i < n-1 ; i++){
            sum-= array[i];
        }
        return sum;
    }
}
