package com.orange.leetcode.problems.arrays;

public class UniqueCharacters {

    public static void main(String[] args) {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        boolean result = uniqueCharacters.uniqueCharacters("shantanu");
        //System.out.println("Result : " + result);
        System.out.println(uniqueCharacters.uniqueCharacters1("shantu"));

    }

    boolean uniqueCharacters(String str) {
        if (str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println(val);
            //System.out.println(char_set[val]);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    boolean uniqueCharacters1(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
