import java.lang.String;
import java.util.*;
class Stringmethod
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println(str.substring(0));
System.out.println(str.substring(4));
System.out.println(str.substring(2,5));
System.out.println(str.substring(0,7));
System.out.println(str.indexOf("s"));
System.out.println(str.indexOf("m"));
System.out.println(str.indexOf("t",1));
System.out.println(str.indexOf("t",2));
System.out.println(str.lastIndexOf("s"));
System.out.println(str.replace('i','o'));
}
}

/*
Output:
string methods //given output
string methods //substring(0)
ng methods     //substring(4)
rin            //substring(2,5)
string         //substring(0,7)
0              //str.indexOf("s")
7              //str.indexOf("m")
1              //str.indexOf("t",1)
9              //str.indexOf("t",2)
13             //str.lastIndexOf("s")
strong methods //str.replace('i','o')

