package algo;

public class leader {
    public static void main(String[] args) {
        int [] array = {16,17,19,5,4,12};
        var leader = new leader();
        leader.leader(array);

    }

    public void leader(int [] array){
        int n = array.length;

        for(int i = 0 ; i < n ; i++){
            int j;
            for(j = i+1 ; j<n ; j++){
                if(array[i] <= array[j])
                    break;
            }
            if(j==n){
                System.out.println(array[i]);
            }
        }

    }
}
