package sudokugame;
/**
 *  Simulador de juego de un Sudoku 4x4.
 * @author Oriol Holguin & Alex Guirao
 */
public class SudokuGame 
{
    public static void main(String[] args) 
    {
        /*
        //Prueba del desarrollo de juego.
        do{
        Board.drawBoard();
        Board.setBoardPosValue();
        }while(!GameManager.getIsGameFinish());
        */
        
        //Prueba para generar tablero aleatorio
        do{
        Board.generateRandomBoard();
        Board.drawBoard();
        }while(!GameManager.getIsGameFinish());

    }
}
