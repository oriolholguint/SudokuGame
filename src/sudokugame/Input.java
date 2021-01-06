package sudokugame;

import java.util.Scanner;

/**
 * Contiene diferentes métodos para leer datos desde el teclado, en función del tipo de dato a leer.
 * @author (oriolholguint@gmail.com)
 */
public class Input 
{
    final static int TIPO_SUDOKU = 4;
    
    /**
     * Recoge y retorna un carácter introducido por consola.
     * @return Un carácter recogido por la consola.
     */
    public static char getChar()
    {
        String preLetter;
        char letter = 0;

        Scanner sc = new Scanner(System.in);
        preLetter = sc.nextLine();

        if(preLetter.length() == 1)
        {
            letter = preLetter.charAt(0);
        }
        else
        {
            System.err.println("Introduce solo un carácter, porfavor. =)");
        }

        return letter;
    }

    /**
     * Recoge y retorna un número introducido por consola.
     * @return Un número recogido por la consola.
     */
    public static int getInt()
    {
        int number;

        do
        {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number < 1 || number > TIPO_SUDOKU)
            {
                //System.out.println("Introduce un valor correcto");
                System.err.println("Introduce un valor correcto (entre 1 y 4):");
            }
        }while(number < 1 || number > TIPO_SUDOKU);
        
        return number;
    }

    /**
     * Recoge una cadena de carácteres introducido por consola.
     * @return Una cadena de carácteres recogida por la consola.
     */
    public static String getString()
    {
        String word;

        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();

        return word;            
    }
    
    /**
     * Recoge una posición del tablero formada por una letra y un número introducida por consola.
     * @return Una posición del tablero introducida por la consola.
     */
    public static String getBoardPos()
    {
        String boardPos;
        String patternBoardPos = ("[a-dA-D][1-4]"); 
        
        do
        {
            Scanner sc = new Scanner(System.in);
            boardPos = sc.nextLine();    
            if ("SOLUCION".equals(boardPos) || "solucion".equals(boardPos))
            {
                System.out.println("Veo que no eres capáz de lograrlo.. Prueba de nuevo!");
            }
            else if (!(boardPos.matches(patternBoardPos)))
            {
                //System.out.println("Esa posición no existe, introduce una correcta");
                System.err.println("Esa posición no existe, introduce una correcta:");
            }
            
        }
        while(!(boardPos.matches(patternBoardPos)) || "SOLUCION".equals(boardPos) || "solucion".equals(boardPos)); // Si no cumple el pattern o el comando "SOLUCION" no sale

        return boardPos;
    }
    
}
