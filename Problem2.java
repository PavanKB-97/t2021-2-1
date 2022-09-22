import java.util.Scanner;
public class Main
{  
public static void main(String args[])  
{  
int n ;
Scanner inp = new Scanner(System.in);
n = inp.nextInt();
for (int i=0; i<n; i++)  
{
    if(i==n-1)
      System.out.print(2*i+1);  
    else
      System.out.print(2*i+1+ ", ");  
}  
}  
}  
