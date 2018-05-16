package com.example.nolit.collaborationworldofteamcraft;

/**
 * Created by lixir on 16.05.18.
 */

public class Users {
    private int id;
    private  String name;

    public Users(int idIn,String nameIn){
        this.id=idIn;
        this.name=nameIn;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
