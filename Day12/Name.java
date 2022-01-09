import java.io.*;
import java.util.*;
class Name
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] c=str.split("[!@#$%&* ]");
    System.out.println(c.length);
    for(int i=0; i<c.length;i++)
    System.out.println(c[i]);
    }
}


OUTPUT:
C:\526\New folder>java Name.java
my@name$is%janu
4
my
name
is
janu
