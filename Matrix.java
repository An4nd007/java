import java.util.Scanner;
public class Matrix 
{
        public static void main(String args[])
        {
            int row, col,k,l;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            row = s.nextInt();
            System.out.println("Enter the number columns");
            col = s.nextInt();
            int mat[][] = new int[row][col];
            System.out.println("Enter the elements of Matrix");
            for ( k= 0 ; k < row ; k++ )
            {
                for ( l= 0 ; l < col ;l++ )
                {
                    mat[k][l] = s.nextInt();
                }
            } 
            System.out.println("Matrix");
            System.out.println("---------");
            for ( k= 0 ; k < row ; k++ )
            {
                for ( l= 0 ; l < col ;l++ )
                {
                    System.out.print(mat[k][l]+"\t");
                }
                System.out.println();
            }   
        } 
    
}
