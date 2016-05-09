/**
 * Valores constantes
 */
package constantes;

/**
 * Datos para conexion JDBC
 *
 * @author pacoaldarias <paco.aldarias@ceedcv.es>
 */
public class Constantesbd {

    /**
     * Driver JDBC para Mysql
     */
    public final String DRIVER = "com.mysql.jdbc.Driver";
    /**
     * Nombre de la BD de Mysql
     */
    public final String BD = "exafinalprg4";
    /**
     * Dirección de la BD de Mysql
     */
    public final String JDBCURL = "jdbc:mysql://localhost:3306/" + BD;
    /**
     * Usuario de la Base de Datos
     */
    public final String USU = "alumno";
    /**
     * Password de la Base de Datos
     */
    public final String PASS = "alumno";
}
