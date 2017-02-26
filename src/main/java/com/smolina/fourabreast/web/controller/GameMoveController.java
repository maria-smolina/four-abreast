package com.smolina.fourabreast.web.controller;

import com.smolina.fourabreast.database.model.GameMove;
import com.smolina.fourabreast.exception.IncorrectGameMoveException;
import com.smolina.fourabreast.service.GameMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GameMoveController {
    private GameMoveService gameMoveService;

    @RequestMapping(method = RequestMethod.POST, value = "/addGameMove")
    public void addGameMove(@RequestBody GameMove gameMove) {
        try {
            gameMoveService.checkAndSave(gameMove);
        } catch (IncorrectGameMoveException e) {

        }
    }

    @Autowired
    public void setGameMoveService(GameMoveService gameMoveService) {
        this.gameMoveService = gameMoveService;
    }
}
