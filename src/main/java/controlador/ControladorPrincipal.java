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

        //TODO. Inicializa los botones asignando eventos.

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //TODO. Si pulsamos boton entrar => entrar()
        //Si pulsamos boton salir => salir()
        // si SalirVistaPersona => ControladorPesona.SalirVistaPersona()
        // si GrabarVistaPersona => ControladorPesona.GrabarVistaPersona()

    }

    public void entrar() {
        //TODO. Si la persona existe ver vista persona, sino mostrar mensaje de error.
        //Número de intentos máximo 3.

    }

    public void salir() {
        vista.dispose();
    }

    public void SalirVistaPersona() {
        vista.dispose();
    }

    public void inicializaobjetos() {

        //TODO Crear los siguientes objetos
        //Departamento: id; d1, nombre: inf
        //Persona: id:p1, Usuario: admin, password: 123, Departamento: d1
        //Persona: id:p2, Usuario: paco, password: 123, Departamento: d1

    }

    public Persona buscarPersona(Persona personabuscada) {

        //TODO Buscar la persona pasada por parámetro en el arrayList, devolver null si no la encuentra
        return null;
    }

    public void grabarPersonas() {

        Bd bd = new Db4o();
        bd.open();

        //TODO:  Recorre el arrayList y los graba en la base de datos utilizando el interface BD

        bd.close();
    }
}
