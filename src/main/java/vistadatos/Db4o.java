/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistadatos;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import java.io.File;
import modelo.Persona;

/**
 * Fichero: db40.java
 *
 * @date 02-jun-2014
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 */
public class Db4o implements Bd {

  private String Fichero = "personas.db4o";
  private ObjectContainer bdoo;

  public void open() {
    limpiar();
    bdoo = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), Fichero);
  }

  public void close() {
    bdoo.close();
  }

  public void escribir(Persona persona) {
    bdoo.store(persona);
  }

  @Override
  public void limpiar() {
    File f = new File(Fichero);
    f.delete();
  }
}
