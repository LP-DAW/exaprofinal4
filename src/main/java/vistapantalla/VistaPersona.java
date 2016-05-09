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
import javax.swing.JTextField;

/**
 * Fichero: VistaPersona.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 05-jun-2014
 */
public class VistaPersona extends JFrame {

  private JLabel jl1;
  private JLabel jl2;
  private JLabel jl3;
  private JLabel jl4;
  private JLabel jl5;
  private JLabel jl6;
  private JLabel jl7;
  private JLabel jl8;
  private JTextField jtf1;
  private JTextField jtf2;
  private JTextField jtf3;
  private JTextField jtf4;
  private JPanel jp1;
  private JPanel jp2;
  private JPanel jp3;
  private JButton jb1;
  private JButton jb2;
  private VistaPersona vistapersona;
  private FlowLayout fl;

  public VistaPersona() {
    super("Vista Persona");
    initComponents();
  }

  public void initComponents() {



    jl1 = new JLabel("Idpersona");

    jtf1 = new JTextField(10);
    jtf1.setEditable(false);

    jl2 = new JLabel("Pass");

    jtf2 = new JTextField(10);
    jtf2.setEditable(false);

    jl3 = new JLabel("Contraseña");
    jtf3 = new JTextField(10);
    jtf3.setEditable(false);

    jl4 = new JLabel("Grupo");
    jtf4 = new JTextField(10);
    jtf4.setEditable(false);

    jb1 = new JButton("Salir");
    jb2 = new JButton("Grabar");

    fl = new FlowLayout();




    jp1 = new JPanel(fl);

    jp1.add(jl1);
    jp1.add(jtf1);

    jp1.add(jl2);
    jp1.add(jtf2);


    jp1.add(jl3);
    jp1.add(jtf3);

    jp1.add(jl4);
    jp1.add(jtf4);

    jp1.add(jb1);
    jp1.add(jb2);

    add(jp1);

    setLocationRelativeTo(null); // Centrar
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


    //this.setSize(400, 200);
    this.setPreferredSize(new Dimension(400, 125));

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
    return jtf2;
  }

  public JTextField getJtf3() {
    return jtf3;
  }

  public JTextField getJtf4() {
    return jtf4;
  }
}
