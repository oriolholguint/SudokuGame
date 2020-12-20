package sudokugame;

import java.util.Scanner;

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
        String positionBoard;
        
        do
        {
            Scanner sc = new Scanner(System.in);
            positionBoard = sc.nextLine();    
        }
        while(!(positionBoard.length() == 2)); // Si no tiene dos caracteres no sale

        return positionBoard;
    }
	
}
