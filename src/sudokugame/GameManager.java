package sudokugame;
/**
 * Encargado de manejar toda la información del juego para su correcto funcionamiento.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class GameManager
{
    private static int score;  //Puntuación
    private static boolean isGameFinish = false;

    public static void setScore(int _score) 
    {
        score = _score;
    }

    public static int getScore() 
    {
        return score;
    }

    public static boolean getIsGameFinish() 
    {
        return isGameFinish;
    }

    public static void setGameFinish(boolean _isGameFinish) 
    {
        isGameFinish = _isGameFinish;
    }
    
}
