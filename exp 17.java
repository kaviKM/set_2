import java.io.*;
import java.util.*;
import java.net.*;
public class Amstrong
{
public static void main(String args[])
{
int c=0,n,temp;
n=100;
temp=n;
 while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c) 
    {
    System.out.println("armstrong number");   
    }
    else  
    {
    System.out.println("Not armstrong number");   
   }
   }
