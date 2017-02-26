package com.smolina.fourabreast.web.controller;

import com.smolina.fourabreast.database.model.Game;
import com.smolina.fourabreast.database.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class StartGameController {
    private GameRepository gameRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/startGame")
    public void startGame() {
        Game newGame = new Game();
        newGame.setId(1);
        newGame.setFirstUserId(1);
        newGame.setSecondUserId(2);
        int[][] board = new int[10][10];
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }
        newGame.setBoard(board);
        gameRepository.save(newGame);
    }

    @Autowired
    public void setGameRepository(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
}
