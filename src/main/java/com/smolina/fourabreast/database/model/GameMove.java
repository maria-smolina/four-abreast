package com.smolina.fourabreast.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "game_move")
public class GameMove {
    @Id
    private Integer id;

    @Column(name = "game_id")
    private Integer gameId;

    @Column(name = "sender_id")
    private Integer senderId;

    private String type;

    private Integer row;

    private Integer column;

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

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    //    public TwoDimensionalFieldPosition getPosition() {
//        return position;
//    }
//
//    public void setPosition(TwoDimensionalFieldPosition position) {
//        this.position = position;
//    }
}
