/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Departamento;
import modelo.Persona;
import vistadatos.Bd;
import vistadatos.Db4o;
import vistapantalla.VistaPrincipal;

/**
 * Fichero: ControladorPrincipal.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 02-jun-2014
 */
class ControladorPrincipal implements ActionListener {

    private VistaPrincipal vista;
    private ArrayList<Persona> personas = new ArrayList<>();
    private int intentos = 0;
    private ControladorPersona ControladorPersona;

    ControladorPrincipal(VistaPrincipal vista, ArrayList<Persona> personas) {
        this.vista = vista;
        this.personas = personas;

        inicializabotones();
        inicializaobjetos();
        grabarPersonas();
        visualizar();

    }

    public void visualizar() {
        vista.setVisible(true);
    }

    public void inicializabotones() {

        vista.getBt1().setActionCommand("Entrar");
        vista.getBt1().addActionListener(this);
        vista.getBt1().setText("Entrar");

        vista.getBt2().setActionCommand("Salir");
        vista.getBt2().addActionListener(this);
        vista.getBt2().setText("Salir");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String comando = ae.getActionCommand();

        switch (comando) {
            case "Entrar":
                entrar();
                break;
            case "Salir":
                salir();
                break;
            case "SalirVistaPersona":
                ControladorPersona.SalirVistaPersona();
                break;
            case "GrabarVistaPersona":
                ControladorPersona.GrabarVistaPersona();
                break;
        } // swith

    }

    public void entrar() {

        String usuario = vista.getJtf1().getText();
        String password = vista.getJtf2().getText();
        Persona personabuscada = new Persona(null, usuario, password, null);
        Persona persona;

        persona = buscarPersona(personabuscada);

        if (persona != null) {
            ControladorPersona = new ControladorPersona(persona, vista, this);
            ControladorPersona.visualizar();
        } else { // No es correcto.
            intentos++;
            vista.getJl3().setText("Error: Usuario Incorrecto. Intento:" + intentos);
        }

        if (intentos >= 3) {
            salir();
        }

    }

    public void salir() {
        vista.dispose();
    }

    public void SalirVistaPersona() {
        vista.dispose();
    }

    public void inicializaobjetos() {

        Departamento d1 = new Departamento("d1", "Inf1");
        Departamento d2 = new Departamento("d2", "Inf2");

        Persona p1 = new Persona("p1", "admin", "123", d1);
        Persona p2 = new Persona("p2", "paco", "123", d2);

        personas.add(p1);
        personas.add(p2);

    }

    public Persona buscarPersona(Persona personabuscada) {

        Iterator it = personas.iterator();
        while (it.hasNext()) {
            Persona persona = (Persona) it.next();
            if (personabuscada.getUsuario().equals(persona.getUsuario()) && personabuscada.getPassword().equals(persona.getPassword())) {
                return persona;
            }
        }
        return null;
    }

    public void grabarPersonas() {

        Bd bd = new Db4o();
        bd.open();
        Iterator it = personas.iterator();
        while (it.hasNext()) {
            Persona persona = (Persona) it.next();
            bd.escribir(persona);
        }
        bd.close();
    }
}
