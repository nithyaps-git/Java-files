import java.util.*;
public class Menu
{ 
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Either enter 0 to stop or 1 to continue");
      int n=scan.nextInt();
      if(n==0)
      {
        System.out.println("Exited! bye");
                scan.close();
                return;
      }  
      else if(n==1)
      {
        System.out.println("Enter your marks one by one");
                int marks;
        do
        {
                        marks=scan.nextInt();
            if(marks>=90 && marks<=100)
            {
                System.out.println("This is good");
            }
            else if(marks>=60 && marks<=89)
            {
                System.out.println("This is also good");
            }
            else if(marks>=0 && marks<=59)
            {
                System.out.println("This is good as well");
            }
            
        }while(marks!=0);
        }
        else
        {
            System.out.println("Invalid input. Enter 0 or 1");
      }
      scan.close();
      
    }
}