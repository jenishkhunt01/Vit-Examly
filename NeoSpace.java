package exam;

import java.io.*;
import java.util.*;
import java.text.*;

class NeoSpace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for(int i = 0; i < m; i++) {
            c[i] = in.nextInt();
        }
        Arrays.sort(c);
        int mdx = Math.max(c[0], n - c[c.length - 1] - 1);
        for(int i = 0; i < m - 1; i++) {
            mdx = Math.max((c[i + 1] - c[i]) / 2, mdx);
        }
        System.out.println(mdx);
    }
}