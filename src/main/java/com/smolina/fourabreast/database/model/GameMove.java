package com.smolina.fourabreast.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GAME_MOVE")
public class GameMove {

    @Id
    private Integer id;

    @Column(name = "GAME_ID")
    private Integer gameId;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "ROW")
    private Integer row;

    @Column(name = "COLUMN")
    private Integer column;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    //    private TwoDimensionalFieldPosition position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }


//    public TwoDimensionalFieldPosition getPosition() {
//        return position;
//    }
//
//    public void setPosition(TwoDimensionalFieldPosition position) {
//        this.position = position;
//    }
}
