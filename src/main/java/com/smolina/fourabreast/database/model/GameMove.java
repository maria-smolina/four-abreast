package com.smolina.fourabreast.database.model;

import javax.persistence.*;

@Entity
@Table(name = "game_move")
public class GameMove {
    @Id
    @GeneratedValue(generator = "game_move_id_seq")
    @SequenceGenerator(sequenceName = "game_move_id_seq", name = "game_move_id_seq")
    private Integer id;

    @Column(name = "game_id")
    private Integer gameId;

    @Column(name = "sender_id")
    private Integer senderId;

    private String type;

    private Integer row;

    private Integer col;

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

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    //    public TwoDimensionalFieldPosition getPosition() {
//        return position;
//    }
//
//    public void setPosition(TwoDimensionalFieldPosition position) {
//        this.position = position;
//    }
}
