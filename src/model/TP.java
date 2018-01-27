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
public class TP {
    private int num;
    private String tp;
    private String desctp;

    public TP(String tp) {
        this.tp = tp;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    
    
    public String getTp() {
        return tp;
    }

    public String getDesctp() {
        return desctp;
    }

    public void setDesctp(String desctp) {
        this.desctp = desctp;
    }
    
    
}
