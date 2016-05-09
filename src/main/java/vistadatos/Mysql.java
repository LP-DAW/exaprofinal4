/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistadatos;

import constantes.Constantesbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;

/**
 * Fichero: Mysql.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 18-jun-2014
 */
public class Mysql implements Bd {

    private static final Constantesbd constantes = new Constantesbd();
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    @Override
    public void open() {
        try {

            Class.forName(constantes.DRIVER).newInstance();
            con = DriverManager.getConnection(
                constantes.JDBCURL,
                constantes.USU,
                constantes.PASS);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void close() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limpiar() {

        int resultado;
        String sql;

        try {
            open();
            st = con.createStatement();

            sql = "delete from Persona;";
            System.out.println(sql + "\n");
            resultado = st.executeUpdate(sql);

            sql = "delete from Departamento;";
            System.out.println(sql + "\n");
            resultado = st.executeUpdate(sql);

            close();

        } catch (SQLException ex) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void escribir(Persona persona) {
        int resultado;
        String sql;

        try {
            open();
            st = con.createStatement();

            sql = "insert into Departamento (iddepartamento, nombre) "
                + "values ('"
                + persona.getDepartamento().getIddepartamento()
                + "','" + persona.getDepartamento().getNombre()
                + "');";
            System.out.println(sql + "\n");
            resultado = st.executeUpdate(sql);

            sql = "insert into Persona (idpersona, usuario, password, iddepartamento) "
                + "values ('"
                + persona.getIdpersona()
                + "','" + persona.getUsuario()
                + "','" + persona.getPassword()
                + "','" + persona.getDepartamento().getIddepartamento()
                + "');";

            System.out.println(sql + "\n");
            resultado = st.executeUpdate(sql);
            close();

        } catch (SQLException se) {
            //Errores de JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Errores de Class.forName
            e.printStackTrace();

        }//end try
    }
}
