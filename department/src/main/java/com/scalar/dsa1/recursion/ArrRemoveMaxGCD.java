package com.scalar.dsa1.recursion;

public class ArrRemoveMaxGCD {
    public static int gcd (int big, int small){
        if(small == 0)
            return big;

        return gcd(small, big%small);
    }

    public static void main(String[] args){
        System.out.println(gcd(15,5));
        int[] arr = {24,16,18,30,15};
        int n= arr.length;
        int[] suffGcd = new int[n];
        int sCurGcd =0;
        for(int i=n-1;i>=0;i--){
            sCurGcd= gcd(arr[i], sCurGcd);
            suffGcd[i] = sCurGcd;
        }
        System.out.println("Suffic");

        for(int i=0;i<n;i++){
            System.out.print(" "+suffGcd[i]);
        }

        int ans=1;
        int curGcd =0;
        for(int i=0;i<n;i++){
            if(i != n-1){
                ans = Math.max(ans, gcd(suffGcd[i+1], curGcd));
            }else {
                ans = Math.max(ans, curGcd);
            }
            curGcd = gcd(arr[i],curGcd);
        }

        System.out.println("Ans = "+ans);
    }
}
