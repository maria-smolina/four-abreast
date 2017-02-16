package com.smolina.fourabreast.service;

import com.smolina.fourabreast.database.model.Game;
import com.smolina.fourabreast.database.model.GameMove;
import com.smolina.fourabreast.database.repository.GameMoveRepository;
import com.smolina.fourabreast.database.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GameMoveCheck {
    private GameMoveRepository gameMoveRepository;

    private GameRepository gameRepository;

    public void check(GameMove gameMove) {
        Game game = gameRepository.findOne(gameMove.getGameId());
        String board = game.getBoard();

    }

    private void isGameMoveValid(GameMove gameMove, String board) {

    }

    @Autowired
    public void setGameMoveRepository(GameMoveRepository gameMoveRepository) {
        this.gameMoveRepository = gameMoveRepository;
    }

    @Autowired
    public void setGameRepository(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }
}
