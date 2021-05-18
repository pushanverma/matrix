import java.util.*;


public class search {

    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("enter -");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("enter element to be searched=");
        int item=scn.nextInt();
        
        int i=0;
        int j=arr[0].length-1;

        while(i<arr.length && j>=0)
        {
            if(item==arr[i][j])
            {
                System.out.println("item found at "+i+","+j);
                return ;
            }
            else if(item<arr[i][j])
            {
                j--;
            }
            else 
            {
                i++;
            }
        }
        System.out.println("element not found");
        
    }
    
}
