package com.smolina.fourabreast.web.controller;

import com.smolina.fourabreast.database.model.GameMove;
import com.smolina.fourabreast.database.repository.GameMoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GameMoveController {

    @Autowired
    GameMoveRepository gameMoveRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/addGameMove")
    public void addGameMove(@RequestBody GameMove gameMove) {
        gameMoveRepository.findAll();
        gameMoveRepository.save(gameMove);

    }

}
