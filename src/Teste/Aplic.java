/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import model.Atributos;
import model.Player;
import model.Raca;
import model.Raca_Religiao;
import model.Religiao;
import model.TP;
import model.TP_Player;

/**
 *
 * @author Pc
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Raca raca = new Raca("Humano","Chatos","Sem Passiva",50);
        
        Religiao reg = new Religiao("Adoradores do unico","Amam 1");
        
        Raca_Religiao raca_reg = new Raca_Religiao(raca);
        
        raca_reg.addReligiao(reg);
        
        TP tp= new TP("Nervos");
        Player p = new Player("Eu",raca,"Mago");
        
        TP_Player tppl = new TP_Player(p);
        
        tppl.addTp(tp);
        
        raca.getAtbBase().setAg(1);
        
        
        System.out.println("Nome: "+p.getNome());
        System.out.println("Raça: "+p.getRaca().getNome());
        System.out.println("TP: "+p.getTpc().getTps().get(0).getTp());
        System.out.println("Religiao: "+p.getRaca().getRcrl().getReligiao().get(0).getNome());
        System.out.println("AG = "+ raca.getAtbBase().getAg());
    }
    
}
