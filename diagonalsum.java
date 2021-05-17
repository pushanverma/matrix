import java.util.*;

public class diagonalsum 
{

    public static int diagonal(int[][] mat)
    {
        int sum=0;
        int size =mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
                {
                if(i==j || i+j==size)
                    {
                    sum+=mat[i][j];
                    }
                }
        }
        return sum;
    }
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int [][]arr=new int[n][n];
        System.out.println("enter-");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println(diagonal(arr));
        

    }
    
}
