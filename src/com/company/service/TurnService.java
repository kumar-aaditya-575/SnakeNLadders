package com.company.service;

import com.company.model.Board;
import com.company.model.Player;

public class TurnService {
    Board board;

    public TurnService(Board board) {
        this.board = board;
    }

    public int playerTurn(int playerID){
        if(playerID < 0) return -1;
        if(playerID >= board.getPlayerList().size()) return -1;

        Player p = board.getPlayerList().get(playerID);
        int dieRoll = DieService.rollDie();

        System.out.print(p.getName() + " rolled " + dieRoll);
        int newPos = p.getPos() + dieRoll;

        if( newPos > board.getSize()) {
            System.out.println(", Board Limit Exceeded");
            return p.getPos();
        }
        if( board.getSnakePos().containsKey(newPos)) {
            System.out.print(", Snake at" + newPos);
            newPos = board.getSnakePos().get(newPos).getEnd();

        }

        if( board.getLadderPos().containsKey(newPos)) {
            System.out.print(", Ladder at" + newPos);
            newPos = board.getLadderPos().get(newPos).getEnd();
        }

        System.out.println(", Landed at " + newPos);


        p.setPos(newPos);
        return newPos;
    }
}
