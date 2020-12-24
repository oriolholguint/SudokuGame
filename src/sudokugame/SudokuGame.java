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
        do{
            Board.generateRandomBoard();    //Genera un tablero aleatorio hasta que esté lleno.
        }while(!Board.isFull());
        
        Board.setUserHintValues();  //Del tablero anterior coge unos valores iniciales e inicializalos en el tablero de juego.
        Board.drawPlayerBoard();    //Dibuja el tablero de juego con las pistas iniciales.
        
        //===============================EMPIEZA EL JUEGO===============================================
        do{
            Board.setPlayerBoardPosValue(); //El jugador introduce un valor para una posición.
            Board.drawPlayerBoard();    //Imprime el tablero de juego.
        }while(!(GameManager.getIsGameFinish()));
    }
}
