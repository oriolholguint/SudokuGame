package sudokugame;
/**
 *  Simulador de juego de un Sudoku 4x4.
 * @author Oriol Holguin & Alex Guirao
 */
public class SudokuGame 
{
    public static void main(String[] args) 
    {
        //==============================PREPARA EL JUEGO==============================================
        System.out.println("Selecciona la dificultad (1-Fácil | 2-Medio | 3-Dificil)");
        do{
            GameManager.setGameLevel(Input.getInt());   //Selección del nivel de dificultad para el Sudoku.
            
            if (GameManager.getGameLevel()<1||GameManager.getGameLevel()>3)
            {
                System.out.println("Selecciona una dificultad del 1 al 3.");
            }
        }while (GameManager.getGameLevel()<1||GameManager.getGameLevel()>3);
        
        do{
            Board.generateRandomBoard();    //Genera un tablero aleatorio hasta que esté lleno.
        }while(!Board.isFull());
        
        Board.setUserHintValues();  //Del tablero anterior coge unos valores iniciales e inicializalos en el tablero de juego.
        Board.drawPlayerBoard();    //Dibuja el tablero de juego con las pistas iniciales.
        
        //===============================EMPIEZA EL JUEGO===============================================
        do{
            Board.setPlayerBoardPosValue(); //El jugador introduce un valor para una posición.
            Board.drawPlayerBoard();    //Imprime el tablero de juego.
            Board.checkFullBoard(); //Comprueba el tablero del usuario;
        }while(!(GameManager.getIsGameFinish()));
    }
}
