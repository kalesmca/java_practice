package com.scalar.dsa1.bitmanupulations;

public class Bitwise {
    public static boolean checkIsSetOrNot(int n, int index){
        if((n & (1<<index)) >0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.println("");
        int n=12;
        int pos = 3;
        boolean status = checkIsSetOrNot(n,pos);
        System.out.println(("result = "+status));
        int ans=0;
        for(int i=0;i<n;i++){
            if(checkIsSetOrNot(n, i)){
                ans++;
            }
        }
        System.out.println("count = "+ans);

    }
}
