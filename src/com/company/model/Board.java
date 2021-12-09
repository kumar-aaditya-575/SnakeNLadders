package com.company.model;

import java.util.List;
import java.util.Map;

public class Board {
    int size;
    Map<Integer,Snake> snakePos;
    Map<Integer, Ladder> ladderPos;
    List<Player> playerList;

    public Board(int size, Map<Integer, Snake> snakePos, Map<Integer, Ladder> ladderPos, List<Player> playerList) {
        this.size = size;
        this.snakePos = snakePos;
        this.ladderPos = ladderPos;
        this.playerList = playerList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map<Integer, Snake> getSnakePos() {
        return snakePos;
    }

    public void setSnakePos(Map<Integer, Snake> snakePos) {
        this.snakePos = snakePos;
    }

    public Map<Integer, Ladder> getLadderPos() {
        return ladderPos;
    }

    public void setLadderPos(Map<Integer, Ladder> ladderPos) {
        this.ladderPos = ladderPos;
    }
}
