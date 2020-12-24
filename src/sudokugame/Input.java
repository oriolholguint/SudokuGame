package sudokugame;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author (oriolholguint@gmail.com)
 */
public class Input 
{
	
    final static int TIPO_SUDOKU = 4;
    
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

    public static int getInt()
    {
        int number;

        do
        {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number < 1 || number > TIPO_SUDOKU)
            {
                System.out.println("Introduce un valor correcto");
            }
        }while(number < 1 || number > TIPO_SUDOKU);
        
        return number;
    }

    public static String getString()
    {
        String word;

        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();

        return word;            
    }
    
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
                System.out.println("Esa posición no existe, introduce una correcta");
            }
            
        }
        while(!(boardPos.matches(patternBoardPos)) || "SOLUCION".equals(boardPos) || "solucion".equals(boardPos)); // Si no cumple el pattern o el comando "SOLUCION" no sale

        return boardPos;
    }
    
}
