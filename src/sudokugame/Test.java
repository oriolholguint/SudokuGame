package sudokugame;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV;
import java.text.DecimalFormat;

/**
 *
 * @author (oriolholguint@gmail.com)
 */
public class Test 
{
    
    final static int CANT_CASILLAS = 16;
    
    public static void main(String[] args) 
    {
        int boardPos [][] = new int [4][4];
        boolean repeat;
        int col, fila;
        int randomNumber;
        boolean repeatValue = false;
        
        for (int i = 0; i < CANT_CASILLAS; i++)
        {    
            col = (int) (Math.random() * 4);
            fila = (int) (Math.random() * 4);
            int res = Integer.valueOf(String.valueOf(fila + String.valueOf(col)));
            do
            {
                //System.out.println(res);
                
                repeat = false;
                if (boardPos[fila][col] == 0)
                {
                    while (!repeatValue)
                    {
                        switch (res)
                        {
                            case 0:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[0][1] == randomNumber || boardPos[0][2] == randomNumber || boardPos[0][3] == randomNumber ||
                                    boardPos[1][0] == randomNumber || boardPos[2][0] == randomNumber || boardPos[3][0] == randomNumber ||
                                    boardPos[1][1] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 1: 
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[0][0] == randomNumber || boardPos[0][2] == randomNumber || boardPos[0][3] == randomNumber ||
                                    boardPos[1][1] == randomNumber || boardPos[2][1] == randomNumber || boardPos[3][1] == randomNumber ||
                                    boardPos[1][0] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 2:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[0][0] == randomNumber || boardPos[0][1] == randomNumber || boardPos[0][3] == randomNumber ||
                                    boardPos[1][2] == randomNumber || boardPos[2][2] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[1][3] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;    
                            case 3:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[0][0] == randomNumber || boardPos[0][1] == randomNumber || boardPos[0][2] == randomNumber ||
                                    boardPos[1][3] == randomNumber || boardPos[2][3] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[1][2] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break; 
                            case 10:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[0][0] == randomNumber || boardPos[2][0] == randomNumber || boardPos[3][0] == randomNumber ||
                                    boardPos[1][1] == randomNumber || boardPos[1][2] == randomNumber || boardPos[1][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break; 
                            case 11:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[1][0] == randomNumber || boardPos[1][2] == randomNumber || boardPos[1][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber || boardPos[2][1] == randomNumber || boardPos[3][1] == randomNumber ||
                                    boardPos[0][0] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 12:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[1][0] == randomNumber || boardPos[1][1] == randomNumber || boardPos[1][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber || boardPos[2][2] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 13:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[1][0] == randomNumber || boardPos[1][1] == randomNumber || boardPos[1][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber || boardPos[2][3] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 20:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[2][1] == randomNumber || boardPos[2][2] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[0][0] == randomNumber || boardPos[1][0] == randomNumber || boardPos[3][0] == randomNumber ||
                                    boardPos[3][1] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 21:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[2][0] == randomNumber || boardPos[2][2] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber || boardPos[1][1] == randomNumber || boardPos[3][1] == randomNumber ||
                                    boardPos[3][0] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 22:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[2][0] == randomNumber || boardPos[2][1] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber || boardPos[1][2] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[3][3] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 23:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[2][0] == randomNumber || boardPos[2][1] == randomNumber || boardPos[2][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber || boardPos[1][3] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[3][2] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 30:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[3][1] == randomNumber || boardPos[3][2] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][0] == randomNumber || boardPos[1][0] == randomNumber || boardPos[2][0] == randomNumber ||
                                    boardPos[2][1] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 31:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[3][0] == randomNumber || boardPos[3][2] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber || boardPos[1][1] == randomNumber || boardPos[2][1] == randomNumber ||
                                    boardPos[2][0] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 32:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[3][0] == randomNumber || boardPos[3][1] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber || boardPos[1][2] == randomNumber || boardPos[2][2] == randomNumber ||
                                    boardPos[2][3] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                            case 33:
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (boardPos[3][0] == randomNumber || boardPos[3][1] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber || boardPos[1][3] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[2][2] == randomNumber)
                                {
                                    repeatValue = true;
                                }
                                else
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            break;
                        }
                    }
                }
                else
                {
                    repeat = true;
                }
            }while(repeat); 
        }
        
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(boardPos[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
}
