import java.util.Scanner;
public class Main
{  
public static void main(String args[])  
{  
int n ;
Scanner inp = new Scanner(System.in);
n = inp.nextInt();
if(n%2==0 && n>1)
    n=n-1;
for (int i=0; i<n; i++)  
{
    if(i==n-1)
      System.out.print(2*i+1);  
    else
      System.out.print(2*i+1+ ", ");  
}  
}  
} 
