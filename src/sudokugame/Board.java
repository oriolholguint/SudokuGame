/*
         1 2   3 4            1 2  3 4
      +----+-----+         +----+-----+
   A | 5 8 | 1 4 |      A | ·  · | ·  · |
   B | 5 8 | 8 7 |      B | ·  · | ·  · |
      +----+-----+         +----+-----+ 
   C | 6 8 | 5 2 |      C | ·  · | ·  · |
   D | 6 8 | 9 7 |      D | ·  · | ·  · |
      +----+-----+         +----+-----+     //Simulación gráfica del tablero utilizado para el Sudoku.
    */
package sudokugame;
/**
 * Tablero de juego. Simula un tablero de Sudoku real.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Board 
{
    final static int BOARD_HEIGHT = 4;  //Ancho del tablero.
    final static int BOARD_WIDTH = 4;   //Alto del tablero.
    
    /*Array contenedor del tablero de juego. Primera dimension para las filas. Segunda dimensión para las columnas.
    Valor para el número escrito en la casilla.*/
    static int boardPos [][] = new int [BOARD_HEIGHT][BOARD_WIDTH];  
    
    //Array contenedor del tablero de juego con los valores que el usuario rellena.
    static int playerBoardPos [][] = new int [BOARD_HEIGHT] [BOARD_WIDTH];
    
    /**
     * Da valor numérico a una posición del tablero escogida por el usuario.
     */
    public static void setPlayerBoardPosValue()
    {
        String inputPos;  //Posición del tablero.
        int rowIndex=0; //Identificador de fila.
        int columnIndex=0; //Identificador de columna.
        int posValue;  //Valor numérico de la casilla.
        
        System.out.println("Introduce una posición del tablero: ");
        inputPos = Input.getBoardPos(); //El usuario asigna la posición del tablero.
        
        //Asigna el valor de la fila.
        switch (inputPos.charAt(0))
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
        switch (inputPos.charAt(1))
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
        
        System.out.println("Introduce un valor para la casilla: ");
        posValue = Input.getInt();  //El usuario asigna un valor para la posición del tablero.
        
        playerBoardPos[rowIndex][columnIndex] = posValue;    //Inicializa la posición del array con el valor de la casilla.
    }
    
    /**
     * Inicializa valores aleatorios del tablero del jugador para que pueda empezar a jugar con alguna referencia.
     */
    public static void setUserHintValues()
    {
        int hintValueNum=1;   //Número de casillas que son reveladas al inicio de la partida.
        
        switch(GameManager.getGameLevel())
        {
            case 1: hintValueNum = 9;
                break;
            case 2: hintValueNum = 6;
                break;
            case 3: hintValueNum = 3;
                break;
        }
        
        int row;    //Número de fila.
        int col;    //Número de columna.
        boolean isSet;
        
        for (int i = 0; i < hintValueNum; i++)
        {
            isSet=false;
            do{
                row = (int) (Math.random() * 4);
                col = (int) (Math.random() * 4);
                
                if (playerBoardPos[row][col]==0)
                {
                    //Inicializa algunas posiciones aleatorias para las pistas iniciales del tablero del jugador.
                    playerBoardPos[row][col] = boardPos[row][col];  
                    isSet=true;
                }
            }while (isSet==false);
        }
    }
    
    /**
     * Dibuja el tablero que va completando el jugador.
     */
    public static void drawPlayerBoard()
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
                if (playerBoardPos[i][j]==0)
                {
                    System.out.print("| · ");
                }
                else
                {
                    System.out.print("| " + playerBoardPos[i][j] + " ");
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
    
    /**
     * Dibuja el tablero al completo.
     */
    public static void drawFullBoard()
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
    
    /**
     * Busca un número concreto en una fila del tablero y retorna si aparece.
     * @param _value
     * @param _rowPos
     * @return isSet (True si el número se encuentra en la fila seleccionada.)
     */
    public static boolean isValueInRow(int _value, int _rowPos)
    {
        boolean isSet=false;
        
        for (int i = 0; i < BOARD_HEIGHT; i++)
        {
            if (boardPos[_rowPos][i]==_value)   //Si el valor de la posición actual es igual al valor a revisar
            {
              isSet=true;  //Ha encontrado el valor en la fila seleccionada.
            }
        }
        return isSet;
    }
    
    /**
     * Busca un número concreto en una fila del tablero y retorna si aparece repetido.
     * @param _value
     * @param _colPos
     * @return isSet (True si el número se encuenta en la columna seleccionada)
     */
    public static boolean isValueInColumn(int _value, int _colPos)
    {
        boolean isSet=false;
        
        for (int i = 0; i < BOARD_HEIGHT; i++)
        {
            if (boardPos[i][_colPos]==_value)
            {
              isSet=true;  //Ha encontrado el valor en la columna seleccionada.
            }
        }
        return isSet;
    }
    
    /**
     * Busca un número en un cuadrante y retorna si aparece repetido.
     * @param _value
     * @param _rowPos
     * @param _colPos
     * @return isSet (True si el número ya se encuentra en el cuadrante seleccionado)
     */
    public static boolean isValueInSquare(int _value, int _rowPos, int _colPos)
    {
        boolean isSet = false;  //True si el número está repetido dentro del mismo cuadrante.
        
        
            if (_rowPos==0 && _colPos==0 && boardPos[1][1]!=0)  //Compara la casilla con su diagonal (si tiene valor).
            {
                if (boardPos[1][1]==_value) //Si el valor de la diagonal coincide con el de la casilla actual
                {
                    isSet=true; //El número se repite dentro del cuadrante (Sudoku mal formado).
                    }
            }else if (_rowPos==1&&_colPos==1 && boardPos[0][0] != 0) 
            {
                if (boardPos[0][0]==_value)
                {
                    isSet=true;
                }
            }else if (_rowPos==0&&_colPos==1 && boardPos[1][0]!=0)
            {
                if (boardPos[1][0]==_value)
                {
                    isSet=true;
                }
            }else if (_rowPos==1&&_colPos==0 && boardPos[0][1]!=0)
            {
                if (boardPos[0][1]==_value)
                {
                    isSet=true;
                }
            }
        return isSet;
    }
    
    /**
     * Genera un tablero con unos valores aleatorios siguiendo la lógica del Sudoku.
     */
    public static void generateRandomBoard()
    {
        int value;  //Valor a escribir en la casilla.
        int col;    //Índice de la columna.
        int row;    //Índice de la fila.
        int resetCounter=0; //Contador de reinicio en caso de que el tablero se haya vuelto imposible de resolver.
        
        do{ //Genera un número aleatorio para el índice de la fila y la columna.
            row = (int) (Math.random() * 4);
            col = (int) (Math.random() * 4);
        }while(boardPos[row][col]!=0);  //Mientras no haya ningún valor ya asignado a esa casilla.
        
        do{ //Genera un valor para escribir en la casilla.
            value = (int)(Math.random() * 4 + 1);   //Genera un número aleatorio para el valor de la casilla actual.
            resetCounter++; //Suma uno para el contador de un posible reseteo.
            
            if (isValueInSquare(value, row, col)) //Si el valor está repetido dentro del cuadrante...
            {
                resetBoard();   //...resetea el tablero mal formado para volver a empezar el proceso.
            }   
            
            if (resetCounter==10)   //Si el contador de reseteo tiene un número elevado...
            {
                resetBoard();   //...resetea el tablero para volver a empezar el proceso.
            }
        }while(isValueInRow(value, row) || isValueInColumn(value, col));  //Mientras en la fila o la columna no se encuentre el mismo valor.
        
        boardPos[row][col]=value;   //Asigna el valor a la casilla.
    }
    
    /**
     * Comprueba si el tablero se ha llenado con valores en todas sus casillas.
     * @return isFull (True) si el tablero tiene todas sus casillas con algún valor.
     */
    public static boolean isFull()
    {
        boolean isFull=true;  //El tablero está lleno por completo.
        
        for (int i = 0; i<BOARD_HEIGHT;i++) //Recorre las filas.
        {
            for (int j = 0; j <BOARD_WIDTH;j++) //Recorre las columnas.
            {
                if (boardPos[i][j]==0)  //Si la casilla no tiene valor.
                {
                    isFull=false;   //Cambia a false el boolean de retorno.
                }
            }
        }
        return isFull;
    }
    
    /**
     * Resetea el tablero por completo.
     */
    public static void resetBoard()
    {
        for (int i = 0; i<BOARD_HEIGHT;i++) //Recorre las filas.
        {
            for (int j = 0; j <BOARD_WIDTH;j++) //Recorre las columnas.
            {
                boardPos[i][j]=0;   //Resetea la casilla actual.
            }
        }
    }
}

