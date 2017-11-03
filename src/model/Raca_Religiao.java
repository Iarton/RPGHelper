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
public class Raca_Religiao {
    private Raca raca;
    private ArrayList<Religiao> religiao;

    public Raca_Religiao(Raca raca) {
        this.raca = raca;
        religiao = new ArrayList<Religiao>();
        raca.setRcrl(this);
    }

    public Raca getRaca() {
        return raca;
    }
    
    
}
