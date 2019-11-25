package com.orange.leetcode.problems.arrays;

import java.util.Arrays;
import java.util.Collections;

public class CheckPermutation {

    public static void main(String[] args) {
        CheckPermutation checkPermutation = new CheckPermutation();
        System.out.println(checkPermutation.permutation("abc", "bca"));
        System.out.println(checkPermutation.permutation("shantanu", "shtannuu"));
    }

    public String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if(sort(s).equals(sort(t))) {
            return true;
        } else {
            return false;
        }
    }
}
