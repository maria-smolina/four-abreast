package com.smolina.fourabreast.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class GameScoreServiceTest {
    private static GameScoreService gameScoreService;

    @BeforeClass
    public static void prepare() {
        gameScoreService = new GameScoreService();
    }

    @Test
    public void testCalculateUserScoreEmptyBoard() {
        int[][] board = new int[10][10];
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }
        int firstUserScore = 0;
        int secondUserScore = 0;
        testCalculateUserScore(board, firstUserScore, secondUserScore);
    }

    @Test
    public void testCalculateUserScoreHalfFilledBoard() {
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 2, 0},
                {0, 0, 0, 1, 2, 1, 1, 0, 2, 0},
                {0, 0, 1, 2, 2, 2, 1, 0, 2, 0},
                {0, 0, 2, 2, 2, 2, 2, 2, 2, 0}
        };
        int firstUserScore = 3;
        int secondUserScore = 2;
        testCalculateUserScore(board, firstUserScore, secondUserScore);
    }

    @Test
    public void testCalculateUserScoreFilledBoard() {
        int[][] board = {
                {0, 0, 1, 1, 1, 2, 2, 1, 1, 0},
                {0, 0, 2, 1, 2, 2, 2, 2, 2, 2},
                {0, 0, 1, 2, 1, 2, 1, 2, 1, 2},
                {0, 0, 1, 1, 1, 2, 2, 2, 1, 1},
                {0, 0, 1, 1, 1, 1, 2, 2, 2, 1},
                {0, 0, 1, 1, 2, 1, 1, 2, 1, 1},
                {0, 0, 2, 2, 2, 2, 1, 2, 1, 2},
                {0, 0, 1, 2, 1, 2, 1, 1, 1, 2},
                {0, 0, 1, 1, 2, 2, 1, 1, 2, 2},
                {1, 1, 1, 1, 1, 2, 1, 1, 1, 2}
        };
        int firstUserScore = 6;
        int secondUserScore = 8;
        testCalculateUserScore(board, firstUserScore, secondUserScore);
    }

    private void testCalculateUserScore(int[][] board, int firstUserScore, int secondUserScore) {
        int firstUserNumber = 1;
        int secondUserNumber = 2;
        Assert.assertEquals(gameScoreService.calculateUserScore(firstUserNumber, board), firstUserScore);
        Assert.assertEquals(gameScoreService.calculateUserScore(secondUserNumber, board), secondUserScore);
    }
}
