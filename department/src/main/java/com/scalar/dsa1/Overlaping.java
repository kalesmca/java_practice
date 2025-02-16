package com.scalar.dsa1;
import java.util.*;
public class Overlaping {
    public static void main(String[] args){
        Integer[][] qurey = {{0,2}, {1,4}, {5,6}, {6,8}, {7,10}, {8,9}, {12,14}};

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(qurey[0]));
        result.add(li);
        System.out.println(result);
        for(int i=1;i<qurey.length;i++){
            int resultIndex = result.size()-1;
            int s2=qurey[i][0];
            int e2=qurey[i][1];
            int s1=result.get(resultIndex).get(0);
            int e1=result.get(resultIndex).get(1);
            System.out.println("e1:"+e1+":s2="+s2);
            if(e1>=s2){
                result.get(resultIndex).set(0, Math.min(s1,s2));
                result.get(resultIndex).set(1, Math.max(e1,e2));
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(s2);
                list.add(e2);
                result.add(list);
            }

        }
        System.out.println("Result= "+result);


    }
}
