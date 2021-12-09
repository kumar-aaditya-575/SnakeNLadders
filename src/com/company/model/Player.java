package com.company.model;

public class Player {
    int pos;
    int id;
    String name;

    public Player(int pos, int id, String name) {
        this.pos = pos;
        this.id = id;
        this.name = name;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
