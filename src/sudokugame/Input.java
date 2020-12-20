package sudokugame;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author (oriolholguint@gmail.com)
 */
public class Input 
{
	
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

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

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
            if (!(boardPos.matches(patternBoardPos)))
            {
                System.out.println("Esa posición no existe, introduce una correcta");
            }
        }
        while(!(boardPos.matches(patternBoardPos))); // Si no cumple el pattern no sale

        return boardPos;
    }
    
}
