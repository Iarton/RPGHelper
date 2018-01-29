/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public ArrayList<TP> consultar() {
        TP tp = null;
        int ntps = 0;
        PreparedStatement ps = null;
        ArrayList<TP> listatp = null;
        try {
            ps = conn.prepareStatement("SELECT count(*) FROM tp");
            ResultSet rs = ps.executeQuery();

            if (rs.next() != false) {
                ntps = rs.getInt(1);
            }
            int c = 1, f = 1;
            while (c <= ntps) {
                ps = conn.prepareStatement("select * from tp where codtp = ?");
                ps.setString(1, String.valueOf(f));
                rs = ps.executeQuery();
                if (rs.next() == true) {
                    f++;
                    c++;
                    tp = new TP(rs.getString("nome"));
                    tp.setNum(rs.getInt("codtp"));
                    tp.setDesctp(rs.getString("descri"));
                    listatp.add(tp);
                } else {
                    f++;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return listatp;
    }

    public void excluir(TP tp) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tp WHERE codtp = ?");
            ps.setString(1, String.valueOf(tp.getNum()));

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

}
