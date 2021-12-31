import java.io.*;
import java.util.*;
class Exception2
{
 public static void main(String args[])
 {
try{
 String str="abcd";
 System.out.println(str.charAt(0));
 }
 catch(StringIndexOutOfBoundsException e)
 {
 System.out.println(e);
}
System.out.println("janu");
}
}

OUTPUT:

C:\526\New folder>java Exception2.java
a
janu