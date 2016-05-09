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

        jl1 = new JLabel("Usuario");
        jl2 = new JLabel("Contraseña");
        jtf1 = new JTextField(10);
        jtf1.setText("admin");
        jpf1 = new JPasswordField(10);
        jpf1.setText("123");
        jb1 = new JButton();
        jb2 = new JButton();
        jl3 = new JLabel("");
        jp1 = new JPanel(new FlowLayout());
        int filas = 1;
        int columnas = 2;
        int espaciofilas = 10;
        jp2 = new JPanel(new FlowLayout(filas, columnas, espaciofilas));
        jp3 = new JPanel(new FlowLayout(filas, columnas, espaciofilas));

        jp1.add(jl1);
        jp1.add(jtf1);
        jp1.add(jl2);
        jp1.add(jpf1);

        jp2.add(jb1);
        jp2.add(jb2);

        jp3.add(jl3);

        this.setLayout(new FlowLayout());
        add(jp1);
        add(jp2);
        add(jp3);

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
