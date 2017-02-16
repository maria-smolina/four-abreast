package com.smolina.fourabreast.web.controller;

import com.smolina.fourabreast.database.model.GameMove;
import com.smolina.fourabreast.service.GameMoveCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GameMoveController {
    private GameMoveCheck gameMoveCheck;

    @RequestMapping(method = RequestMethod.POST, value = "/addGameMove")
    public void addGameMove(@RequestBody GameMove gameMove) {
        gameMoveCheck.check(gameMove);
    }

    @Autowired
    public void setGameMoveCheck(GameMoveCheck gameMoveCheck) {
        this.gameMoveCheck = gameMoveCheck;
    }
}
