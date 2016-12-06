package com.smolina.fiveabreast.web.controller;

import com.smolina.fiveabreast.model.GameMove;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GameMoveController {

    @RequestMapping(method= RequestMethod.POST, value="/gameMove")
    public void gameMove(@RequestBody GameMove gameMove) {
        //saving to db
    }

}
