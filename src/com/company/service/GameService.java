package com.company.service;

import com.company.model.Board;
import com.company.model.Player;

import java.util.List;

public class GameService {
    Board gameBoard;
    List<Player> playerList;
    boolean gameOver;
    TurnService turnService;

    public GameService(Board gameBoard,List<Player> playerList) {
        this.gameBoard = gameBoard;
        this.playerList = playerList;
        this.gameOver = false;
    }
    public void runGame(){
        turnService = new TurnService(gameBoard);
        int playerNum = 0; int maxTurn = gameBoard.getPlayerList().size();
        int turns = 0;
        while(!gameOver){
            playerNum %= maxTurn;

            int pos = turnService.playerTurn(playerNum);
            if(pos == gameBoard.getSize()) {
                System.out.println(gameBoard.getPlayerList().get(playerNum).getName() +" is the Winner!!");
                gameOver = true;
                return;
            }

            playerNum++;
            turns++;

            if( turns > 100) break;

        }

        System.out.println("Turn Limit Exceeded: No winners");
    }
}
