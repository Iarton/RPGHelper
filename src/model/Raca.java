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
public class Raca {
       private String nome;
       private String descricao;
       private String passiva;
       private int pv;
       private Atributos atbBase;

    public Raca(String nome, String descricao, String passiva, int pv) {
        this.nome = nome;
        this.descricao = descricao;
        this.passiva = passiva;
        this.pv = pv;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPassiva() {
        return passiva;
    }

    public int getPv() {
        return pv;
    }

    public Atributos getAtbBase() {
        return atbBase;
    }
       
       
}
