package exam;

import java.util.Arrays;
import java.util.Scanner;

public class JadeLuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] contest = new int[n][2];
        int important = 0;
        int luck = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                contest[i][j] = sc.nextInt();
                if (contest[i][1] == 1)
                    important++;
            }
        }


        int toWin = important - k;

        int[] impArray = new int[important];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (contest[i][1] == 1) {
                impArray[count++] = contest[i][0];
            }
        }

        Arrays.sort(impArray);
        System.out.println(Arrays.toString(impArray)
        );

        for (int i = 0; i < n; i++) {
            luck += contest[i][0];
        }
        for (int i = 0; i < toWin; i++) {
            luck -= 2 * impArray[i];

        }

        System.out.println(luck);


    }

}
