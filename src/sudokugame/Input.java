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
	
}
