import java.io.*;
import java.util.*;
public class Pattern6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=rows;i>0;i--)
        {
        if(i==1 || i==rows ) 
              for(int j=1;j<=i;j++)
              {

                  System.out.print(j+" ");     
              }
        else
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                   System.out.print(j+" ");
                else
                   System.out.print("  ");
            }
        }   
        System.out.println();
        }
    }
}   
    
OUTPUT:

5
1 2 3 4 5
1     4
1   3
1 2
1