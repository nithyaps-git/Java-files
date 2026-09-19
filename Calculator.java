import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter first number");
       int n1=scan.nextInt();
       System.out.println("Enter second number");
       int n2=scan.nextInt();
       System.out.println("Enter operator(choose +, -, *, /,%)");
       char op=scan.next();
       switch(op)
       {
        case '+':
            { 
                
                int sum=n1+n2;
                System.out.println("Sum is "+sum);
                break;
            }
        case '-':
            {
                int sub=n1-n2;
                System.out.println("Subtraction is "+sub);
                break;
            }
        case '*':
            {
                int mul=n1*n2;
                System.out.println("Multiplication is "+mul);
                break;
            }
        case '/':
            {
                int div=n1/n2;
                System.out.println("Division is "+div);
                break;
            }
        case '%':
            {
                int mod=n1%n2;
                System.out.println("Modulus is "+mod);
                break;
            }
        default:
            {
                System.out.println("Invalid operator");
            }
       }

    }
}
