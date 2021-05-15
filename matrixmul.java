import java.util.*;

public class matrixmul {

    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        int r1,c1,r2,c2;
        
        System.out.println("\nEnter row & col for 1st array -");
        r1=scn.nextInt();
        c1=scn.nextInt();
        System.out.println("enter ->");
        int [][]arr1=new int[r1][c1];

        // r1 can be written as 
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=scn.nextInt();
            }
        }

        System.out.println("\nEnter row & col for 2nd array -");
        r2=scn.nextInt();
        c2=scn.nextInt();
        int [][]arr2=new int[r2][c2];
        System.out.println("enter ->");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                arr2[i][j]=scn.nextInt();
            }
        }
   //logic starts here-
   int [][]arr3=new int[r1][c2];
        if(c1==r2)
        {
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            System.out.println("\nMatrix is ->");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(arr3[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("matrix multiplication cannot be performed.");
        }
    }
    
}
