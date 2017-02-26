package com.smolina.fourabreast.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game_board")
public class Game {
    @Id
    private Integer id;

    @Column(name = "board")
    private int[][] board;

    @Column(name = "first_user_id")
    private Integer firstUserId;

    @Column(name = "second_user_id")
    private Integer secondUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public Integer getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(Integer firstUserId) {
        this.firstUserId = firstUserId;
    }

    public Integer getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(Integer secondUserId) {
        this.secondUserId = secondUserId;
    }
}
