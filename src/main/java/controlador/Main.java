/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Persona;
import vistapantalla.VistaPrincipal;

/**
 * Fichero: Main.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 02-jun-2014
 */
public class Main {

  public static void main(String[] args) {
    ArrayList<Persona> modelo = new ArrayList<>();
    VistaPrincipal vista = new VistaPrincipal();
    ControladorPrincipal contralador = new ControladorPrincipal(vista, modelo);
  }
}
