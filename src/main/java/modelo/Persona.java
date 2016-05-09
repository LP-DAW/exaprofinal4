package modelo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Fichero: Persona.java
 *
 * @author Paco Aldarias <paco.aldarias@ceedcv.es>
 * @date 02-jun-2014
 */
public class Persona {

  private String idpersona;
  private String usuario;
  private String password;
  private Departamento departamento;

  public Persona(String idpersona_, String usuario_, String password_, Departamento departamento_) {
    this.idpersona = idpersona_;
    this.usuario = usuario_;
    this.password = password_;
    this.departamento = departamento_;
  }

  /**
   * @return the idpersona
   */
  public String getIdpersona() {
    return idpersona;
  }

  /**
   * @param idpersona the idpersona to set
   */
  public void setIdpersona(String idpersona) {
    this.idpersona = idpersona;
  }

  /**
   * @return the usuario
   */
  public String getUsuario() {
    return usuario;
  }

  /**
   * @param usuario the usuario to set
   */
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the departamento
   */
  public Departamento getDepartamento() {
    return departamento;
  }

  /**
   * @param departamento the departamento to set
   */
  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }
}
