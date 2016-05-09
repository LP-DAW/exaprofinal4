/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistapantalla;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Fichero: VistaPrincipal.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 02-jun-2014
 */
public class VistaPrincipal extends JFrame {

    private JLabel jl1;
    private JLabel jl2;
    private JLabel jl3;
    private JTextField jtf1;
    private JPasswordField jpf1;
    private JPanel jp1;
    private JPanel jp2;
    private JPanel jp3;
    private JButton jb1;
    private JButton jb2;

    public VistaPrincipal() {
        super("Control Acceso");
        initComponents();
    }

    public void initComponents() {

        //TODO
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.setSize(400, 200);
        this.setPreferredSize(new Dimension(400, 150));
        setResizable(true);
        setLocationRelativeTo(null); // Centrar
        pack();
    }

    public JButton getBt1() {
        return jb1;
    }

    public JButton getBt2() {
        return jb2;
    }

    public JTextField getJtf1() {
        return jtf1;
    }

    public JTextField getJtf2() {
        return jpf1;
    }

    public JLabel getJl3() {
        return jl3;
    }
}
