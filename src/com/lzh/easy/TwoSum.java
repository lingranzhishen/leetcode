package com.lzh.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoSum {

    public static int[] findSum(int[]nums,int k){
        int [] result={0,1};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(k-nums[i])){
                result[1]=i;
                result[0]=map.get(k-nums[i]);
                return result;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
