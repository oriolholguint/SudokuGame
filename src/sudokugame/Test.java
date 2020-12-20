package sudokugame;

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
        int res;
        
        for (int i = 0; i < CANT_CASILLAS; i++)
        {    
            do
            {
                repeat = false;
                
                col = (int) (Math.random() * 4);
                fila = (int) (Math.random() * 4);
                res = Integer.valueOf(String.valueOf(fila + String.valueOf(col)));
                              
                if (boardPos[fila][col] == 0)
                {
                    switch (res)
                    {
                        case 0:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[0][1] == randomNumber || boardPos[0][2] == randomNumber || boardPos[0][3] == randomNumber ||
                                    boardPos[1][0] == randomNumber || boardPos[2][0] == randomNumber || boardPos[3][0] == randomNumber ||
                                    boardPos[1][1] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }while(boardPos[0][0] == 0);
                        }
                        break;
                        case 1: 
                        {   
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[0][0] == randomNumber || boardPos[0][2] == randomNumber || boardPos[0][3] == randomNumber ||
                                    boardPos[1][1] == randomNumber || boardPos[2][1] == randomNumber || boardPos[3][1] == randomNumber ||
                                    boardPos[1][0] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while( boardPos[0][1] == 0);
                        }
                        break;
                        case 2:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[0][0] == randomNumber || boardPos[0][1] == randomNumber || boardPos[0][3] == randomNumber ||
                                    boardPos[1][2] == randomNumber || boardPos[2][2] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[1][3] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }while(boardPos[0][2] == 0);
                        }
                        break;    
                        case 3:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[0][0] == randomNumber || boardPos[0][1] == randomNumber || boardPos[0][2] == randomNumber ||
                                    boardPos[1][3] == randomNumber || boardPos[2][3] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[1][2] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while(boardPos[0][3] == 0);
                        }
                        break; 
                        case 10:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[0][0] == randomNumber || boardPos[2][0] == randomNumber || boardPos[3][0] == randomNumber ||
                                    boardPos[1][1] == randomNumber || boardPos[1][2] == randomNumber || boardPos[1][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while(boardPos[1][0] == 0);
                        }
                        break; 
                        case 11:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[1][0] == randomNumber || boardPos[1][2] == randomNumber || boardPos[1][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber || boardPos[2][1] == randomNumber || boardPos[3][1] == randomNumber ||
                                    boardPos[0][0] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }while(boardPos[1][1] == 0);
                        }
                        break;
                        case 12:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[1][0] == randomNumber || boardPos[1][1] == randomNumber || boardPos[1][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber || boardPos[2][2] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }while(boardPos[1][2] == 0);
                        }
                        break;
                        case 13:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[1][0] == randomNumber || boardPos[1][1] == randomNumber || boardPos[1][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber || boardPos[2][3] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while(boardPos[1][3] == 0);                        
                        }
                        break;
                        case 20:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[2][1] == randomNumber || boardPos[2][2] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[0][0] == randomNumber || boardPos[1][0] == randomNumber || boardPos[3][0] == randomNumber ||
                                    boardPos[3][1] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }while(boardPos[2][0] == 0); 
                        }
                        break;
                        case 21:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[2][0] == randomNumber || boardPos[2][2] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber || boardPos[1][1] == randomNumber || boardPos[3][1] == randomNumber ||
                                    boardPos[3][0] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while (boardPos[2][1] == 0);                            
                        }
                        break;
                        case 22:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[2][0] == randomNumber || boardPos[2][1] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber || boardPos[1][2] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[3][3] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while (boardPos[2][2] == 0);     
                        }
                        break;
                        case 23:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[2][0] == randomNumber || boardPos[2][1] == randomNumber || boardPos[2][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber || boardPos[1][3] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[3][2] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while (boardPos[2][3] == 0);    
                        }
                        break;
                        case 30:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[3][1] == randomNumber || boardPos[3][2] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][0] == randomNumber || boardPos[1][0] == randomNumber || boardPos[2][0] == randomNumber ||
                                    boardPos[2][1] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while (boardPos[3][0] == 0); 
                        }
                        break;
                        case 31:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[3][0] == randomNumber || boardPos[3][2] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][1] == randomNumber || boardPos[1][1] == randomNumber || boardPos[2][1] == randomNumber ||
                                    boardPos[2][0] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while (boardPos[3][1] == 0); 
                        }
                        break;
                        case 32:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[3][0] == randomNumber || boardPos[3][1] == randomNumber || boardPos[3][3] == randomNumber ||
                                    boardPos[0][2] == randomNumber || boardPos[1][2] == randomNumber || boardPos[2][2] == randomNumber ||
                                    boardPos[2][3] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while (boardPos[3][2] == 0); 
                        }
                        break;
                        case 33:
                        {
                            do
                            {
                                randomNumber = (int)(Math.random() * 4 + 1);
                                if (!(boardPos[3][0] == randomNumber || boardPos[3][1] == randomNumber || boardPos[3][2] == randomNumber ||
                                    boardPos[0][3] == randomNumber || boardPos[1][3] == randomNumber || boardPos[2][3] == randomNumber ||
                                    boardPos[2][2] == randomNumber))
                                {
                                    boardPos[fila][col] = randomNumber;
                                }
                            }
                            while (boardPos[3][3] == 0); 
                        }
                        break;
                    }
                }
                else
                {
                    repeat = true;
                }
            }while(repeat); 
        }
        
        
        
        
        
        
        
        
        
        for (int j = 0; j < 4; j++)
        {
            for (int k = 0; j < 4; j++)
            {
                System.out.print(boardPos[j][k] + " ");
            }
            System.out.println();
        }
    }
    
    
}
