import java.io.*;
import java.util.*;

public class Solution4 
{

    public static void main(String[] args) 
 {
 
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            System.out.println(A.length()+B.length());
            if(A.compareTo(B)>0)
             {
            System.out.println("yes");
             }
            else
             {
            System.out.println("No");
             }
         
    System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1));
    System.out.println(B.substring(0, 1).toUpperCase()+B.substring(1));
 }

}

OUTPUT:

C:\526>java Solution4
janu hari
8
yes
Janu
Hari