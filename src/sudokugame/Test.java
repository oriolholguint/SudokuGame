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
        System.out.println((int) (Math.random() * 4));
        int boardPos [][] = new int [4][4];
        boolean repeat = false;
        int col;
        int fila;

        for (int i = 0; i < CANT_CASILLAS; i++)
        {    
            do
            {
                repeat = false;
                col = (int) (Math.random() * 4);
                fila = (int) (Math.random() * 4);
                if (boardPos[col][fila] == 0)
                {
                    boardPos[col][fila] = (int)(Math.random() * 4 + 1);
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
