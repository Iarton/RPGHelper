/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class TP_Player {
    private Player player;
    private ArrayList<TP> tp;

    public TP_Player(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<TP> getTp() {
        return tp;
    }

    public void setTp(ArrayList<TP> tp) {
        this.tp = tp;
    }
    
    
}
