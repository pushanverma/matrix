import java.util.*;

public class operations 
{
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        int m =scn.nextInt();
        int n =scn.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("Enter elements->");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        
        System.out.println("\nEnter your choice of matrix operations-");
        System.out.println("1.sum of all matrix elements\n2.sum of individual arrays\n3.Diffrence of two individual arrays");
        System.out.println("4.Sum of leading diagonal elements\n5.Sum of trailing diagonals\n6.Sum of Transpose of matrix\n7.Sum of Upper triangle elements\n8.Sum of Lower triangle elements.");
        

    String ch1;

    do
{
    System.out.println("\n\nEnter your choice-->");
    String ch=scn.next();       
        switch(ch)
        {
            case "1":
                    int sum =0;
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            sum+=arr[i][j];
                        }
                    }
                    System.out.println("sum of all elements -"+sum); 
                      break;  

            case "2":System.out.println("enter second array-");
                    int [][]arr2=new int[m][n];
                    int [][]arr3=new int[m][n];
                    //entering 2nd array-
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            arr2[i][j]=scn.nextInt();
                        }
                    }
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            arr3[i][j]=arr[i][j]+arr2[i][j];
                        }
                    }
                    System.out.println("Sum of Individual arrays is-");
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            System.out.print(arr3[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
            case "3": 
                    int [][]arr2o=new int[m][n];
                    int [][]arr3o=new int[m][n];
                    //entering 2nd array-
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            arr2o[i][j]=scn.nextInt();
                        }
                    }
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            arr3o[i][j]=arr[i][j]-arr2o[i][j];
                        }
                    }
                    System.out.println("Diffrence  of Individual arrays is-");
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            System.out.print(arr3o[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
            case "4":int sum1=0;
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            if(i==j)
                            {
                                sum1+=arr[i][j];
                            }
                        }
                    }
                    System.out.println("\nSum of leading diagonals is -"+sum1);
                    break;

            case "5":int sum2=0;
                    for(int i=0;i<m;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            if(i+j==2)
                            {
                                sum2+=arr[i][j];
                            }
                        }
                    }
                    System.out.println("\nSum of Traiing diagonal is -"+sum2);
                    break;

            case "6":System.out.println("Transpose of matrix-");
                        for(int i=0;i<m;i++)
                        {
                            for(int j=0;j<n;j++)
                            {
                                System.out.print(arr[j][i]);
                            }
                            System.out.println();
                        }
                        break;
            case "7": int sum3=0;
                        for(int i=0;i<m;i++)
                        {
                            for(int j=i;j<n;j++)
                            {
                                sum3+=arr[i][j];
                            }
                        }
                        System.out.println("Sum of upper triangle elements-"+sum3);
                        break;
            case "8": int sum4=0;
                        for(int i=0;i<m;i++)
                        {
                            for(int j=0;j<i;j++)
                            {
                                sum4+=arr[i][j];
                            }
                        }
                        System.out.println("Sum of Lower triangle elements-"+sum4);
                        break;
                

        }
        System.out.println("DO U wanna continue-->(Y/N)");
         ch1=scn.next();
    }while(ch1!="n"||ch1!="N");
}
}
