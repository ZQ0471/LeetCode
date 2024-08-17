package com.hdu;

import java.util.Arrays;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[] nums = new int[k];
        for (int i = 0; i < k; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int count = 0;
        int min = Integer.MAX_VALUE;
        if(nums[nums.length - 1]-nums[0]==0){
            System.out.println(0);
            return;
        }
        while (true) {
            count++;
            int newMin = nums[nums.length - 1] - nums[0];
            if (min <= newMin) {
                break;
            }
            min = newMin;
            if(min==0) {break;}
            nums[nums.length - 1]--;
            nums[0]++;
            Arrays.sort(nums);
        }
        System.out.println(count);
    }
}