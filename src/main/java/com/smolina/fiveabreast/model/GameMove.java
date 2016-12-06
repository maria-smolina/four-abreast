package com.smolina.fiveabreast.model;

public class GameMove {
    private String userLogin;
    private String enemyLogin;
    private TwoDimensionalFieldPosition position;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getEnemyLogin() {
        return enemyLogin;
    }

    public void setEnemyLogin(String enemyLogin) {
        this.enemyLogin = enemyLogin;
    }

    public TwoDimensionalFieldPosition getPosition() {
        return position;
    }

    public void setPosition(TwoDimensionalFieldPosition position) {
        this.position = position;
    }
}
