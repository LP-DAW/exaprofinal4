/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistadatos;

import modelo.Persona;

/**
 * Fichero: Bd.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 03-jun-2014
 */
public interface Bd {

  public void open();

  public void close();

  public void escribir(Persona persona);

  public void limpiar();
}
