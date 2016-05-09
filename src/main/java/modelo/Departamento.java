/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Fichero: Departamento.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 02-jun-2014
 */
public class Departamento {

  private String iddepartamento;
  private String nombre;

  public Departamento(String i, String n) {
    iddepartamento = i;
    nombre = n;
  }

  /**
   * @return the iddepartamento
   */
  public String getIddepartamento() {
    return iddepartamento;
  }

  /**
   * @param iddepartamento the iddepartamento to set
   */
  public void setIddepartamento(String iddepartamento) {
    this.iddepartamento = iddepartamento;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
