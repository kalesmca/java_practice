package com.scalar.dsa1;
import java.io.*;
import java.util.HashSet;

public class FirstMissingNaturalsNumber {
    public static void main(String[] args){
        int[] input = {3,-2,1,2,7};
        HashSet<Integer> hs = new HashSet<>();
        for (int j : input) {
            hs.add(j);
        }
        for(int i=1;i<input.length;i++){
            if(!hs.contains((i))){
                System.out.println("Result = "+i);
                break;
            }
        }

    }



}
