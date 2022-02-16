import java.util.*;

public class Main
{
    public static int solution( int K, int[][] A )
    {
        
      int number_of_houses = 0;
      int rezult = 0;
      int distance_from_the_farthest_house;
      int[][] Dist = new int[A.length][A[0].length];
      
       // Arrays of house coordinates            
      int[] xCordinates = new int[A.length * A[0].length];
      int[] yCordinates = new int[A.length * A[0].length]; 
     
      for (int x = 0; x < A.length; x++) 
        for (int y = 0; y < A[0].length; y++) 
           if(A[x][y] == 1)
           {
               xCordinates[number_of_houses] = x;
               yCordinates[number_of_houses] = y;
               number_of_houses++;
           }
           
      xCordinates = Arrays.copyOf(xCordinates,number_of_houses);
      yCordinates = Arrays.copyOf(yCordinates,number_of_houses);
      
      for (int x = 0; x < A.length; x++)
        for (int y = 0; y < A[0].length; y++)
        {
            // -1 is placed in the cell in which the house is located
            for (int i = 0; i < number_of_houses; i++)
               if( (x == xCordinates[i]) && (y == yCordinates[i])  )
                  Dist[x][y] = -1;
        
            
            // Calculates the distance from the farthest house only for the cell in which the house is not located
            if( Dist[x][y] != -1)
                for (int i = 0; i < number_of_houses; i++)
                {
                    distance_from_the_farthest_house = Math.abs( xCordinates[i] - x ) + Math.abs( yCordinates[i] - y );
                    Dist[x][y] = Dist[x][y] > distance_from_the_farthest_house ? Dist[x][y] : distance_from_the_farthest_house;
                }
           
            // Counting the number of empty cells at a distance of at most K to every house.
            if( Dist[x][y] <= K &&  Dist[x][y] != -1) 
                rezult++;
            
        }
                    
      
        return rezult;
    }

    public static void main(String[] args)
    {
        int K = 4;
        int[][] A = new int[5][4];
        A[0][3] = 1;
        A[1][1] = 1;
        A[2][2] = 1;
        A[3][0] = 1;
        
        int s = 0;
        s = solution( K ,  A );
       
        System.out.println("The number of empty cells at a distance of at most " + K + " to every house is = " + s);
        
        K = 2;
        int[][] B = new int[3][4];
        B[1][2] = 1;
        B[2][0] = 1;
        B[2][3] = 1;
        
        s = solution( K ,  B );
       
        System.out.println("The number of empty cells at a distance of at most " + K + " to every house is = " + s);
        
        
        K = 1;
        int[][] C = new int[2][2];
        C[0][1] = 1;
       
        
        s = solution( K ,  C );
       
       System.out.println("The number of empty cells at a distance of at most " + K + " to every house is = " + s);
          
          
        K = 2;
        int[][] D = new int[10][10];
        D[0][1] = 1;
       
        
        s = solution( K ,  D );
       
        System.out.println("The number of empty cells at a distance of at most " + K + " to every house is = " + s);
       
    }

}
