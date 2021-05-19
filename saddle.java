import java.util.*;

public class saddle {

    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("enter=");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        //saddle point- 
        // there can be only 1 saddle point in the matrix or there is no saddle point
        for(int i=0;i<arr.length;i++)
        {
            int svj=0;  // treating smallest value of j as (0,0) index 
            for(int j=0;j<arr[0].length;j++) // searching in column for smallest value (in 1st row)
            {
                if(arr[i][j]<arr[i][svj])
                {
                    svj=j;
                }
            }

            // since we got the smallest element in row 
            //now finding the largest element in that column 
            //that means searching every row for the maximum
            //arr[i][svj] is fixed ,comparing with evry row i.e k 
            boolean flag =true;
            for(int k=0;k<arr.length;k++)  //searching every row for maximum
            {
                if(arr[k][svj]>arr[i][svj])  
                {
                    flag =false;
                    break;
                }
                
            }
            if(flag==true)
            {
                System.out.println("saddle point is -"+ arr[i][svj]);
            }

        }

        System.out.println("Invalid input");
    }
    
}
