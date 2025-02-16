package com.College.Practice;

public class QuerySum {
    public static void main(String[] args){
        int[][] query = {{1,3,2},{2,5,3},{5,6,-1}};
        int n =7;
        int[] input = new int[n];
        for (int[] ints : query) {
            int s = ints[0];
            int e = ints[1];
            int v = ints[2];
            input[s] += v;
            if (e < n - 1) {
                input[e + 1] -= v;
            }
        }
        int[] prefix = new int[n];
        prefix[0] = input[0];
        for (int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+input[i];

        }
        System.out.println("Result = ");
        for(int i=0;i<n;i++){
            System.out.print(" "+prefix[i]);
        }


    }
}
