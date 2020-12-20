/*
        A B  C D    
      +----+-----+
   A | 5 8 | 1 4 |
   B | 5 8 | 8 7 |
      +----+-----+
   C | 6 8 | 5 2 |
   D | 6 8 | 9 7 |
      +----+-----+
    
        A B  C D
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
    /*Array contenedor del tablero de juego. Primera dimension para las filas. Segunda dimensión para las columnas.
    Valor para el número escrito en la casilla.*/
    static int boardPos [][] = new int [4][4];  
    
    /**
     * Da valor numérico a una posición del tablero escogida por el usuario.
     * @param _positionAndValue Posición y valor de la posición con el formato (AB1) 
     */
    public static void setBoardPosValue(String _positionAndValue)
    {
        int rowIndex=0; //Identificador de fila.
        int columnIndex=0; //Identificador de columna.
        int value;  //Valor numérico de la casilla.
        
        //Asigna el valor de la fila.
        switch (_positionAndValue.charAt(0))
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
        switch (_positionAndValue.charAt(1))
        {
            case 'A':
            case 'a':   columnIndex=0;
                break;
            case 'B':
            case 'b':   columnIndex=1;
                break;
            case 'C':
            case 'c':   columnIndex=2;
                break;
            case 'D':
            case 'd':   columnIndex=3;
                break;
        }
        
        //Asigna el valor de la casilla.
        value=_positionAndValue.charAt(2);
        
        boardPos[rowIndex][columnIndex] = value;    //Inicializa la posición del array con el valor de la casilla.
    }
    
    public static void drawBoard()
    {
        
        System.out.println("   A B  C D  " );
        System.out.println(" +----+-----+");
        
        for (int i = 0; i<boardPos[i].length-1;i++)
        {
            System.out.print("A  ");
            for (int j = 0; j<boardPos[j].length-1;j++ )
            {
                if (boardPos[i][j]==0)
                {
                    System.out.print("|  ·  ");
                }
                else
                {
                    System.out.print("|  " + boardPos[i][j] + "  ");
                }
                
            }
            System.out.println("  |");
        }
        
         System.out.println(" +----+-----+");
    }
}
