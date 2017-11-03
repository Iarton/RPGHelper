/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pc
 */
public class Religiao {
    private String nome;
    private String desc;

    public Religiao(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }
    
    
}
