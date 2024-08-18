package com.hdu;


class Solution {
    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int countA = 0;
        int countL = 0;
        int maxL = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                countA++;
            }
            if (chars[i] == 'L') {
                if(i==0||chars[i-1]=='L') {
                    countL++;
                }else countL=1;
                maxL = Math.max(maxL,countL);
            }
        }
        return countA <= 1 && maxL <= 2;
    }
}