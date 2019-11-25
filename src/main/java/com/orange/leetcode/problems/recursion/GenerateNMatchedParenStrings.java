package com.orange.leetcode.problems.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateNMatchedParenStrings {


    public static void main(String[] args) {

    }

    public static List<String> generateParenthesis(int numPairs) {
        List<String> result = new ArrayList<>();
        directedGenerateBalancedParentheses(numPairs, numPairs, "", result);
        return result;
    }

    public static void directedGenerateBalancedParentheses(int numLeftParensNeeded, int numRightParensNeeded,
                                                    String parenStringInProgress, List<String> result) {

    }
}
