/* wajp to print the table of number input by the user. */

import java.io.*;
class table
{
public static void main(String args[])
{
Console c=System.console();
int num=Integer.parseInt(c.readLine("enter the number :"));

for(int i=1; i<=10; i++)
{
System.out.print(num*i +" ");
}

}
}