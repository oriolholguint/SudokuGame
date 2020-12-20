package sudokugame;
/**
 *  Simulador de juego de un Sudoku 4x4.
 * @author Oriol Holguin & Alex Guirao
 */
public class SudokuGame 
{
    public static void main(String[] args) 
    {
        //Prueba del desarrollo de juego.
        do{
        Board.drawBoard();
        System.out.println("Introduce tu tirada:");
        Board.setBoardPosValue(Input.getBoardPos(),Input.getInt());
        }while(!GameManager.getIsGameFinish());


    }
}
