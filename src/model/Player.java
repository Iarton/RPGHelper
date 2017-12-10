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
    private int idade;
    private String BackGround;
    //Objetivo temporario
    private int ouro;
    private int ph;
    private String medo;
    private String objetivo;
    private Religiao rel;
    private String classe;
    private String LocalNasc;
    private TP_Player tpc;
    private Atributos atb;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBackGround() {
        return BackGround;
    }

    public void setBackGround(String BackGround) {
        this.BackGround = BackGround;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public Atributos getAtb() {
        return atb;
    }

    public void setAtb(Atributos atb) {
        this.atb = atb;
    }
    
    
    
}
