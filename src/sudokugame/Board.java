/*
         1 2   3 4    
      +----+-----+
   A | 5 8 | 1 4 |
   B | 5 8 | 8 7 |
      +----+-----+
   C | 6 8 | 5 2 |
   D | 6 8 | 9 7 |
      +----+-----+
    
        1 2  3 4
      +----+-----+
   A | ·  · | ·  · |
   B | ·  · | ·  · |
      +----+-----+
   C | ·  · | ·  · |
   D | ·  · | ·  · |
      +----+-----+
    */

package sudokugame;
/**
 * 
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Board 
{
    final static int BOARD_HEIGHT = 4;  //Ancho del tablero.
    final static int BOARD_WIDTH = 4;   //Alto del tablero.
    
    /*Array contenedor del tablero de juego. Primera dimension para las filas. Segunda dimensión para las columnas.
    Valor para el número escrito en la casilla.*/
    static int boardPos [][] = new int [4][4];  
    
    /**
     * Da valor numérico a una posición del tablero escogida por el usuario.
     * @param _boardPos Posición de la casilla en formato (A1) 
     * @param _value Valor de la casilla.
     */
    public static void setBoardPosValue(String _boardPos, int _value)
    {
        int rowIndex=0; //Identificador de fila.
        int columnIndex=0; //Identificador de columna.
        int value;  //Valor numérico de la casilla.
        
        //Asigna el valor de la fila.
        switch (_boardPos.charAt(0))
        {
            case 'A':
            case 'a':   rowIndex=0;
                break;
            case 'B':
            case 'b':   rowIndex=1;
                break;
            case 'C':
            case 'c':   rowIndex=2;
                break;
            case 'D':
            case 'd':   rowIndex=3;
                break;
        }
        
        //Asigna el valor de la columna.
        switch (_boardPos.charAt(1))
        {
            case '1':   columnIndex=0;
                break;
            case '2':   columnIndex=1;
                break;
            case '3':   columnIndex=2;
                break;
            case '4':   columnIndex=3;
                break;
        }
        
        boardPos[rowIndex][columnIndex] = _value;    //Inicializa la posición del array con el valor de la casilla.
    }
    
    public static void drawBoard()
    {
        char rowLetter=' '; //Letra de las filas.
        
        System.out.println("   1   2   3   4  " );  //Imprime la parte superior del tablero.
        System.out.println(" +-------+-------+");
        
       
        for (int i = 0; i< BOARD_HEIGHT; i++) //Controla los saltos de fila.
        {
            switch(i)
            {
                 case 0: rowLetter='A';
                    break;
                 case 1: rowLetter='B';
                    break;
                 case 2: rowLetter='C';
                    break;
                 case 3: rowLetter='D';
                    break;
            }
             
            System.out.print(rowLetter);
            
            for (int j = 0; j < BOARD_WIDTH; j++ )  //Dibuja las filas.
            {
                if (boardPos[i][j]==0)
                {
                    System.out.print("| · ");
                }
                else
                {
                    System.out.print("| " + boardPos[i][j] + " ");
                }
            }
            System.out.println("|");
            
            if (i==((BOARD_HEIGHT/2)-1))   //Si se ha dibujado la mitad del tablero.
            {
                System.out.println(" +-------+-------+");   //Dibuja una separación en medio del tablero.
            }
        }
        
         System.out.println(" +-------+-------+");  //Dibuja linea de fin del tablero.
    }
}

