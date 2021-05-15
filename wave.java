import java.util.*;

public class wave {

    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        int r,c;
        System.out.println("enter row & col-");
        r=scn.nextInt();
        c=scn.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter ->");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("Printing array-");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Wave Traversal of arrasy is -");
        // wave 
        for(int j=0;j<arr[0].length;j++) // since column is increasing 
        {
            if(j%2==0) // even (0,2,4) rows are increasing 
            {
                for(int i=0;i<arr.length;i++)
                {
                    System.out.println(arr[i][j]);
                }
                
            }
            else   // odd(1,3,5) rows are decreasing
            {
                for(int i=arr.length-1;i>=0;i--)
                {
                    System.out.println(arr[i][j]);
                }
                
            }
        }

    }
    
}
