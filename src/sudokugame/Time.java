package sudokugame;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author (oriolholguint@gmail.com)
 */
public class Time 
{
    /***
     * Este metodo genera una pausa en la ejecucion del codigo indicado previamente por el usuario en milisegundos
     * @param _time Tiempo que espera el codigo para seguir ejecutandose 
     */
    public static void waitForSeconds(int _time)
    {
        try {
            Thread.sleep(_time);
        } catch (InterruptedException ex) {
            Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
