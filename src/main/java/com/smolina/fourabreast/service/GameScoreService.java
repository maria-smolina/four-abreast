package com.smolina.fourabreast.service;

import org.springframework.stereotype.Service;

@Service
public class GameScoreService {
    private static final int CELLS_ABREAST_WIN_NUMBER = 4;

    public int calculateUserScore(int userNumber, int[][] board) {
        int rowSize = board.length;
        int columnSize = board[0].length;
        CellScore[][] scores = new CellScore[rowSize][columnSize];
        for (int i = 0; i < rowSize; ++i) {
            for (int j = 0; j < columnSize; ++j) {
                scores[i][j] = new CellScore();
                if (board[i][j] == userNumber) {
                    scores[i][j].verticalScore = 1;
                    scores[i][j].horizontalScore = 1;
                    scores[i][j].diagonalScore = 1;
                    scores[i][j].invertedDiagonalScore = 1;
                    if (i > 0) {
                        scores[i][j].verticalScore = scores[i - 1][j].verticalScore + 1;
                    }
                    if (j > 0) {
                        scores[i][j].horizontalScore = scores[i][j - 1].horizontalScore + 1;
                    }
                    if (i > 0 && j > 0) {
                        scores[i][j].diagonalScore = scores[i - 1][j - 1].diagonalScore + 1;
                    }
                    if (i > 0 && j < columnSize - 1) {
                        scores[i][j].invertedDiagonalScore = scores[i - 1][j + 1].invertedDiagonalScore + 1;
                    }
                }
            }
        }
        int score = 0;
        for (int i = 0; i < rowSize; ++i) {
            for (int j = 0; j < columnSize; ++j) {
                if (scores[i][j].horizontalScore >= CELLS_ABREAST_WIN_NUMBER &&
                        (j == columnSize - 1 || board[i][j + 1] != userNumber)) {
                    ++score;
                }
                if (scores[i][j].verticalScore >= CELLS_ABREAST_WIN_NUMBER &&
                        (i == rowSize - 1 || board[i + 1][j] != userNumber)) {
                    ++score;
                }
                if (scores[i][j].diagonalScore >= CELLS_ABREAST_WIN_NUMBER &&
                        (i == rowSize - 1 || j == columnSize - 1 || board[i + 1][j + 1] != userNumber)) {
                    ++score;
                }
                if (scores[i][j].invertedDiagonalScore >= CELLS_ABREAST_WIN_NUMBER &&
                        (i == rowSize - 1 || j == 0 || board[i + 1][j - 1] != userNumber)) {
                    ++score;
                }
            }
        }
        return score;
    }

    private class CellScore {
        int horizontalScore;
        int verticalScore;
        int diagonalScore;
        int invertedDiagonalScore;
    }

}
