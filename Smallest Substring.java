import java.io.*;
import java.util.*;

class main {
public static void main (String[] args) 
{
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   s=s.replaceAll("\\s", "");
   int l=s.length();
   int c=1,max=1,p=-1;
   int a[]=new int[256];
   Arrays.fill(a,-1);
   a[s.charAt(0)]=0;
for(int i=1;i<l;i++)
{
   p=a[s.charAt(i)];
   if (p==-1||i-c>p) 
   {
                c++;
   }
    else 
    { 
        if (c>max) 
        {
            max=c; 
        }
        c=i-p; 
    } 
     a[s.charAt(i)]=i;
}
if (c>max) 
     max=c; 
  
System.out.println(max); 

}
}
