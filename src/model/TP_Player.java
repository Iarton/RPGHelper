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
    private ArrayList<TP> tps;

    public TP_Player(Player player) {
        this.player = player;
        tps = new ArrayList<TP>();
        player.setTpc(this);
    }

    public Player getPlayer() {
        return player;
    }
    
    public void addTp(TP tp){
        tps.add(tp);
    }
    
    
}
