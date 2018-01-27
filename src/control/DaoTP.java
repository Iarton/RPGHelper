/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.TP;

/**
 *
 * @author Airton
 */
public class DaoTP {

    private Connection conn;

    public DaoTP(Connection conn) {
        this.conn = conn;
    }

    public void criar(TP tp) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("Insert into tp (nome,descri) values(?,?)");
            ps.setString(1, tp.getTp());
            ps.setString(2, tp.getDesctp());
            ps.execute();
        
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

}
