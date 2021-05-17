import java.util.*;

public class spiral {
   
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        System.out.println("enter elements-");
        int [][]arr=new int[m][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        // we treat this spiral in terms of boxes inside boxes 
        // minimum row & col and maximum row & col
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int tne=n*m; //total no. of elements
        int count=0; 
        
        while(count<tne)
        {

            //left wall
            // count<tne is applied because we dont know that the last box will have all  walls or not 
            for(int i=minr,j=minc;i<=maxr && count<tne;i++)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
        //bottom wall
            for(int j=minc,i=maxr;j<=maxc && count<tne;j++)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
        //rigth wall
            for(int i=maxr,j=maxc;i>=minr && count<tne;i--)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

        //top wall
            for(int j=maxc,i=minr;j>=minc && count<tne;j--)
            {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;

        }
    }
}
