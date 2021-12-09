package com.company;

import com.company.model.Board;
import com.company.model.Ladder;
import com.company.model.Player;
import com.company.model.Snake;
import com.company.service.GameService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int boardSize = 100;
        int s; int l;
        List<Snake> snakeList = new ArrayList<>();
        List<Ladder> ladderList = new ArrayList<>();
        Map<Integer, Snake> snakeMap = new HashMap<>();
        Map<Integer, Ladder> ladderMap = new HashMap<>();

        Player p1 = new Player(1, 0, "A10");
        Player p2 = new Player(1, 1, "Ikka");

        Scanner sc = new Scanner(System.in);

        s = sc.nextInt();

        for(int i = 0; i < s; i++){
            int st = sc.nextInt();
            int end = sc.nextInt();
            //snakeList.add();
            snakeMap.put(st , new Snake(st, end));

        }

        l = sc.nextInt();

        for(int i = 0; i < l; i++){
            int st = sc.nextInt();
            int end = sc.nextInt();
            //ladderList.add();
            ladderMap.put(st, new Ladder(st, end));

        }

        List<Player> playerList = Arrays.asList(p1 , p2);

        Board board = new Board(boardSize, snakeMap, ladderMap, playerList);

        GameService gs = new GameService(board, playerList);

        gs.runGame();


    }
}
