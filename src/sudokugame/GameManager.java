package sudokugame;
/**
 * Encargado de manejar toda la información del juego para su correcto funcionamiento.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class GameManager
{
    private static int score;  //Puntuación
    private static boolean isGameFinish = false;    //Comprobante de juego finalizado.
    private static int gameLevel;   //Nivel de dificultad del juego (del 1 al 3)

    /**
     * Setter para el nivel de dificultad.
     * @param _gameLevel 
     */
    public static void setGameLevel(int _gameLevel)
    {
        gameLevel = _gameLevel;
    }
    
    /**
     * Getter para el nivel de dificultad.
     * @return Nivel de dificultad del juego (del 1 al 3)
     */
    public static int getGameLevel() 
    {
        return gameLevel;
    }
                
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
