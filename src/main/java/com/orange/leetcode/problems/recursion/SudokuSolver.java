package com.orange.leetcode.problems.recursion;

public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        this.board = board;

        // Initialize rows, cols & boxes
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

            }
        }
    }


    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver();
        char[][] board = {
                {5, 3, '.', '.', 7, '.', '.', '.', '.'},
                {6, '.', '.', 1, 9, 5, '.', '.', '.'},
                {'.', 9, 8, '.', '.', '.', '.', 6, '.'},
                {8, '.', '.', '.', 6, '.', '.', '.', 3},
                {4, '.', '.', 8, '.', 3, '.', '.', 1},
                {7, '.', '.', '.', 2, '.', '.', '.', 1},
                {'.', 6, '.', '.', '.', '.', 2, 8, '.'},
                {'.', '.', '.', 4, 1, 9, '.', '.', 5},
                {'.', '.', '.', '.', 8, '.', '.', 7, 9}
        };
        sudokuSolver.solveSudoku(board);
    }

    // box size
    int n = 3;
    // row size
    int N = n * n;

    int[][] rows = new int[N][N + 1];
    int[][] columns = new int[N][N + 1];
    int[][] boxes = new int[N][N + 1];

    char[][] board;

}
