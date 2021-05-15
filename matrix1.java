import java.util.*;


public class matrix1
{

    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int m,n;
        m=scn.nextInt();
        n=scn.nextInt();
        int [][]arr=new int[m][n];
        //enter elements-
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        //printing 2d array-
        System.out.println("Printing matrix-");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}