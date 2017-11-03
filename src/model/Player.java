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
public class Player {
    private String nome;
    private Raca raca;
    private int cpl;
    private int imp;
    private int rlg;
    private String medo;
    private String objetivo;
    private Religiao rel;
    private String classe;
    private TP_Player tpc;

    public Player(String nome, Raca raça, String classe) {
        this.nome = nome;
        this.raca = raça;
        this.classe = classe;
    }

    public TP_Player getTpc() {
        return tpc;
    }

    public void setTpc(TP_Player tpc) {
        this.tpc = tpc;
    }

    
    public String getNome() {
        return nome;
    }

    public Raca getRaca() {
        return raca;
    }

    public int getCpl() {
        return cpl;
    }

    public int getImp() {
        return imp;
    }

    public int getRlg() {
        return rlg;
    }

    public String getMedo() {
        return medo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public Religiao getRel() {
        return rel;
    }

    public String getClasse() {
        return classe;
    }

    public void setCpl(int cpl) {
        this.cpl = cpl;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    public void setRlg(int rlg) {
        this.rlg = rlg;
    }

    public void setMedo(String medo) {
        this.medo = medo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setRel(Religiao rel) {
        this.rel = rel;
    }
    
    
    
}
