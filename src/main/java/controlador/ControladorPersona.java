/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Persona;
import vistadatos.Bd;
import vistadatos.Mysql;
import vistapantalla.VistaPersona;
import vistapantalla.VistaPrincipal;

/**
 * Fichero: ControladorPersona.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 05-jun-2014
 */
class ControladorPersona {

    private Persona persona;
    private VistaPrincipal vista;
    private VistaPersona vistapersona;
    private ControladorPrincipal contralador;

    public ControladorPersona(Persona persona_, VistaPrincipal vista_, ControladorPrincipal controlador_) {

        vistapersona = new VistaPersona();
        persona = persona_;
        vista = vista_;
        contralador = controlador_;
        inicializabotones();
        rellenapersona();
    }

    public void SalirVistaPersona() {
        vista.setVisible(true);
        vistapersona.setVisible(false);
    }

    public void visualizar() {
        vista.setVisible(false);
        vistapersona.setVisible(true);

    }

    private void inicializabotones() {
        vistapersona.getBt1().setActionCommand("SalirVistaPersona");
        vistapersona.getBt1().setText("Salir");
        vistapersona.getBt1().addActionListener(contralador);

        vistapersona.getBt2().setActionCommand("GrabarVistaPersona");
        vistapersona.getBt2().setText("Grabar");
        vistapersona.getBt2().addActionListener(contralador);

    }

    private void rellenapersona() {
        //TODO: Se rellenan los datos de la persona en el formulario

    }

    void GrabarVistaPersona() {

        //TODO: limpiar la base de datos mysql
        //Escribir insertar la persona en la base de datos que está en el formulario

    }
}
