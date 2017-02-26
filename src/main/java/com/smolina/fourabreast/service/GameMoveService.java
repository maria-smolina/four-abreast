package com.smolina.fourabreast.service;

import com.smolina.fourabreast.database.model.Game;
import com.smolina.fourabreast.database.model.GameMove;
import com.smolina.fourabreast.database.repository.GameRepository;
import com.smolina.fourabreast.exception.IncorrectGameMoveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameMoveService {
    private GameRepository gameRepository;
    private GameScoreService gameScoreService;

    private static final int FIRST_USER_NUMBER = 1;
    private static final int SECOND_USER_NUMBER = 2;

    public void checkAndSave(GameMove gameMove) throws IncorrectGameMoveException {
        Game game = gameRepository.findOne(gameMove.getGameId());
        int[][] board = game.getBoard();
        int userNumber = game.getFirstUserId().equals(gameMove.getSenderId()) ?
                FIRST_USER_NUMBER : SECOND_USER_NUMBER;

        isGameMoveValid(gameMove, board);

        board[gameMove.getRow()][gameMove.getCol()] = userNumber;

        int firstUserScore = gameScoreService.calculateUserScore(FIRST_USER_NUMBER, board);
        int secondUserScore = gameScoreService.calculateUserScore(SECOND_USER_NUMBER, board);

        game.setBoard(board);
        gameRepository.save(game);
    }

    private void isGameMoveValid(GameMove gameMove, int[][] board) throws IncorrectGameMoveException {
        int row = gameMove.getRow();
        int column = gameMove.getCol();
        if (row < 0 || row >= board.length ||
            column < 0 || column >= board[0].length) {
            throw new IncorrectGameMoveException("Out of board's bounds");
        }
        if (board[row][column] != 0) {
            throw new IncorrectGameMoveException("Cell is occupied");
        }
        if (row > 0 && board[row - 1][column] == 0) {
            throw new IncorrectGameMoveException("Bottom cell is empty");
        }
    }

    @Autowired
    public void setGameRepository(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Autowired
    public void setGameScoreService(GameScoreService gameScoreService) {
        this.gameScoreService = gameScoreService;
    }
}
