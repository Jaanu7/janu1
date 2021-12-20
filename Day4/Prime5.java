import java.util.*;
//prime numbers

public class Prime4
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int num =sc.nextInt();
      int i,count=0;
      sc.close();
      for(i=2;i<num;i++)
        {
          if(num%i==0) {
                         count++;
                         break;
            }
       }
       if(count==0)
          System.out.println(num + "Is a Prime");
          else
          System.out.println(num + "Is not a prime");
   }
}

OUTPUT:


29
29 is a prime number
 

33 
33 is NOT a prime number