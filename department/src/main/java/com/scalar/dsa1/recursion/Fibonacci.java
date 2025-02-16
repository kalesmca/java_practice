package com.scalar.dsa1.recursion;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        int n=25;
        ArrayList<Integer> result =new ArrayList<>(Arrays.asList(0,1)) ;

        for(int i=2;i<n;i++){
            result.add(i, result.get(i-1)+result.get(i-2)) ;
        }
        System.out.println("result ="+ result);
    }
}
