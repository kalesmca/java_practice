package com.scalar.dsa1.bitmanupulations;

public class DuplicateValueCount {
    public static void twoUnizeVal(int[] arr){
        int xorVal = 0;
        for(int data:arr){
            xorVal = xorVal ^ data;
        }
        int index = -1;
        for(int i=0;i<32;i++){
            if((xorVal & (1<<i))>0){
                index = i;
                break;
            }
        }
        int setValue =0;
        int unSetValue=0;
        for(int data:arr){
            if((data & (1<<index))>0){
                setValue = setValue ^ data;
            } else {
                unSetValue = unSetValue ^ data;
            }
        }
        System.out.println("result="+setValue+": unset= "+unSetValue);

    }
    public static void main(String[] args){
        int[] arr = { 2,3,5,6,3,6,2};
        int ans=0;
        for(int i=0;i<32;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if((arr[j] & (1<<i)) >0){
                    count ++;
                }
            }
            if((count &1) >0){
                ans = ans | (1<<i);
            }

        }
        System.out.println("Result ="+ans);

        System.out.println("============================= new ================================");
        int[] input = {4 , 5 , 4 , 1 , 6 , 6 , 5 , 2};
        twoUnizeVal(input);
    }
}
