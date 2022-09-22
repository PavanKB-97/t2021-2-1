import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{  
public static void main(String args[])  
{  
int n=0 , two=0 , three=0 , four =0, five=0 , six=0 , seven=0 , eight=0 , nine=0 ;
Scanner sc = new Scanner(System.in);
System.out.println("Enter / character to close");
ArrayList<Integer> mylist = new ArrayList<Integer>();
while (sc.hasNextInt()) {
    int i = sc.nextInt();
    mylist.add(i);
}

    for (int i = 0; i < mylist.size(); i++){      
        if(mylist.get(i)%2 == 0)
            two+=1;
        if(mylist.get(i)%3 == 0)
            three+=1;
        if(mylist.get(i)%4 == 0)
            four+=1;
        if(mylist.get(i)%5 == 0)
            five+=1;
        if(mylist.get(i)%6 == 0)
            six+=1;
        if(mylist.get(i)%7 == 0)
            seven+=1;
        if(mylist.get(i)%8 == 0)
            eight+=1;
        if(mylist.get(i)%9 == 0)
            nine+=1;
}  

System.out.print("{ 1:"+mylist.size()+", 2:"+two+", 3:"+three+", 4:"+four+", 5:"+five
+", 6:"+six+", 7:"+seven+", 8:"+eight+", 9:"+nine+"}");
   
}  
} 
