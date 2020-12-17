package sudokugame;

import java.util.Scanner;

/**
 *
 * @author (oriolholguint@gmail.com)
 */
public class Input 
{
	
	public char getRow()
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
	
	
}
