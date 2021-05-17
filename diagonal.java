import java.util.*;

public class diagonal 
{
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        int m,n;
        m=scn.nextInt();
        n=scn.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("enter elements-");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
    // here we see gap diagonally . it increases from 0 to size-1 (upwards)
        for(int g=0;g<arr.length;g++)
        {
            for(int i=0,j=g;j<arr.length;i++,j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}